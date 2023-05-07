package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeOptions;

import static Common.Config.PLATFORM_AND_BROWSER;
import static Constants.Constant.TimeOutVariable.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver(){

        WebDriver driver = null;
        switch (PLATFORM_AND_BROWSER){
            case "win_chrome":{
                System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                break;
            } default:{
                Assert.fail("Incorrect platform for browser name: " + PLATFORM_AND_BROWSER);
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }
}
