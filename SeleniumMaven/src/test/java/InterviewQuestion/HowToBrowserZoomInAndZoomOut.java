package InterviewQuestion;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToBrowserZoomInAndZoomOut extends BaseClass {
	
	@Test
	public void ZoomIn() throws InterruptedException {
		test=report.createTest("Zoom In and Zoom Out");
		driver.get("file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
		
		JavascriptExecutor jsEx=(JavascriptExecutor)driver;
		
		//Zoom In
		jsEx.executeScript("document.body.style.zoom='150%'");
		Thread.sleep(5000);
		
		//Zoom out
		jsEx.executeScript("document.body.style.zoom='100%'");
		
		Thread.sleep(5000);
	}
	

}
