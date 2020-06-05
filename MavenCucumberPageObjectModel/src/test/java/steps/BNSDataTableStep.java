package steps;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import pages.BNSPage;

public class BNSDataTableStep extends AbstractClass{
	BNSPage  bnsp=PageFactory.initElements(driver, BNSPage .class);
	@Given("User is on BNS signup Webpage")
	public void user_is_on_BNS_signup_Webpage() {
	   driver.get("file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
	}

	@When("User will Enter following data")
	public void user_will_Enter_following_data(DataTable table1) {
	    List<String>data1=table1.row(1);
	    bnsp.enterFirstName(data1.get(0));
	    bnsp.enterLastName(data1.get(1));
	    bnsp.enterEmail(data1.get(2));
	    bnsp.enterPassword(data1.get(3));
	    bnsp.enterPhoneNumber(data1.get(4));
	}

	@When("User will Select below")
	public void user_will_Select_below(DataTable table2) {
		List<String>data2=table2.column(1);
		bnsp.selectmonth(data2.get(0));
		bnsp.selectday(data2.get(1));
		bnsp.selectyear(data2.get(2));
	}

	@When("User will Select  below")
	public void user_will_Select_below_data(DataTable table3) {
		List<String>data3=table3.row(1);
		if(data3.get(0).equalsIgnoreCase("Male")) {
			bnsp.clickOnMale();
		}
		else {
			bnsp.clickOnFemale();
		}
	}

	@When("User will click on Submit Button")
	public void user_will_click_on_Submit_Button() {
	    bnsp.clickOnSubmit();
	}

	@Then("User should get Meaasge below")
	public void user_should_get_Meaasge_below_Message(DataTable table4) {
		List<String>data4=table4.row(1);
		bnsp.verifyText(data4.get(0));
	   
	}

	
	



}
