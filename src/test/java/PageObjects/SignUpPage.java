package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.BaseClass;

public class SignUpPage extends BaseClass
{
	WebDriver driver;
	
	public SignUpPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Sign Up']") //Basic page factory
	WebElement registrationLink;
	
	@FindBy(how=How.ID, using="input_1495646567135") //Dynamic page factory
	WebElement firstname;
	
	@FindBy(how=How.ID, using="input_1500473664921") //Dynamic page factory
	WebElement lastname;
	
	@FindBy(how=How.NAME, using="Phone") //Dynamic page factory
	WebElement phone;
	
	@FindBy(how=How.XPATH, using ="//input[@name='DOB']")
	WebElement dob;
	
	@FindBy(name="Gender")
	WebElement gender;
	
	@FindBy(how=How.ID, using="input_1742711965354")
	WebElement city;
	
	@FindBy(how=How.NAME, using="User Name")
	WebElement username;
	
	@FindBy(how=How.CSS, using="input[name='Password']")
	WebElement password;
	
	@FindBy(how=How.XPATH, using= "//button[@type='submit']")
	WebElement signup;
	
	@FindBy(how=How.XPATH, using="//form[@id='form908359660']/div")
	WebElement success;
	
	
	public void registration()
	{
		registrationLink.click();
	}
	
	public void firstName(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void lastName(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void phoneNumber(String phoneNum)
	{
		phone.sendKeys(phoneNum);
	}
	
	public void dateOfBirth(String DateOfBirth)
	{
		dob.sendKeys(DateOfBirth);
	}
	
	public void genderSelection(String gen)
	{
		Select s = new Select(gender);
		s.selectByValue(gen);
		
	}
	
	public void cityName(String enterCity)
	{
		city.sendKeys(enterCity);
	}
	
	public void userName(String user)
	{
		username.sendKeys(user);
		
	}
	
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void submitButton()
	{
		signup.click();
	}
	
	public void successMessage()
	{
		success.getText();
	}
}
