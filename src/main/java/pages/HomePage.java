package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private final WebDriver driver;
    private final By enterEmailAddress = By.xpath("//input[@id='email']");
    private final By enterPassword = By.xpath("//input[@id='password']");
    private final By clickSignInButton = By.xpath("//button[@type='submit']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void provideEmailAddress(String password) {
        driver.findElement(enterEmailAddress).sendKeys(password);
    }

    public void providePassword(String email) {
        driver.findElement(enterPassword).sendKeys(email);
    }

    public HelloAgainDashboardPage clickSignIn() {
        driver.findElement(clickSignInButton).click();
        return new HelloAgainDashboardPage(driver);
    }
//    public SignUpPage clickSignUp() {
//        driver.findElement(signUpLink).click();
//        return new SignUpPage(driver);
//    }

    // New method to wait for the redirect page
    public void waitForRedirectPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

        // Adjust the locator based on the actual elements on the redirect page
//        wait.until(ExpectedConditions.presenceOfElementLocated(uniqueElementOnRedirectPage));
    }
}