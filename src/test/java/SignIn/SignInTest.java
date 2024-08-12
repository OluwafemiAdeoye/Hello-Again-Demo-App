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

import static org.testng.Assert.assertEquals;

public class SignInTest extends BaseTest {

    @Test(dataProvider = "dataProvider")
    public void testSignIn(String email, String password, String firstName) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage = new HomePage(driver);
        homePage.waitForRedirectPage();

        homePage.provideEmailAddress(email);
        homePage.providePassword(password);
        homePage.clickSignIn();
        HelloAgainDashboardPage helloAgainDashboardPage = new HelloAgainDashboardPage(driver);
        helloAgainDashboardPage.setCustomersDropDown();
        helloAgainDashboardPage.clickCustomersLabel();
        helloAgainDashboardPage.getGetCustomers();
        helloAgainDashboardPage.setGetCustomers();
        helloAgainDashboardPage.clickSaveButton();
        assertEquals(helloAgainDashboardPage.checkFirstNameUpdate(), "Maximilian Mustermann");
    }

    @DataProvider(name = "dataProvider")
    public Object[][] getData(Method method) throws IOException, org.json.simple.parser.ParseException {
        if (method.getName().equals("testSignIn")) {
            return JsonReader.getJSONData("resources/test-data/TestData.json", "Search Input", 3);
        }
        return null;
    }
}