package classesForTetsFrame.allPages.pages;

import classesForTetsFrame.allPages.base.BasePage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    private final By shoppingCardBudge = By.xpath("//span[@data-test=\"shopping-cart-badge\"]");
    private final By shoppingCardTitleAfterClick = By.xpath("//span[@class='title']");
    private final By removeButton = By.id("remove-sauce-labs-backpack");
    private final By continueShoppingButton = By.id("continue-shopping");
    private final By checkoutButton = By.id("checkout");
    private final By inventoryItem = By.xpath("//div[@class=\"cart_item\"]");

    // checkout information page
    private final By firstNameInput = By.id("first-name");
    private final By lastNameInput = By.id("last-name");
    private final By zipOrPostalCode = By.id("postal-code");
    private final By continueButton = By.id("continue");

    //checkout finish page
    private final By summaryInfoBlock = By.xpath("//div[@class=\"summary_info\"]");
    private final By paymentInfoValue = By.xpath("//div[@data-test=\"payment-info-value\"]");
    private final By shippingInfoValue = By.xpath("//div[@data-test=\"shipping-info-value\"]");
    private final By subtotalLabel = By.xpath("//div[@data-test=\"subtotal-label\"]");
    private final By taxLabel = By.xpath("//div[@data-test=\"tax-label\"]");
    private final By totalLabel = By.xpath("//div[@data-test=\"total-label\"]");
    private final By finishButton = By.xpath("//button[@class=\"btn btn_action btn_medium cart_button\"]");

    //checkout complete page
    private final By secondaryHeader = By.xpath("//div[@data-test=\"secondary-header\"]");
    private final By completeContainer = By.id("checkout_complete_container");
    private final By backHomeButton = By.id("back-to-products");




    public CheckoutPage checkThatShoppingCardIsClickable(){
        driver.findElement(shoppingCardTitleAfterClick);
        return this;
    }

    public CheckoutPage checkThatCorrectAmountOfProductWasAddToCheckout(String result){
        Assert.assertEquals(driver.findElement(shoppingCardBudge).getText(), result);
        return this;
    }
    public CheckoutPage checkThatCheckoutAmountMarkerIsNoExist(){
        try{
            driver.findElement(shoppingCardBudge);
            Assert.fail("Element is exist");
        } catch (NoSuchElementException elementException){
            Assert.assertTrue(true, "Element not exist");
        }
        return this;
    }
    public CheckoutPage checkThatCheckoutIsComplete(){
        Assert.assertEquals(driver.findElement(secondaryHeader).getText(), "Checkout: Complete!");
        try{
            driver.findElement(completeContainer);
            Assert.assertTrue(true, "Element is exist");
        } catch (NoSuchElementException elementException){
            Assert.fail("Element is not exist");
        }
        return this;
    }

    public CheckoutPage clickRemoveButton(){
        driver.findElement(removeButton).click();
        return this;
    }
    public CheckoutPage clickContinueShoppingButton(){
        driver.findElement(continueShoppingButton).click();
        return this;
    }
    public CheckoutPage checkThatProductsPresentInMainCheckoutPage(int actualAmount){
        List<WebElement> list = driver.findElements(inventoryItem);
        Assert.assertEquals(list.size(), actualAmount);
        return this;
    }

    public CheckoutPage clickCheckoutButton(){
        driver.findElement(checkoutButton).click();
        return this;
    }

    public CheckoutPage fillInformationForBuying(){
        driver.findElement(firstNameInput).sendKeys("test");
        driver.findElement(lastNameInput).sendKeys("test");
        driver.findElement(zipOrPostalCode).sendKeys("test");
        return this;
    }
    public CheckoutPage clickContinueButton(){
        driver.findElement(continueButton).click();
        return this;
    }
    public CheckoutPage clickFinishButton(){
        driver.findElement(finishButton).click();
        return this;
    }

    public CheckoutPage checkInformationBeforeFinishBuy(){
        List<WebElement> list = driver.findElements(summaryInfoBlock);
        Assert.assertEquals(list.size(), 1);
        Assert.assertEquals(driver.findElement(paymentInfoValue).getText(), "SauceCard #31337");
        Assert.assertEquals(driver.findElement(shippingInfoValue).getText(), "Free Pony Express Delivery!");
        Assert.assertEquals(driver.findElement(subtotalLabel).getText(), "Item total: $45.98");
        Assert.assertEquals(driver.findElement(taxLabel).getText(), "Tax: $3.68");
        Assert.assertEquals(driver.findElement(totalLabel).getText(), "Total: $49.66");
        return this;
    }

    public CheckoutPage clickBackHomeButton(){
        driver.findElement(backHomeButton).click();
        return this;
    }
}
