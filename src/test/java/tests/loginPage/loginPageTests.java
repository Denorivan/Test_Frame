package tests.loginPage;

import tests.base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static classesForTetsFrame.constants.constant.UrlVariable.LOGIN_PAGE;



public class loginPageTests extends baseTest {
    @Test
    public void checkToLoginCorrectUser(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton()
                .findElementToCheckThatLoginWasSuccessful();
    }

    @Test
    public void checkToLoginLockedUser(){
        String errorMessage = "Epic sadface: Sorry, this user has been locked out.";
        String correctErrorMessage = "Epic sadface: Sorry, this user has been locked out.";
        if (errorMessage.equals(correctErrorMessage)){
        basePage.open(LOGIN_PAGE);
        loginPage
                .fillFormUserByValidLockedUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton()
                .findErrorMessage(errorMessage);
        }else {
            Assert.assertEquals(errorMessage, correctErrorMessage,"Not correct error message");
        }
    }

    @Test
    public void checkToLoginProblemUser(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidProblemUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton()
                .checkThatUserIsProblemUser();
    }

    @Test
    public void checkToLoginPerformanceGlitchUser(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidPerformanceGlitchUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton()
                .findElementToCheckThatLoginWasSuccessful();
    }

    @Test
    public void justPressLoginButton() {
        String errorMessage = "Epic sadface: Username is required";
        String correctErrorMessage = "Epic sadface: Username is required";
        if (errorMessage.equals(correctErrorMessage)) {
            basePage.open(LOGIN_PAGE);
            loginPage
                    .pressLoginsButton()
                    .errorFormIsVisible()
                    .findErrorMessage(errorMessage);
        } else {
            Assert.assertEquals(errorMessage, correctErrorMessage, "Not correct error message");
        }
    }

    @Test
    public void justEnterOnlyUserStandard() {
        String errorMessage = "Epic sadface: Password is required";
        String correctErrorMessage = "Epic sadface: Password is required";
        if (errorMessage.equals(correctErrorMessage)) {
            basePage.open(LOGIN_PAGE);
            loginPage
                    .fillFormUserByValidStandardUserUsername()
                    .pressLoginsButton()
                    .errorFormIsVisible()
                    .findErrorMessage(errorMessage);
        } else {
            Assert.assertEquals(errorMessage, correctErrorMessage, "Not correct error message");
        }
    }

    @Test
    public void checkThatLogoIsPresent(){
        basePage.open(LOGIN_PAGE);
        loginPage
                .findLogo();
    }

    @Test
    public void checkThatLogoLoginWrapperIsPresent(){
        basePage.open(LOGIN_PAGE);
        loginPage
                .findRegistrationForm();
    }

    @Test
    public void checkThatInformationWrapperIsPresent(){
        basePage.open(LOGIN_PAGE);
        loginPage
                .findInformationHelperToLoginForm();
    }

    @Test
    public void checkThatErrorWrapperIsPresent(){
        basePage.open(LOGIN_PAGE);
        loginPage
                .findErrorWrapper();
    }

    @Test
    public void thatErrorMessageCanClosed(){
        basePage.open(LOGIN_PAGE);
        loginPage
                .pressLoginsButton()
                .findAndClickOnCrossInErrorMessageToCloseHim();
    }



}
