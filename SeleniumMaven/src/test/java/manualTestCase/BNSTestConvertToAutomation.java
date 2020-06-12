package manualTestCase;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class BNSTestConvertToAutomation extends BaseClass{
	
	//@Test(description = "TC001")
	public void verifyTitle() {
		driver.navigate().to("file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
		String expectedTitle="BNS International Corporation";
		String actualTitle=driver.getTitle();
		System.out.println("Title is : "+actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	//@Test(description = "TC002")
	public void FillUpLoginForm() {
		driver.navigate().to("file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
		driver.findElement(By.xpath("//*[@id=\"FN\"]")).sendKeys("Anwar");
		driver.findElement(By.xpath("//*[@id=\"LN\"]")).sendKeys("Islam");
		driver.findElement(By.xpath("//*[@id=\"EM\"]")).sendKeys("Anwar@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"PH\"]")).sendKeys("12345");
		
		Select monthselet= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[1]")));
		monthselet.selectByVisibleText("Jun");
		
		Select dayselet= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[2]")));
		dayselet.selectByVisibleText("15");
		
		Select yearselet= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[3]")));
		yearselet.selectByVisibleText("2002");
		
		driver.findElement(By.xpath("/html/body/div/div[2]/form/input[6]")).click();
	}
	@Test(description = "TC003")
	public void HandleMultipleWindow() throws InterruptedException, IOException {
		driver.get(" file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
		Thread.sleep(2000);
		
		//for facebook
		driver.findElement(By.partialLinkText("Facebook")).click();
		
		ArrayList<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
		
		driver.findElement(By.name("firstname")).sendKeys("Anwar");
		
		Thread.sleep(2000);
		//driver.close();
		
		//for BNS
		ArrayList<String>tab0=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab0.get(0));
		
		driver.findElement(By.id("FN")).sendKeys("Anwar");
		Thread.sleep(2000);
		
		//for google
		driver.findElement(By.partialLinkText("Google")).click();
		
		ArrayList<String>tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(2));
		
		driver.findElement(By.name("q")).sendKeys("Facebook");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div/span")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		//for BNS
				ArrayList<String>tab4=new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tab0.get(0));
				
				//driver.findElement(By.id("FN")).sendKeys("Anwar");
				Thread.sleep(2000);
				
		
		 driver.findElement(By.name("firstname")).sendKeys("Anwar");
		  driver.findElement(By.name("lastname")).sendKeys("Islam");
		  driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys(
		  "Anawarul45@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).sendKeys(
		  "Anawarul45@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"u_0_w\"]")).sendKeys("12345");
		  Thread.sleep(2000);
		 
		  Thread.sleep(3000);
		  driver.close();
	

		Thread.sleep(3000);
	}

}
