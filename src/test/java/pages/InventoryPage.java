package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {
    @FindBy(linkText = "LinkedIn")
    private WebElement linkedinButton;

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public void clickLinkedinButton() {
        linkedinButton.click();
    }

}
