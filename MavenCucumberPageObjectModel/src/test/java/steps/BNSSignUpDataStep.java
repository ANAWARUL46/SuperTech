package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BNSPage;

public class BNSSignUpDataStep extends AbstractClass {
	BNSPage bnsp=PageFactory.initElements(driver, BNSPage.class);
	
	@Given("User is on BNS signup webpage")
	public void user_is_on_BNS_signup_webpage() {
	   driver.get("file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
	}

	@When("User will enter {string} in firstname textbox, {string} in lastname textbox, {string} in email textbox,{string} in password textbox,{string} in phonenumber textbox")
	public void user_will_enter_in_firstname_textbox_in_lastname_textbox_in_email_textbox_in_password_textbox_in_phonenumber_textbox(String Fn, String Ln, String Em, String Pw, String Ph) {
	    bnsp.enterFirstName(Fn);
	    bnsp.enterLastName(Ln);
	    bnsp.enterEmail(Em);
	    bnsp.enterPassword(Pw);
	    bnsp.enterPhoneNumber(Ph);
	}

	@When("User will select {string} from month dropdownbox , {string} from day dropdownbox, {string} from year dropdownbox")
	public void user_will_select_from_month_dropdownbox_from_day_dropdownbox_from_year_dropdownbox(String Mn, String Dy, String Yr) {
	   bnsp.selectmonth(Mn);
	   bnsp.selectday(Dy);
	   bnsp.selectyear(Yr);
	}

	@When("User will select  {string} from gender radio button")
	public void user_will_select_from_gender_radio_button(String Gen) {
	   if(Gen.equalsIgnoreCase("Male")) {
		   bnsp.clickOnMale();
	   }
	   else {
		   bnsp.clickOnFemale();
	   }
	}

	@When("User will click on Submit button")
	public void user_will_click_on_Submit_button() {
		bnsp.clickOnSubmit();
	    
	}

	@Then("User should get meaasge {string}")
	public void user_should_get_meaasge(String message) {
	   bnsp.verifyText(message);
	}


}
