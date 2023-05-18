package classesForTetsFrame.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeOptions;

import static classesForTetsFrame.constants.Constant.TimeOutVariable.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver(){

        WebDriver driver = null;
        switch (Config.PLATFORM_AND_BROWSER){
            case "win_chrome":{
                System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                break;
            } default:{
                Assert.fail("Incorrect platform for browser name: " + Config.PLATFORM_AND_BROWSER);
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }
}
