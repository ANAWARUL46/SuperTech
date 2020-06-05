package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TransferFundOnlinePage;

public class TransferFundOnlineStep extends AbstractClass {
	TransferFundOnlinePage tfsp=PageFactory.initElements(driver,TransferFundOnlinePage.class);
	@Given("User is on fund transfer online page")
	public void user_is_on_fund_transfer_online_page() {
		driver.get("file:///C:/Users/ANAWA/OneDrive/Desktop/fundTransfer.html");
	    
	}

	@When("User will select payee {string} from payee drop down box")
	public void user_will_select_payee_from_payee_drop_down_box(String pye) {
		tfsp.selectPayeeName(pye);
	   
	}

	@When("User will enter {string} in amount textbox")
	public void user_will_enter_in_amount_textbox(String amt) {
	    tfsp.enterAmount(amt);
	}

	@When("User will click transfer button")
	public void user_will_click_transfer_button() {
	    tfsp.clickOnTransfer();
	}

	@Then("User should see balance {string} in balace amount field")
	public void user_should_see_balance_in_balace_amount_field(String bln) {
	    tfsp.verifyBalance(bln);
	}

	@Then("User should see message {string}")
	public void user_should_see_message(String sms) {
	  
	   tfsp.verifySuccessMessage(sms);
	   tfsp.verifyWarningMessage(sms);
	   tfsp.verifyFailMessage(sms);
	}

}
