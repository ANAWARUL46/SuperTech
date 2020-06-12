package InterviewQuestion;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToHandelMultiplePageInSameWindow extends BaseClass {
		@Test
		public void MultiplePageInSameWindow() throws InterruptedException {
			driver.get("file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
			
			
			
			driver.findElement(By.partialLinkText("Yahoo")).click();
			driver.findElement(By.name("p")).sendKeys("Bangladesh");
			Thread.sleep(3000);
			driver.navigate().back();
			driver.findElement(By.id("FN")).sendKeys("Anwar");
			Thread.sleep(3000);
			
			driver.navigate().forward();
			driver.findElement(By.name("p")).sendKeys("Coronavirus");
			driver.navigate().refresh();
			
			
			//ArrayList<String>tab1=new ArrayList<String>(driver.getWindowHandles());
			//driver.switchTo().window(tab1.get(1));
			
			
			//driver.findElement(By.name("firstname")).sendKeys("Anwar");
			//driver.findElement(By.name("lastname")).sendKeys("Islam");
			
			//Thread.sleep(3000);
			//driver.close();
			
			
			//ArrayList<String>tab0=new ArrayList<String>(driver.getWindowHandles());
			//driver.switchTo().window(tab0.get(0));
			
			//driver.findElement(By.id("FN")).sendKeys("Anwar");
			//driver.findElement(By.xpath("html/body/div/div[2]/form/input[3]")).sendKeys("Anawarul46@gmail.com");
			//driver.findElement(By.xpath("html/body/div/div[2]/form/input[4]")).sendKeys("12345");
			//driver.findElement(By.xpath("html/body/div/div[2]/form/input[5]")).sendKeys("911");
			
			//Thread.sleep(3000);
		}
}
