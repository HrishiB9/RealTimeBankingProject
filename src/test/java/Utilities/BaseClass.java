package Utilities;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	
	public static String browserName;
	public static WebDriver driver;
	public static String getUrl;
	
	
	public static WebDriver initializeDriver()
	{ 
			try 
			 {
				browserName= FetchBrowserNameFromProperties.readBrowserName().getProperty("Browser");
				getUrl= FetchBrowserNameFromProperties.readBrowserName().getProperty("url");
								
			 } 
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			try {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get(getUrl);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
		}
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			try {
				driver = new FirefoxDriver();
				driver.get(FetchURLFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
		}
		
		if(browserName.equalsIgnoreCase("edge"))
		{
			try {
				driver = new EdgeDriver();
				driver.get(FetchURLFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
		}
		
		return driver;
		
	}
	
	public static void addImplicitWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public static void scrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"," " );
	}
	
	public static void getTitle()
	{
		String title = driver.getTitle();
		System.out.println("Page Title is: "+title);
	}
	
	public static void addExplicitWait(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void getWindowHandle()
	{
		Set<String> alltabs=driver.getWindowHandles();
		Iterator<String> pcid=alltabs.iterator();
		@SuppressWarnings("unused")
		String parentTab=pcid.next();
		String childTab=pcid.next();
		driver.switchTo().window(childTab);
	}
	
	public static void hardCodedWait()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
