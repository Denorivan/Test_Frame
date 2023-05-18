package tests.base;

import classesForTetsFrame.allPages.base.basePage;
import classesForTetsFrame.allPages.pages.inventoryPage;
import classesForTetsFrame.allPages.pages.loginPage;
import classesForTetsFrame.common.commonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import static classesForTetsFrame.common.config.CLEAR_STORAGE;
import static classesForTetsFrame.common.config.HOLD_BROWSER_OPEN;

public class baseTest {
    protected WebDriver driver = commonActions.createDriver();
    protected classesForTetsFrame.allPages.base.basePage basePage = new basePage(driver);
    protected classesForTetsFrame.allPages.pages.loginPage loginPage = new loginPage(driver);
    protected classesForTetsFrame.allPages.pages.inventoryPage inventoryPage = new inventoryPage(driver);

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
