package HwPack;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class FacebookDataDrivenHW extends BaseClass{
	
	@Test(dataProvider="FacebookData")
	public void FacebookDataDriven(String FN, String LN, String Email, String CEmail, 
			String Pass, String Mn, String Day, String Year, String Gn) throws InterruptedException {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys(FN);
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys(LN);
		driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).sendKeys(CEmail);
		driver.findElement(By.xpath("//*[@id=\"u_0_w\"]")).sendKeys(Pass);
		
		Select monthselect = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		monthselect.selectByVisibleText(Mn);
		
		Select dayselect= new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		dayselect.selectByVisibleText(Day);
		
		Select yearselect= new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		yearselect.selectByVisibleText(Year);
		
		if(Gn.equalsIgnoreCase("Female")) {
			driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click();
		}
		
		else if(Gn.equalsIgnoreCase("Male")) {
			driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
		}
		
		else {
			driver.findElement(By.xpath("//*[@id=\"u_0_8\"]")).click();
			
			//Select pronounselect=new Select(driver.findElement(By.xpath("//*[@id=\"js_ad\"]")));
			//pronounselect.selectByVisibleText(PS);
		}
		
		
		Thread.sleep(4000);
		
	}
	@DataProvider(name="FacebookData")
	public Object[][] getData() {
		return new Object [] [] {
			{"Anwar","Islam","a@gmail.com", "a@gmail.com", "12345", "Jan","10","1990","Male" },
			{"Sumi","Islam","s@gmail.com", "s@gmail.com", "0345","Feb","19","1980","Female" },
			{"Jamal","Chowdhury","J@gmail.com", "J@gmail.com", "89745", "Jun","15","1970","Male" },
			{"Atik","Rahman","a@gmail.com", "a@gmail.com", "12345","Jul", "10","1960","Custom" },
			{"Alif","Islam","s@gmail.com", "s@gmail.com",  "000345","Aug", "19","1950","Female" },
			{"Imran","Ali","J@gmail.com", "J@gmail.com", "89745", "Sep","15","1940","Custom",  }
		};
		
	}

}
