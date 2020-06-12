package xpathPack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class UseOfxpath extends BaseClass {
	
	@Test
	public void AbsolouteXpath() {
		test=report.createTest("Absolute Xpath");
		driver.get("file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
		//By using Absolute Xpath
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[1]")).sendKeys("Anwar");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[2]")).sendKeys("Islam");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[3]")).sendKeys("Anwar@yahoo.com");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[4]")).sendKeys("Anwar123");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[5]")).sendKeys("911911911");
		
		//By using Relative Xpath
	}

}
