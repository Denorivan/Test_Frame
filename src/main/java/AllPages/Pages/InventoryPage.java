package AllPages.Pages;

import AllPages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class InventoryPage extends BasePage {
    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    private final By logo = By.xpath("//*[@id='header_container']/div[1]/div[2]/div");
    private final By card = By.xpath("//div[@class='inventory_item']");
    private final By nestedPriceFromCard = By.xpath(".//div[@class='inventory_item_price']");
    private final By nestedNameFromCard = By.xpath(".//div[@class='inventory_item_name']");
    private final By nestedDescribeFromCard = By.xpath(".//div[@class='inventory_item_desc']");
    private final By nestedAddButtonFromCard = By.xpath(".//button[@class='btn btn_primary btn_small btn_inventory']");
    private final By nestedAddIconImgFromCard = By.xpath(".//img[@class='inventory_item_img']");
    private final By nestedItemDescriptionFromCard = By.xpath(".//div[@class='inventory_item_description']");
    private final By sortContainer = By.xpath("//select[@class='product_sort_container']");



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

}
