package InterviewQuestion;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToHandleIframe extends BaseClass {
	@Test
	public void IframeHandleing() throws InterruptedException {
		driver.get("file:///C:/ITTraining/WebSite/SuperTech.html");
		
		List<WebElement>list=driver.findElements(By.tagName("iframe"));
		System.out.println("Total Iframe: "+list.size());
		
		//switch to main frame 1
		driver.switchTo().frame(0);
		//driver.switchTo().frame("LoginForm");
		//driver.switchTo().frame(driver.findElement(By.name("LoginForm")));
		
		driver.findElement(By.name("first_name")).sendKeys("Anwar");
		
		//switch to main frame
		driver.switchTo().defaultContent();
		//switch to frame 2
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("DOWNLOAD")).click();
		
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("btnConfirm")).click();
		
		Alert alt= driver.switchTo().alert();
		alt.accept();
		
		Thread.sleep(3000);
	}

}
