package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HelloAgainDashboardPage {
    private final WebDriver driver; {
    }
    private final By customersDropDown = By.xpath("//a[@class='header-contacts']//span[contains(text(),'Customers')]");
    private final By getCustomers = By.xpath("(//span[contains(text(),'Customers')])[2]");
    private final By viewCustomerDetail = By.xpath("//tbody/tr[1]/td[12]/a[1]/i[1]");
    private final By editCustomerDetail = By.xpath("//span[normalize-space()='Edit']");
    public By customerFirstName = By.xpath("//input[@id='first_name']");
    private final By saveButton = By.xpath("//button[@class='btn btn-success update-button']//span[contains(text(),'Save')]");
    private final By assertFirstNameUpdate = By.xpath("//span[@class='name']");

    public HelloAgainDashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setCustomersDropDown() {
        driver.findElement(customersDropDown).click();
    }
    
    public void clickCustomersLabel() {
        driver.findElement(getCustomers).click();
    }

    public void getGetCustomers() {
        driver.findElement(viewCustomerDetail).click();
    }

    public void setGetCustomers() {
        driver.findElement(editCustomerDetail).click();
    }

    public void updateFirstName(String firstName) {
        driver.findElement(customerFirstName).sendKeys(Keys.COMMAND + "a");
        driver.findElement(customerFirstName).sendKeys(Keys.DELETE);
        driver.findElement(customerFirstName).sendKeys(firstName);
    }

    public void clickSaveButton () {
        driver.findElement(saveButton).click();
    }

    public String checkFirstNameUpdate () {
        return driver.findElement(assertFirstNameUpdate).getText();
    }
}
