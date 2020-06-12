package InterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToHighLightWebElement extends BaseClass{
	
	
	@Test
	public void HighLightWebElement() throws InterruptedException {
		test=report.createTest("HighLightElement");
		driver.get("file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
	    WebElement fname=driver.findElement(By.id("FN"));
			fname.sendKeys("Anwar");
			JavascriptExecutor jsEx = (JavascriptExecutor)driver;
			jsEx.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 3px dotted red ;' )", fname);
			Thread.sleep(7000);
	}

}
