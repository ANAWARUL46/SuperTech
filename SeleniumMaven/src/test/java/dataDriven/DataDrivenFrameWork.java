package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class DataDrivenFrameWork extends BaseClass {
	
	@Test(dataProvider = "BNSData")
	public void BNSDataDriven(String FN, String LN, String Email, String Pass, String Phone, 
			String Mn, String Day, String Year, String Gn) throws Exception {
		
		driver.get("file:///C:/ITTraining/BNS.html");
		driver.findElement(By.id("FN")).sendKeys(FN);
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[1]")).sendKeys(FN);
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[2]")).sendKeys(LN);
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[3]")).sendKeys(Email);
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[4]")).sendKeys(Pass);
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[5]")).sendKeys(Phone);
		
		
		Select monthselect= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[1]")));
		monthselect.selectByVisibleText(Mn);;
		
		Select dayselect= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[2]")));
		dayselect.selectByVisibleText(Day);;
		
		Select yearselect= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[3]")));
		yearselect.selectByVisibleText(Year);
		
		if(Gn.equalsIgnoreCase("Male")) {
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[6]")).click();
		}
		else if(Gn.equalsIgnoreCase("Female")) {
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[7]")).click();
		}
		
		Thread.sleep(4000);
	}
	@DataProvider(name="BNSData")
	public Object[][] getData(){
		
		return new Object[][] {
			{"Anwar","Islam","a@gmail.com", "12345","911","Jan","10","2001","Male" },
			{"Sumi","Islam","s@gmail.com", "000345","711","Feb","19","2003","Female" },
			{"Jamal","Chowdhury","J@gmail.com", "89745","811","Jun","15","2002","Male" },
			{"Anwar","Islam","a@gmail.com", "12345","911","Jan","10","2001","Male" },
			{"Sumi","Islam","s@gmail.com", "000345","711","Feb","19","2003","Female" },
			{"Jamal","Chowdhury","J@gmail.com", "89745","811","Jun","15","2002","Male" }
			
		};
	}
	

}
