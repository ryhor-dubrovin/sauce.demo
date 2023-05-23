package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LinkedInPage;
import pages.LoginPage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SauceDemoTest extends BaseTest {
    @Test
    private void openLinkedinTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openSauceDemoPage();
        loginPage.standardUserLogin();

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.clickLinkedinButton();
        Set<String> windows = driver.getWindowHandles();
        for(String handle: windows) {
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if (title.equals("Sauce Labs | LinkedIn")) {
                break;
            }
        }
        LinkedInPage linkedInPage = new LinkedInPage(driver);
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(linkedInPage.getLinkedinIcon()));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}