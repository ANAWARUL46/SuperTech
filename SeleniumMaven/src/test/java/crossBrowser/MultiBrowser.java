package crossBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePack.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowser  {
	WebDriver driver;
	
		@Test(dataProvider="browserName")
		public void MultiBrowerTesting(String browser) throws InterruptedException {
			
			if(browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\ITTraining\\AllDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			}
			
			else if(browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.firefox.driver", "C:\\ITTraining\\AllDrivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			}
			
			else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\ITTraining\\AllDrivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			}
			
			else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\ITTraining\\AllDrivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			}
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("New York");
			Thread.sleep(4000);
			
		}
		@DataProvider(name="browserName")
		public Object [] [] getBrowser() {
			return new Object [] [] {
				{"Chrome"},
				{"Firefox"},
				{"IE"},
				{"Edge"}
				
			};
		}
}
