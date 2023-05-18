package allPages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.constant.TimeOutVariable.EXPLICIT_WAIT;

public class basePage {

    protected WebDriver driver;

    public basePage(WebDriver driver){
        this.driver=driver;
    }

    public void open(String url){
        driver.get(url);
    }


    public WebElement waitElementIsVisible (WebElement element){
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT))
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }


}