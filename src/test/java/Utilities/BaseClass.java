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
            browserName = FetchBrowserNameFromProperties.readBrowserName().getProperty("Browser");
            getUrl = FetchBrowserNameFromProperties.readBrowserName().getProperty("url");
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
            throw new RuntimeException("Failed to load browser configuration");
        }
		
			switch (browserName.toLowerCase()) 
			{
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            default:
                throw new IllegalArgumentException("Browser not supported: " + browserName);
            }
			
			 driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        driver.get(getUrl);
		        return driver;
		
	}
	
	public static void addImplicitWait(long seconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public static void scrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"," " );
	}
	
	public static String getTitle()
	{
		String title = driver.getTitle();
		System.out.println("Page Title is: "+title);
		return title;
	}
	
	public static void addExplicitWait(By locator, long seconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void getWindowHandle()
	{
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> iterator=windows.iterator();
		
		if(windows.size()>1)
		{
		String parentWindow=iterator.next();
		String childWindow=iterator.next();
		driver.switchTo().window(childWindow);
		}
		else
		{
			throw new IllegalStateException("No child window found to switch");
		}
		
	
	}
	
	public static void hardCodedWait(long milliseconds)
	{
		 try 
		 {
	            Thread.sleep(milliseconds);
	        }
		 catch (InterruptedException e) 
		 {
	            Thread.currentThread().interrupt();
	            System.err.println("Thread interrupted during wait: " + e.getMessage());
		 }
	}
	
	
}
