package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class ContactsUsPage extends BaseClass
{
	
	WebDriver driver;
	
	public ContactsUsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[normalize-space()='Contacts Us']")
	WebElement contact;
	
	@FindBy(id="input_1496238250184")
	WebElement firstName;
	
	@FindBy(css="#input_1496238230199")
	WebElement emailAdr;
	
	@FindBy(xpath="//input[@placeholder='Phone Number']")
	WebElement phone;
	
	@FindBy(how=How.XPATH, using="//input[@name='Input_4']")
	WebElement address;
	
	@FindBy(how=How.ID, using="input_1742714886366")
	WebElement country;
	
	@FindBy(how=How.XPATH, using="//input[@name='Input_6']")
	WebElement zipCode;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//input[@id='input_1496238250184']")
	WebElement msg;
	
	
	public void contactUs()
	{
		contact.click();
	}
	
	public void name(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	public void emailId(String email)
	{
		emailAdr.sendKeys(email);
	}
	
	public void phoneNumber(String phoneNo)
	{
		phone.sendKeys(phoneNo);
	}
	
	public void addressEntered(String adr)
	{
		address.sendKeys(adr);
	}
	
	
	public void countrySelection(String contry)
	{
		country.sendKeys(contry);
	}
	
	public void zip(String code)
	{
		zipCode.sendKeys(code);
	}
	
	public void submitbtn()
	{
		submit.submit();
	}
	
	public void getMsg()
	{
		msg.getText();
	}
}
