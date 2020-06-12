package xpathPack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class DynamicXpath extends BaseClass {
	
	@Test
	public void DynamicXpath() {
		test=report.createTest("Dynamic Xpath");
		driver.get("file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
		//Dynamic xpath By using Contains Function
		driver.findElement(By.xpath("//*[contains")).sendKeys("Islam");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[3]")).sendKeys("Anwar@yahoo.com");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[4]")).sendKeys("Anwar123");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[5]")).sendKeys("911911911");
		
		//By using Relative Xpath
	}

}
