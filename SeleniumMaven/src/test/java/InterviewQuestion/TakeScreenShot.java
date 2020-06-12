package InterviewQuestion;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basePack.BaseClass;

public  class TakeScreenShot extends BaseClass{
	
	@Test
	public   void BNSTest() throws InterruptedException, IOException {
		driver.get("file:///C:/ITTraining/BNS.html");
		
		driver.findElement(By.id("FN")).sendKeys("Anwar");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[1]")).sendKeys("Anwar");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[2]")).sendKeys("Islam");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[3]")).sendKeys("Anawarul46@gmail.com");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[4]")).sendKeys("12345");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[5]")).sendKeys("911");
		
		Select monthselect= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[1]")));
		monthselect.selectByIndex(2);
		
		Select dayselect= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[2]")));
		dayselect.selectByIndex(5);
		
		Select yearselect= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[3]")));
		yearselect.selectByVisibleText("2002");
		
		
		
		
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[6]")).click();
		//driver.findElement(By.xpath("html/body/div/div[2]/form/input[8]")).click();
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(System.getProperty("user.dir")+"\\ScreenShot\\Anwar.png"));
		
		Thread.sleep(4000);
	}

}
