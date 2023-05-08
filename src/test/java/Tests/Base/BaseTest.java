package Tests.Base;

import AllPages.Base.BasePage;
import AllPages.Pages.InventoryPage;
import AllPages.Pages.LoginPage;
import Common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import static Common.Config.CLEAR_STORAGE;
import static Common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected InventoryPage inventoryPage = new InventoryPage(driver);

    @AfterTest
    public void clearCookLocalStorage(){
        if (CLEAR_STORAGE){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

   /* @AfterSuite
    public void close(){
        if (HOLD_BROWSER_OPEN){
            driver.close();
            driver.quit();
        }
    }*/
}
