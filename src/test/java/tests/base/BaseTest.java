package tests.base;

import classesForTetsFrame.allPages.base.BasePage;
import classesForTetsFrame.allPages.pages.CheckoutPage;
import classesForTetsFrame.allPages.pages.InventoryPage;
import classesForTetsFrame.allPages.pages.LoginPage;
import classesForTetsFrame.common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import tests.checkoutPage.CheckoutPageTest;

import static classesForTetsFrame.common.Config.CLEAR_STORAGE;
import static classesForTetsFrame.common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected InventoryPage inventoryPage = new InventoryPage(driver);
    protected CheckoutPage checkoutPageTest = new CheckoutPage(driver);

    @AfterTest
    public void clearCookLocalStorage(){
        if (CLEAR_STORAGE){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

//    @AfterSuite
//    public void close(){
//        if (HOLD_BROWSER_OPEN){
//            driver.close();
//            driver.quit();
//        }
//    }
}
