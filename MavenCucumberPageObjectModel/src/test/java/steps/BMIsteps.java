package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BMIpage;

public class BMIsteps extends AbstractClass{
	
	BMIpage bmip=new BMIpage(driver);
	@Given("User is on BMI calculator webpage")
	public void user_is_on_BMI_calculator_webpage() {
		driver.get("file:///C:/Users/ANAWA/OneDrive/Desktop/BMI.html");
	  
	}

	@When("User enter in {string} in height textbox")
	public void user_enter_in_in_height_textbox(String ht) {
		bmip.entereight(ht);
	    
	}

	@When("User enter {string} in weight textbox")
	public void user_enter_in_weight_textbox(String wt) throws InterruptedException {
		bmip.enterweight(wt);
		Thread.sleep(2000);
	    
	}

	@When("User click on calculate button")
	public void user_click_on_calculate_button() {
	    bmip.ClickOnCalculate();
	}

	@Then("User should see warning message {string}")
	public void user_should_see_warning_message(String message) {
		bmip.verifyMessage(message);
	    
	}

	@Then("User should see BMI {string} and category {string}")
	public void user_should_see_BMI_and_category(String bmi, String ctg) {
		bmip.verifyBMI(bmi);
		bmip.verifyCategory(ctg);
	    
	}
}
