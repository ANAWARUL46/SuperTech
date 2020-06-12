package InterviewQuestion;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToSearchBox extends BaseClass {
		@Test
		public void googleSearch() throws InterruptedException {
			driver.get("https://www.google.com/");
			
		
			driver.findElement(By.name("q")).sendKeys("Bangladesh");
			Thread.sleep(3000);
			
			List<WebElement>list=driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li"));
			System.out.println("Total Search Item: "+list.size());
			
			for(int i=0; i<list.size();i++) {
				System.out.println(i+ ". "+list.get(i).getText());
			}
		}
}
