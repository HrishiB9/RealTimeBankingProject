package Hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utilities.BaseClass;
import Utilities.ExtentManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass
{
	static ExtentReports extent = ExtentManager.getInstance();
    static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	
	@Before
	public void setup(Scenario scenario)
	{
		
		driver=initializeDriver();
		ExtentTest extentTest = extent.createTest(scenario.getName());
        test.set(extentTest);
	}
	
	@AfterStep
	public void afterStep(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			 test.get().fail("Step failed: " + scenario.getName());
			 takeScreenshot(scenario.getName());
			 
			
		}
		 else 
		 {
	            test.get().pass("Step passed");
	        }
		
	}
	
	@After
	public void tearDown()
	{
		
	    extent.flush();   //real-time updates. 		
		if(driver !=null)
		{
			driver.quit();
		}
		
		
	}
	
	public void takeScreenshot(String scenarioName)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			int randomInt = (int)(Math.random() * 100);
			System.out.println(randomInt);
			FileUtils.copyFile(src, new File("G:\\Automation Testing\\GroTechMind\\RealTime_BankingPoject\\Screenshot\\"+scenarioName+randomInt+".png"));
			System.out.println("Screenshot captured for scenario: " + scenarioName);
		} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
