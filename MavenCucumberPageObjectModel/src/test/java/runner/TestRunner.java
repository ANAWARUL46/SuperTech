package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		plugin= {
				"html:target/cucumber-html-report",
				"json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml",
				
				
		},
		features= {"src/test/resources/Features"},
		glue= {"steps"},
		
		tags= {"@BNSExcel, @BNSPOM, @MBIcalculator, @BNSPOMData, @FundTransfer"}
		
		
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
