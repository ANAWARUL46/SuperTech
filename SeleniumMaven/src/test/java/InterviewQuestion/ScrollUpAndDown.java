package InterviewQuestion;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class ScrollUpAndDown extends BaseClass {
	@Test
	public void ScrollDown() throws InterruptedException {
		test=report.createTest("Scroll Down");
		driver.get("file:///C:/ITTraining/WebSite/SuperTech.html");
		Thread.sleep(4000);
		
		JavascriptExecutor jsEx = (JavascriptExecutor)driver;
		
		jsEx.executeScript("window.scrollBy(0, 2000)");
		Thread.sleep(4000);
		
		jsEx.executeScript("window.scrollBy(0, -2000)");
		Thread.sleep(4000);
		
	}
	
}
