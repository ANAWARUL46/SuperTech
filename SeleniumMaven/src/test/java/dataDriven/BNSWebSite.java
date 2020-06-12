package dataDriven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import basePack.BaseClass;

public  class BNSWebSite extends BaseClass{
	
	@Test
	public   void BNSTest() throws InterruptedException, IOException {
		driver.get("file:///C:/ITTraining/BNS.html");
		
		driver.findElement(By.id("FN")).sendKeys("Anwar");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[1]")).sendKeys("Anwar");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[2]")).sendKeys("Islam");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[3]")).sendKeys("Anawarul46@gmail.com");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[4]")).sendKeys("12345");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[5]")).sendKeys("911");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[6]")).click();
		//driver.findElement(By.xpath("html/body/div/div[2]/form/input[8]")).click();
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\ANAWA\\eclipse-workspace\\SeleniumMaven\\ScreenShot"));
		
		Thread.sleep(4000);
	}

}
