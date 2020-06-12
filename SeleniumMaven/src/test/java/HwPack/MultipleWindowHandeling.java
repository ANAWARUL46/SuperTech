package HwPack;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class MultipleWindowHandeling extends BaseClass {
	@Test
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
		
		driver.findElement(By.name("q")).sendKeys("Bangladesh");
		
		Thread.sleep(2000);
		//driver.close();
		
		
		//for BNS
				//ArrayList<String>tab4=new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tab0.get(0));
				
				//driver.findElement(By.id("FN")).sendKeys("Anwar");
				Thread.sleep(2000);
				
		//for facebook2
		driver.findElement(By.partialLinkText("Facebook")).click();
				
		
		
		  driver.findElement(By.name("firstname")).sendKeys("Anwar");
		  driver.findElement(By.name("lastname")).sendKeys("Islam");
		  driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("Anawarul45@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).sendKeys("Anawarul45@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"u_0_w\"]")).sendKeys("12345");
		  Thread.sleep(2000);
		 
		//driver.close();
	}

}
