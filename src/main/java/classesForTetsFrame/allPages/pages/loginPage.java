package classesForTetsFrame.allPages.pages;

import classesForTetsFrame.allPages.base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static classesForTetsFrame.constants.constant.passwordVariableToLoginUsers.*;
import static classesForTetsFrame.constants.constant.UserVariableForLogin.*;
public class loginPage extends basePage {
    public loginPage(WebDriver driver) {
        super(driver);
    }

    private final By loginButton = By.id("login-button");
    private final By usernameFieldInLoginForm = By.id("user-name");
    private final By passwordFieldInLoginForm = By.id("password");
    private final By errorMessageContainer = By.xpath("//div[@class='error-message-container']");
    private final By errorMessage = By.xpath("//h3[@data-test='error']");
    private final By crossInErrorMessageToCloseHim = By.xpath("//button[@class='error-button']");
    private final By blockedUserMessage = By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3");
    private final By checkThatUserIsProblem = By.xpath("//img[@alt='Sauce Labs Backpack' and @src='/static/media/sl-404.168b1cce.jpg']");
    private final By logo = By.xpath("//div[@class='login_logo']");
    private final By logoInNextPageForCheckSuccessfulLogin = By.xpath("//div[@class='app_logo']");
    private final By registrationForm = By.xpath("//div[@class='login_wrapper-inner']");
    private final By informationToLogin = By.xpath("//div[@class='login_credentials_wrap-inner']");


    public loginPage fillFormUserByValidStandardUserUsername(){
        driver.findElement(usernameFieldInLoginForm).sendKeys(enterStandardUsername);
        return  this;
    }
    public loginPage fillFormUserByValidLockedUserUsername(){
        driver.findElement(usernameFieldInLoginForm).sendKeys(enterLockedOutUsername);
        return  this;
    }

    public loginPage fillFormUserByValidProblemUserUsername(){
        driver.findElement(usernameFieldInLoginForm).sendKeys(enterProblemUsername);
        return  this;
    }

    public loginPage fillFormUserByValidPerformanceGlitchUsername(){
        driver.findElement(usernameFieldInLoginForm).sendKeys(enterPerformanceGlitchUser);
        return  this;
    }

    public loginPage fillFormPasswordToAllUsersByValidStandardPassword(){
        driver.findElement(passwordFieldInLoginForm).sendKeys(passwordForAllUsers);
        return  this;
    }


    public loginPage pressLoginsButton(){
        driver.findElement(loginButton).click();
        return this;
    }

    public loginPage findElementToCheckThatLoginWasSuccessful(){
        driver.findElement(logoInNextPageForCheckSuccessfulLogin);
        return this;

    }

    public loginPage findErrorMessage(String message){

        String findMessage = driver.findElement(blockedUserMessage).getText();
        if (message.equals(findMessage)){
            return this;
        }else {
            return null;
        }
    }

    public loginPage checkThatUserIsProblemUser(){
        driver.findElement(checkThatUserIsProblem);
        return this;
    }


    public loginPage errorFormIsVisible(){
        driver.findElement(errorMessage).getText();
        return this;
    }

    public loginPage findLogo(){
        driver.findElement(logo);
        return this;
    }

    public loginPage findErrorWrapper(){
        driver.findElement(errorMessageContainer);
        return this;
    }

    public loginPage findRegistrationForm(){
        driver.findElement(registrationForm);
        return this;
    }

    public loginPage findInformationHelperToLoginForm(){
        driver.findElement(informationToLogin);
        return this;
    }

    public loginPage findAndClickOnCrossInErrorMessageToCloseHim(){
        driver.findElement(crossInErrorMessageToCloseHim).click();
        return this;
    }

}
