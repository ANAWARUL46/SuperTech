package InterviewQuestion;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class CountYahooSearchBoxHW extends BaseClass {
		@Test
		public void YahooSearch() throws InterruptedException {
			test=report.createTest("YahooSearch");
			driver.get("https://www.yahoo.com/");
			
		
			driver.findElement(By.name("p")).sendKeys("Bangladesh");
			Thread.sleep(3000);
			
			List<WebElement>list=driver.findElements(By.xpath("//*[@id=\"header-search-form\"]/div[1]/div/div/ul/li"));
			System.out.println("Total Search Item: "+list.size());
			
			for(int i=0; i<list.size();i++) {
				System.out.println(i+ ". "+list.get(i).getText());
			}
		}
}
