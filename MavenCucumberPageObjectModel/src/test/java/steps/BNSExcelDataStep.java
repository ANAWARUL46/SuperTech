package steps;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import datahelper.ExcelFileReader;
import pages.BNSPage;

public class BNSExcelDataStep extends AbstractClass {
	List<HashMap<String,String>>datamap;
	public BNSExcelDataStep() throws IOException {
		datamap=ExcelFileReader.excelDataReading(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\BNSData.xlsx", "Data1");
	}
	BNSPage bnsp=PageFactory.initElements(driver, BNSPage.class);
	
	@Given("User is on BNS login webpage")
	public void user_is_on_BNS_login_webpage() {
		driver.get("file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
	   
	}

	@When("User will enter, select and click {string}")
	public void user_will_enter_select_and_click(String string) throws InterruptedException {
		
		int index=Integer.parseInt(string)-1;
		bnsp.enterFirstName(datamap.get(index).get("First Name"));
		bnsp.enterLastName(datamap.get(index).get("Last Name"));
		bnsp.enterEmail(datamap.get(index).get("Email"));
		bnsp.enterPassword(datamap.get(index).get("Password"));
		bnsp.enterPhoneNumber(datamap.get(index).get("Phone"));
		bnsp.selectmonth(datamap.get(index).get("Month"));
		bnsp.selectday(datamap.get(index).get("Day"));
		bnsp.selectyear(datamap.get(index).get("Year"));
		Thread.sleep(3000);
		
		if(datamap.get(index).get("Gender").equalsIgnoreCase("Male")) {
			bnsp.clickOnMale();
		}
		else {
			bnsp.clickOnFemale();
		}
	    
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		bnsp.clickOnSubmit();
	    
	}

	@Then("User should check message {string}")
	public void user_should_check_message(String message) {
		bnsp.verifyText(message);
	    
	}

}
