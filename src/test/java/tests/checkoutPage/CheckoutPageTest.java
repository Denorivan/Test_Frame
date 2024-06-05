package tests.checkoutPage;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static classesForTetsFrame.constants.Constant.UrlVariable.LOGIN_PAGE;

public class CheckoutPageTest extends BaseTest {
        @Test
        public void checkCheckoutIsClickable(){
            basePage.open(LOGIN_PAGE);

            loginPage
                    .fillFormUserByValidStandardUserUsername()
                    .fillFormPasswordToAllUsersByValidStandardPassword()
                    .pressLoginsButton();
            inventoryPage
                    .clickOnShoppingCard();

            checkoutPageTest
                    .checkThatShoppingCardIsClickable();
        }
        @Test
        public void checkCheckoutIsFunctionality(){
            basePage.open(LOGIN_PAGE);

            loginPage
                    .fillFormUserByValidStandardUserUsername()
                    .fillFormPasswordToAllUsersByValidStandardPassword()
                    .pressLoginsButton();
            inventoryPage
                    .clickOnFirstElementToAddProductInCheckout()
                    .clickOnShoppingCard();

            checkoutPageTest
                    .checkThatShoppingCardIsClickable()
                    .checkThatCorrectAmountOfProductWasAddToCheckout("1")
                    .clickRemoveButton()
                    .checkThatCheckoutAmountMarkerIsNoExist()
                    .clickContinueShoppingButton();

            inventoryPage
                    .clickOnFirstElementToAddProductInCheckout()
                    .clickOnSecondElementToAddProductInCheckout()
                    .clickOnShoppingCard();

            checkoutPageTest
                    .checkThatShoppingCardIsClickable()
                    .checkThatCorrectAmountOfProductWasAddToCheckout("2")
                    .checkThatProductsPresentInMainCheckoutPage(2)
                    .clickCheckoutButton()
                    .fillInformationForBuying()
                    .clickContinueButton()
                    .checkThatProductsPresentInMainCheckoutPage(2)
                    .checkInformationBeforeFinishBuy()
                    .clickFinishButton()
                    .checkThatCheckoutIsComplete()
                    .clickBackHomeButton();

            inventoryPage
                    .checkAmountOfProductsCards(6);

        }
}
