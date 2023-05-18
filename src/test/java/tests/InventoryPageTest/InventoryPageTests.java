package tests.InventoryPageTest;

import tests.base.BaseTest;
import org.testng.annotations.Test;

import static classesForTetsFrame.constants.Constant.UrlVariable.LOGIN_PAGE;

public class InventoryPageTests extends BaseTest {

    @Test
    public void checkThatLogoIsPresentOnPage(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();

        inventoryPage
                .checkThatLogoIsPresentOnPage();
    }


    @Test
    public void checkThatAllProductsCardIsPresent(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();

        inventoryPage
                .checkAmountOfProductsCards(6);
    }

    @Test
    public void checkThatAllCardsHavePrice(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatAllCardsHavePrice();
    }

    @Test
    public void checkThatAllCardsHaveName(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatAllCardsHaveName();
    }

    @Test
    public void checkThatAllCardsHaveDescribe(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatAllCardsHaveDescribe();
    }

    @Test
    public void checkThatAllCardsHaveAddButton(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatAllCardsHaveAddButton();
    }

    @Test
    public void checkThatAllCardsHaveAddIconImg(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatAllCardsHaveAddIconImg();
    }

    @Test
    public void checkThatAllCardsHaveItemDescription(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatAllCardsHaveItemDescription();
    }

    @Test
    public void checkThatSortContainerIsPresent(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatSortContainerIsPresent();
    }


    @Test
    public void checkThatSortContainerIsWorkZA(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatSortContainerIsWorkZA();
    }


    @Test
    public void checkThatSortContainerIsWorkLowToHigh(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatSortContainerIsWorkLowToHigh();
    }

    @Test
    public void checkThatSortContainerIsWorkHighToLow(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatSortContainerIsWorkHighToLow();
    }

    @Test
    public void checkThatShoppingCardIsClickable(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatShoppingCardIsClickable();
    }

    @Test
    public void checkThatSortContainerIsWorkAZ(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatSortContainerIsWorkAZ();
    }

    @Test
    public void clickAndCheckButtonMenu(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .clickAndCheckButtonMenu();
    }

    @Test
    public void checkThatAboutIsWorking(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatAboutIsWorking();
    }

    @Test
    public void clickOnAllItemsButton(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .clickOnAllItemsButton();
    }

    @Test
    public void checkThatResetAppStateIsWorking(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatResetAppStateIsWorking();
    }

    @Test
    public void checkThatLogoutIsWorking(){
        basePage.open(LOGIN_PAGE);

        loginPage
                .fillFormUserByValidStandardUserUsername()
                .fillFormPasswordToAllUsersByValidStandardPassword()
                .pressLoginsButton();
        inventoryPage
                .checkThatLogoutIsWorking();
    }


}
