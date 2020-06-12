package InterviewQuestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToCountLinkOnWebPage extends BaseClass {
		@Test
		public void LinkCounting() {
			driver.get("https://online.citi.com/US/login.do");
			
			List<WebElement>links=driver.findElements(By.tagName("a"));
			
			int totalLink=links.size();
			System.out.println("Total Links are: "+totalLink);
			
			for(int i=0; i<totalLink; i++) {
				System.out.println(i+". "+links.get(i).getAttribute("href")+"------"+links.get(i).getText());
			}
			
			
			
		}
}
