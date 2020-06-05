package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BMIpage {
	public BMIpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"heightCMS\"]")
	
	WebElement heightTextBox;
	
	public void entereight(String ht) {
		heightTextBox.sendKeys(ht);
	}
	
	@FindBy(xpath="//*[@id=\"weightKg\"]")
	
	WebElement weightTextBox;
	
	public void enterweight(String wt) {
		weightTextBox.sendKeys(wt);
	}
	
	@FindBy(xpath="//*[@id=\"Calculate\"]")
	
	WebElement calculate;
	
	public void ClickOnCalculate() {
		calculate.click();
	}
	
	@FindBy(xpath="//*[@id=\"bmi\"]")
	
	WebElement BMI;
	
	public void verifyBMI(String bmi) {
		String actualbmi=BMI.getAttribute("value");
		Assert.assertEquals(actualbmi, bmi);
	}
	
	@FindBy(xpath="//*[@id=\"bmi_category\"]")
	
	WebElement Category;
	
	public void verifyCategory(String ctg) {
		String actualCategory=Category.getAttribute("value");
		Assert.assertEquals(actualCategory, ctg);
	}
	
	@FindBy(xpath="//*[@id=\"error\"]")
	
	WebElement ErrorMessage;
	
	public void verifyMessage(String message) {
		String actualErrorMessage=ErrorMessage.getText();
		Assert.assertEquals(actualErrorMessage, message);
		
	}
}
		
				