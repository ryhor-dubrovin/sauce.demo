import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoTest {

    WebDriver driver;
    // page https://www.saucedemo.com/
    WebElement loginButton = driver.findElement(By.className("submit-button btn_action"));

    //page https://www.saucedemo.com/inventory.html
    WebElement buttonAddSauceLabsBikeLight = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
    WebElement buttonAddSauceLabsBoltTShirt = driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt"));
    WebElement title = driver.findElement(By.tagName("title"));
    WebElement logoutButton = driver.findElement(By.linkText("Logout"));
    WebElement allItemsButton = driver.findElement(By.partialLinkText("All"));
    WebElement buttonAddSauceLabsBackpack = driver.findElement(By.xpath("//*[@data-test='add-to-cart-sauce-labs-backpack']"));
    WebElement aboutButton = driver.findElement(By.xpath("//a[text()='About']"));
    WebElement buttonAddSauceLabsFleeceJacket = driver.findElement(By.xpath("//button[contains(@data-test,'fleece-jacket')]"));
    WebElement resetAppStateButton = driver.findElement(By.xpath("//a[contains(text(),'Reset')]"));
    WebElement linkSauceLabsBikeLight = driver.findElement(By.xpath("//div[@class='inventory_item_price']/following::a/div[contains(text(),'Bike')]"));
    WebElement backpackPrice = driver.findElement(By.xpath("//div[contains(text(),'$')] and following::div[contains(@class,'Backpack')]")); // не робе

}
