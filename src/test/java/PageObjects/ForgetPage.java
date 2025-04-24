package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ForgetPage 
{
	WebDriver driver;
	
	public ForgetPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[normalize-space()='Forget Password']")
	WebElement forget;
	
	@FindBy(how=How.CSS, using="#input_7539084004150")
	WebElement emailId;
	
	@FindBy(how=How.CSS, using="#input_7539084004151")
	WebElement mob;
	
	@FindBy(how=How.XPATH, using="//button[@class='t-submit']")
	WebElement resetbtn;
	
	@FindBy(how=How.XPATH, using="//*[@id='form912456274']/div[1]")
	WebElement msg;
	
	public void forgetPwd()
	{
		forget.click();
	}
	
	public void emailId(String email)
	{
		emailId.sendKeys(email);
	}
	
	public void mobNo(String mobNumber)
	{
		mob.sendKeys(mobNumber);
	}
	
	public void reset()
	{
		resetbtn.click();
		
	}
	
	public void getMsg()
	{
		msg.getText();
	}
}
