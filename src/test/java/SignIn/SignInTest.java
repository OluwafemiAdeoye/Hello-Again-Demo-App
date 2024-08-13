package SignIn;

import basetest.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HelloAgainDashboardPage;
import pages.HomePage;
import utils.JsonReader;

import java.io.IOException;
import java.lang.reflect.Method;

public class SignInTest extends BaseTest {

    @Test(dataProvider = "dataProvider")
    public void testSignIn(String email, String password, String expectedFirstName) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        extentTest = extent.createTest("testSignIn - " + email);

        try {
            extentTest.info("Navigating to Home Page");
            homePage = new HomePage(driver);
            homePage.waitForRedirectPage();

            extentTest.info("Entering email: " + email);
            homePage.provideEmailAddress(email);

            extentTest.info("Entering password.");
            homePage.providePassword(password);

            extentTest.info("Clicking Sign In.");
            homePage.clickSignIn();

            extentTest.info("Navigating to Dashboard.");
            HelloAgainDashboardPage helloAgainDashboardPage = new HelloAgainDashboardPage(driver);
            helloAgainDashboardPage.setCustomersDropDown();
            helloAgainDashboardPage.clickCustomersLabel();
            helloAgainDashboardPage.getGetCustomers();
            helloAgainDashboardPage.setGetCustomers();
            helloAgainDashboardPage.updateFirstName(expectedFirstName);
            helloAgainDashboardPage.clickSaveButton();

            // Get the Name from the dashboard
            String fullName = helloAgainDashboardPage.checkFirstNameUpdate();
            String firstName = fullName.split(" ")[0]; // Extracting the first name

            // Validate that the first name is "Maximilian"
            softAssert.assertEquals(firstName, expectedFirstName, "First name does not match!");

            extentTest.info("Verifying First Name. Expected: " + expectedFirstName + ", Actual: " + firstName);

        } catch (Exception e) {
            extentTest.fail("Test failed due to exception: " + e.getMessage());
            throw e; // Re-throw exception to mark test as failed
        } finally {
            softAssert.assertAll(); // This will collect all soft assertions and report any failures
        }
    }

    @DataProvider(name = "dataProvider")
    public Object[][] getData(Method method) throws IOException, org.json.simple.parser.ParseException {
        if (method.getName().equals("testSignIn")) {
            return JsonReader.getJSONData("resources/test-data/TestData.json", "Search Input", 3);
        }
        return null;
    }
}