package InterviewQuestion;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToOpenNewTabAndNewWindow extends BaseClass{
	
	@Test
	public void OpenNewTab() {
		test=report.createTest("Open new Tab ");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.com/?gws_rd=ssl");
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(600,1000));
		
		
	}
	@Test
	public void OpenNewWindow() throws InterruptedException {
		test=report.createTest("Open New Window");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.google.com/?gws_rd=ssl");
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1000,600));
		
		Thread.sleep(5000);
		
		
	}
	

}
