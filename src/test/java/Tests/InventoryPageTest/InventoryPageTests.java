package Tests.InventoryPageTest;

import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import static Constants.Constant.UrlVariable.LOGIN_PAGE;

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

}
