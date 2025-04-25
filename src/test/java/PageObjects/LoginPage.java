package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver; 
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this );
		
	}
	
	@FindBy(how=How.XPATH, using="(//a[@class='t-menu__link-item'])[5]")
	WebElement log;
	
	@FindBy(how=How.ID, using="input_1495646567135")
	WebElement user;
	
	@FindBy(how=How.ID, using="input_1742715919526")
	WebElement pwd;
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	WebElement logBtn;
	
	@FindBy(xpath="//form[@id='form908400415']/div")
	WebElement successMessage;
	
	 @FindBy(xpath="(//ul[@role='list'])[2]/li/a")
	 WebElement errorMessage;
	
	
	public void logLink()
	{
		log.click();
	}
	
	public void userName(String name)
	{
		user.sendKeys(name);
	}
	
	public void passwd(String pass)
	{
		pwd.sendKeys(pass);
	}
	
	public void loginBtn()
	{
		logBtn.click();
	}
	
	public void msg()
	{
		successMessage.getText();
	}
	
	public String errMsg()
	{
		return errorMessage.getText();
	}
	
}
