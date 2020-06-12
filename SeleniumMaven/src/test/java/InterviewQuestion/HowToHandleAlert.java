package InterviewQuestion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToHandleAlert extends BaseClass {
	
	@Test(priority=2)
	public void ConfirmAlert() throws InterruptedException {
		driver.get("file:///C:/ITTraining/WebSite/SuperTech.html");
		driver.findElement(By.xpath("//*[@id=\"btnConfirm\"]")).click();
		Thread.sleep(3000);
		
		Alert alt= driver.switchTo().alert();
		System.out.println("Text is : "+alt.getText());
		alt.accept();
		
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	public void Alert() throws InterruptedException {
		driver.get("file:///C:/ITTraining/WebSite/SuperTech.html");
		driver.findElement(By.xpath("//*[@id=\"btnAlert\"]")).click();
		Thread.sleep(3000);
		
		Alert alt= driver.switchTo().alert();
		System.out.println("Text is : "+alt.getText());
		alt.accept();
		
		Thread.sleep(3000);
	}
	@Test(priority=0)
	public void AlertPromt() throws InterruptedException {
		driver.get("file:///C:/ITTraining/WebSite/SuperTech.html");
		driver.findElement(By.xpath("//*[@id=\"btnPrompt\"]")).click();
		Thread.sleep(3000);
		
		Alert alt= driver.switchTo().alert();
		System.out.println("Text is : "+alt.getText());
		alt.sendKeys("Cucumber");
		Thread.sleep(5000);
		alt.accept();
		
		Thread.sleep(3000);
	}

}