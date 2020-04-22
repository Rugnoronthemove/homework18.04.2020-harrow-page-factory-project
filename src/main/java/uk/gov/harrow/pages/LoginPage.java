package uk.gov.harrow.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.gov.harrow.utility.Utility;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//li[@class='navbar-text myprofile_salutation']")
    WebElement _welcomeText;

    public void verifyTextWelcomeGuest(String veriText) {
        Reporter.log(" Verify text: "+veriText+" is displayed "+_welcomeText.toString()+"<br>");
        verifyTextAssertMethod(_welcomeText, veriText);
        log.info(" Verify text: "+veriText+" is displayed "+_welcomeText.toString());
    }

}
