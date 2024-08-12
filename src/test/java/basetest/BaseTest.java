package basetest;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.net.CookieManager;
import java.util.concurrent.TimeUnit;

public class BaseTest {
//    protected GoogleSearchPage searchPage;
protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver
        WebDriver originalDriver = new ChromeDriver();

        // Decorate WebDriver with event listener
        EventReporter eventReporter = new EventReporter();
        driver = new EventFiringDecorator(eventReporter).decorate(originalDriver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goHome();
    }

    @BeforeMethod
    public void goHome() {
//        driver.manage().deleteAllCookies(); // Deletes all the cookies
        driver.get("https://dashboard.helloagain.at/#/login");
        driver.manage().window().maximize(); // This maximize
//        driver.manage().window().setSize(new Dimension(375,812)); // Allows you to use a phone dimension from devtools emulating a phone resolution. The dimension set is from the device selected.
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            TakesScreenshot camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    public CookieManager getCookieManager() {
        return new CookieManager();
    }
}
