package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager 
{
	private static ExtentReports extent;
	
	/*ExtentReports is the return type of the method.

			ExtentReports is a class from the ExtentReports library.

			When you call ExtentManager.getInstance(), it returns an object of type ExtentReports.

			You need this object to create logs, attach screenshots, flush the report, etc.*/


	
	public static ExtentReports getInstance()
	{
		if(extent==null)
		{
			createInstance();
		}
		return extent;
		
	}
	
	public static ExtentReports createInstance()
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/ExtentReport.html");
        htmlReporter.config().setDocumentTitle("Automation Test Report");
        htmlReporter.config().setReportName("Functional Testing");
        htmlReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
		return extent;
		
	}
}
