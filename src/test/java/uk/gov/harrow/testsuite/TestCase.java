package uk.gov.harrow.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.pages.LoginPage;
import uk.gov.harrow.testbase.TestBase;

public class TestCase extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(groups = {"Regression","Smoke","Sanity"})
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"Regression","Smoke","Sanity"})
    public void verifyClickOnLoginOrRegisterLink() {
        //click on login or register link
        homePage.clickOnLoginOrRegisterLink();
        //verify text on Login Page
        loginPage.verifyTextWelcomeGuest("Welcome Guest!");
    }

    @Test (groups = {"Regression","Smoke"})
    public void verifyClickOnServicesBtn() {
        //click on services button
        homePage.clickOnServicesBtn();
    }

    @Test (groups = {"Regression"})
    public void verifyElementsOnHarrowWebsiteHomePageAreDisplayed() {
        //verify service button is displayed
        homePage.isDisplayedServicesBtn();
    }


}
