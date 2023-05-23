package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedInPage extends BasePage {
    @FindBy(xpath = "//a/icon/*[local-name() = 'svg']/*[local-name() = 'g'][@class='linkedin-text']")
    private WebElement linkedinIcon;

    public LinkedInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLinkedinIcon() {
        return linkedinIcon;
    }
}
