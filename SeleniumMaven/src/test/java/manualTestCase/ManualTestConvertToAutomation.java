package manualTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class ManualTestConvertToAutomation extends BaseClass{
	
	@Test(description = "TC001")
	public void verifyTitle() {
		test=report.createTest("Verify Title");
		driver.navigate().to("file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
		String expectedTitle="BNS International Corporation";
		String actualTitle=driver.getTitle();
		System.out.println("Title is : "+actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(description = "TC002")
	public void FillUpLoginForm() {
		test=report.createTest("FillUpLoginForm");
		driver.navigate().to("file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
		driver.findElement(By.xpath("//*[@id=\"FN\"]")).sendKeys("Chowdhury");
		driver.findElement(By.xpath("//*[@id=\"LN\"]")).sendKeys("Jamal");
		driver.findElement(By.xpath("//*[@id=\"EM\"]")).sendKeys("Jamal@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"PH\"]")).sendKeys("1234555");
		
		Select monthselet= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[1]")));
		monthselet.selectByVisibleText("Jan");
		
		Select dayselet= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[2]")));
		dayselet.selectByVisibleText("10");
		
		Select yearselet= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[3]")));
		yearselet.selectByVisibleText("2001");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/form/input[7]")).click();
	}

}
