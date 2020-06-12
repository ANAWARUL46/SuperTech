package crossBrowser;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import basePack.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowserByParameter  {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters({"browserName"})
	
	public void setup(String browser) throws InterruptedException {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}
			
			else if(browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
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
	}
	
		@Test
		public void googleTest() throws InterruptedException {
			
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("New York");
			Thread.sleep(4000);
			driver.close();
			
		}
		
		}

