package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    private WebElement userNameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openSauceDemoPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void standardUserLogin() {
        userNameField.sendKeys(System.getProperty("username"));
        passwordField.sendKeys(System.getProperty("password"));
        loginButton.click();
    }
}
