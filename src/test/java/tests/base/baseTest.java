package tests.base;

import allPages.base.basePage;
import allPages.pages.inventoryPage;
import allPages.pages.loginPage;
import common.commonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import static common.config.CLEAR_STORAGE;
import static common.config.HOLD_BROWSER_OPEN;

public class baseTest {
    protected WebDriver driver = commonActions.createDriver();
    protected allPages.base.basePage basePage = new basePage(driver);
    protected allPages.pages.loginPage loginPage = new loginPage(driver);
    protected allPages.pages.inventoryPage inventoryPage = new inventoryPage(driver);

    @AfterTest
    public void clearCookLocalStorage(){
        if (CLEAR_STORAGE){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite
    public void close(){
        if (HOLD_BROWSER_OPEN){
            driver.close();
            driver.quit();
        }
    }
}
