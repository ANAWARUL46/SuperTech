package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import datahelper.ExcelFileReaderPOM;
import pages.BNSPage;

public class BNSExcelDataTest extends BaseClass{
	
	static public  String filePath=System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\BNSData.xlsx";
    //String filePath="C:\\Users\\ANAWA\\IdeaProjects\\PageObjectModel\\src\\test\\resources\\TestData\\BNSData.xlsx";
    static public  String sheetName="Data1";

    @Test(dataProvider = "bnsdata")
    public void BNSTest(String Fn, String Ln, String Em, String Pw, String Ph, String Mn, String Dy, String Yr, String Gen, String message){
        test=report.createTest("BNS Test");
        BNSPage bnsp= PageFactory.initElements(driver, BNSPage.class);
        driver.get("file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
        bnsp.enterFirstName(Fn);
        bnsp.enterLastName(Ln);
        bnsp.enterEmail(Em);
        bnsp.enterPassword(Pw);
        bnsp.enterPhoneNumber(Ph);
        bnsp.selectmonth(Mn);
        bnsp.selectday(Dy);
        bnsp.selectyear(Yr);
        if(Gen.equalsIgnoreCase("Male")) {
            bnsp.clickOnMale();
        }
        else {
            bnsp.clickOnFemale();
        }
        bnsp.clickOnSubmit();
        bnsp.verifyText(message);

    }


    @DataProvider(name="bnsdata")
    public  Object[][] getData() throws IOException {
        return ExcelFileReaderPOM.ExcelReader(filePath, sheetName);
    }


}
