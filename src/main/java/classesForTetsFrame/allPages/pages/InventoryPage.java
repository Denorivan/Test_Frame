package classesForTetsFrame.allPages.pages;

import classesForTetsFrame.allPages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class InventoryPage extends BasePage {
    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    private final By logo = By.xpath("//*[@id='header_container']/div[1]/div[2]/div");
    private final By card = By.xpath("//div[@class='inventory_item']");
    private final By nestedPriceFromCard = By.xpath(".//div[@class='inventory_item_price']");
    private final By nestedNameFromCard = By.xpath(".//div[@data-test=\"inventory-item-name\"]");
    private final By nameFromCard = By.xpath("//div[@class='inventory_item_name ']");
    private final By priceFromCard = By.xpath("//div[@class='inventory_item_price']");
    private final By nestedDescribeFromCard = By.xpath(".//div[@class='inventory_item_desc']");
    private final By nestedAddButtonFromCard = By.xpath(".//button[contains(text(), 'Add to cart')]");
    private final By nestedAddButtonFromCardSecond = By.xpath("(.//button[contains(text(), 'Add to cart')])[2]");
    private final By nestedAddIconImgFromCard = By.xpath(".//img[@class='inventory_item_img']");
    private final By nestedItemDescriptionFromCard = By.xpath(".//div[@class='inventory_item_description']");
    private final By sortContainer = By.xpath("//select[@class='product_sort_container']");
    private final By sortContainerZA = By.xpath("//option[@value='za']");
    private final By sortContainerAZ = By.xpath("//option[@value='az']");
    private final By sortContainerLowToHigh = By.xpath("//option[@value='lohi']");
    private final By sortContainerHighToLow = By.xpath("//option[@value='hilo']");
    private final By shoppingCard = By.xpath("//div[@class='shopping_cart_container']");
    private final By shoppingCardTitleAfterClick = By.xpath("//span[@class='title']");
    private final By buttonMenuLeft = By.id("react-burger-menu-btn");
    private final By buttonMenuLeftAfterClick = By.xpath("//div[@class='bm-menu']");
    private final By allItems = By.id("inventory_sidebar_link");
    private final By about = By.id("about_sidebar_link");
    private final By logout = By.id("logout_sidebar_link");
    private final By resetAppState = By.id("reset_sidebar_link");



    public InventoryPage checkAmountOfProductsCards (int expectedCards){
        int countCards = driver.findElements(card).size();

        System.out.println(countCards);
        Assert.assertEquals(countCards, expectedCards);
        return this;
    }

    public InventoryPage checkThatLogoIsPresentOnPage(){
        driver.findElement(logo);
        return this;
    }

    public InventoryPage checkThatAllCardsHavePrice() {
        List<WebElement> elements = driver.findElements(card);
        for (WebElement oneItem : elements) {
            WebElement find = oneItem.findElement(nestedPriceFromCard);
            System.out.println(find.getText());
        }
        return this;
    }

    public InventoryPage checkThatAllCardsHaveName() {
        List<WebElement> elements = driver.findElements(card);
        for (WebElement oneItem : elements) {
            WebElement find = oneItem.findElement(nestedNameFromCard);
        }
        return this;
    }

    public InventoryPage checkThatAllCardsHaveDescribe() {
        List<WebElement> elements = driver.findElements(card);
        for (WebElement oneItem : elements) {
            WebElement find = oneItem.findElement(nestedDescribeFromCard);
        }
        return this;
    }


    public InventoryPage checkThatAllCardsHaveAddButton() {
        List<WebElement> elements = driver.findElements(card);
        for (WebElement oneItem : elements) {
            WebElement find = oneItem.findElement(nestedAddButtonFromCard);
        }
        return this;
    }

    public InventoryPage clickOnFirstElementToAddProductInCheckout(){
        driver.findElement(nestedAddButtonFromCard).click();
        return this;
    }
    public InventoryPage clickOnSecondElementToAddProductInCheckout(){
        driver.findElement(nestedAddButtonFromCardSecond).click();
        return this;
    }

    public InventoryPage checkThatAllCardsHaveAddIconImg() {
        List<WebElement> elements = driver.findElements(card);
        for (WebElement oneItem : elements) {
            WebElement find = oneItem.findElement(nestedAddIconImgFromCard);
        }
        return this;
    }

    public InventoryPage checkThatAllCardsHaveItemDescription() {
        List<WebElement> elements = driver.findElements(card);
        for (WebElement oneItem : elements) {
            WebElement find = oneItem.findElement(nestedItemDescriptionFromCard);
        }
        return this;
    }

    public InventoryPage checkThatSortContainerIsPresent(){
        driver.findElement(sortContainer);
        return this;
    }

    public InventoryPage checkThatSortContainerIsWorkZA(){
        ArrayList<String> expectedTextValueName = new ArrayList<>();
        expectedTextValueName.add("Test.allTheThings() T-Shirt (Red)");
        expectedTextValueName.add("Sauce Labs Onesie");
        expectedTextValueName.add("Sauce Labs Fleece Jacket");
        expectedTextValueName.add("Sauce Labs Bolt T-Shirt");
        expectedTextValueName.add("Sauce Labs Bike Light");
        expectedTextValueName.add("Sauce Labs Backpack");


        driver.findElement(sortContainer).click();
        driver.findElement(sortContainerZA).click();

        List<WebElement> cardsName = driver.findElements(nameFromCard);
        ArrayList<String> currentTextValueName = new ArrayList<>();
        for (WebElement element : cardsName){
            currentTextValueName.add(element.getText());
            System.out.println(element.getText());
        }
        if (currentTextValueName.equals(expectedTextValueName)){
            Assert.assertEquals(expectedTextValueName, currentTextValueName, "Correct up to Z - A");
        } else {
            Assert.fail("Incorrect subsequence by name of product");
        }
        return this;
    }

    public InventoryPage checkThatSortContainerIsWorkLowToHigh(){
        ArrayList<String> expectedTextValuePriceLowToHigh = new ArrayList<>();
        expectedTextValuePriceLowToHigh.add("$7.99");
        expectedTextValuePriceLowToHigh.add("$9.99");
        expectedTextValuePriceLowToHigh.add("$15.99");
        expectedTextValuePriceLowToHigh.add("$15.99");
        expectedTextValuePriceLowToHigh.add("$29.99");
        expectedTextValuePriceLowToHigh.add("$49.99");


        driver.findElement(sortContainer).click();
        driver.findElement(sortContainerLowToHigh).click();

        List<WebElement> cardsName = driver.findElements(priceFromCard);
        ArrayList<String> currentTextValueLowToHigh = new ArrayList<>();
        for (WebElement element : cardsName){
            currentTextValueLowToHigh.add(element.getText());
            System.out.println(element.getText());
        }

        if (currentTextValueLowToHigh.equals(expectedTextValuePriceLowToHigh)){
            Assert.assertEquals(expectedTextValuePriceLowToHigh, currentTextValueLowToHigh, "Correct price subsequence");
        } else {
            Assert.fail("Incorrect subsequence by price of product");
        }
        return this;
    }

    public InventoryPage checkThatSortContainerIsWorkHighToLow(){
        ArrayList<String> expectedTextValuePriceHighToLow = new ArrayList<>();
        expectedTextValuePriceHighToLow.add("$49.99");
        expectedTextValuePriceHighToLow.add("$29.99");
        expectedTextValuePriceHighToLow.add("$15.99");
        expectedTextValuePriceHighToLow.add("$15.99");
        expectedTextValuePriceHighToLow.add("$9.99");
        expectedTextValuePriceHighToLow.add("$7.99");
        

        driver.findElement(sortContainer).click();
        driver.findElement(sortContainerHighToLow).click();

        List<WebElement> cardsName = driver.findElements(priceFromCard);
        ArrayList<String> currentTextValuePriceHighToLow = new ArrayList<>();
        for (WebElement element : cardsName){
            currentTextValuePriceHighToLow.add(element.getText());
            System.out.println(element.getText());
        }

        if (currentTextValuePriceHighToLow.equals(expectedTextValuePriceHighToLow)){
            Assert.assertEquals(expectedTextValuePriceHighToLow, currentTextValuePriceHighToLow, "Correct price subsequence");
        } else {
            Assert.fail("Incorrect subsequence by price of product");
        }
        return this;
    }

    public InventoryPage clickOnShoppingCard(){
        driver.findElement(shoppingCard).click();
        return this;
    }

    public InventoryPage checkThatSortContainerIsWorkAZ(){
        ArrayList<String> expectedTextValueName = new ArrayList<>();
        expectedTextValueName.add("Sauce Labs Backpack");
        expectedTextValueName.add("Sauce Labs Bike Light");
        expectedTextValueName.add("Sauce Labs Bolt T-Shirt");
        expectedTextValueName.add("Sauce Labs Fleece Jacket");
        expectedTextValueName.add("Sauce Labs Onesie");
        expectedTextValueName.add("Test.allTheThings() T-Shirt (Red)");

        driver.findElement(sortContainer).click();
        driver.findElement(sortContainerAZ).click();

        List<WebElement> cardsName = driver.findElements(nameFromCard);
        ArrayList<String> currentTextValueName = new ArrayList<>();
        for (WebElement element : cardsName){
            currentTextValueName.add(element.getText());
            System.out.println(element.getText());
        }

        if (currentTextValueName.equals(expectedTextValueName)){
            Assert.assertEquals(expectedTextValueName, currentTextValueName, "Correct up to Z - A");
        } else {
            Assert.fail("Incorrect subsequence by name of product");
        }
        return this;
    }

    public InventoryPage clickAndCheckButtonMenu (){
        driver.findElement(buttonMenuLeft).click();
        driver.findElement(buttonMenuLeftAfterClick);
        return this;
    }

    public InventoryPage clickOnAllItemsButton(){
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        driver.findElement(buttonMenuLeft).click();
        driver.findElement(allItems).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, currentUrl, "Correct redirect");

        return this;
    }

    public InventoryPage checkThatAboutIsWorking(){
        String expectedUrl = "https://saucelabs.com/";
        driver.findElement(buttonMenuLeft).click();
        driver.findElement(about).click();
        String currentUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, currentUrl, "Correct redirect");
        return this;
    }

    public InventoryPage checkThatResetAppStateIsWorking (){
        String expectedUrl = driver.getCurrentUrl();
        driver.findElement(buttonMenuLeft).click();
        driver.findElement(resetAppState).click();
        String currentUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, currentUrl, "Correct redirect");
        return this;
    }

    public InventoryPage checkThatLogoutIsWorking(){
        String expectedUrl = "https://www.saucedemo.com/";
        driver.findElement(buttonMenuLeft).click();
        driver.findElement(logout).click();
        String currentUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, currentUrl, "Correct redirect");
        return this;
    }

}
