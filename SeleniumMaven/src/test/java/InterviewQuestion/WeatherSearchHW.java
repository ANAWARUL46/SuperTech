package InterviewQuestion;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class WeatherSearchHW extends BaseClass {
		@Test
		public void YahooSearch() throws InterruptedException {
			driver.get("https://www.weather.gov/");
			
			driver.findElement(By.xpath("//*[@id=\"inputstring\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"inputstring\"]")).sendKeys("11432");
			Thread.sleep(3000);
			
			List<WebElement>list=driver.findElements(By.xpath("/html/body/div[7]/div"));
			System.out.println("Total Search Item: "+list.size());
			
			for(int i=0; i<list.size();i++) {
				System.out.println(i+ ". "+list.get(i).getText());
			}
		}
}
