package basetest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
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
import utils.ExtentManager;
import utils.WindowManager;

import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected static ExtentReports extent;
    protected ExtentTest extentTest;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        // Initialize ExtentReports
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("resources/Reporter/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Java Version", System.getProperty("java.version"));

        WebDriver webDriver = new ChromeDriver();

        EventReporter eventReporter = new EventReporter();
        driver = new EventFiringDecorator<>(eventReporter).decorate(webDriver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        goHome();
    }

    @BeforeMethod
    public void initializeTest(Method method) {
        // Initialize extentTest with the name of the current test method
        extentTest = extent.createTest(method.getName());
    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://dashboard.helloagain.at/#/login");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        if (extent != null) {
            extent.flush();
        }
    }

    public String captureScreenshot(WebDriver driver, String screenshotName) {
        String screenshotPath = System.getProperty("user.dir") + "resources/screenshots/" + screenshotName + ".jpeg";
        try {
            TakesScreenshot camera = (TakesScreenshot) driver;
            File source = camera.getScreenshotAs(OutputType.FILE);
            File destination = new File(screenshotPath);
            Files.copy(source.toPath().toFile(), destination.toPath().toFile());
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot: " + e.getMessage());
        }
        return screenshotPath;
    }

    @AfterMethod
    public void tearDownTest(ITestResult result) {
        if (extentTest == null) {
            System.out.println("extentTest is null!");
        }

        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotPath = captureScreenshot(driver, result.getName());
            extentTest.fail("Test failed: " + result.getThrowable(),
                    MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        } else if (result.getStatus() == ITestResult.SKIP) {
            extentTest.skip("Test skipped: " + result.getThrowable());
        } else {
            extentTest.pass("Test passed");
        }

        ExtentManager.flushReports();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }
}