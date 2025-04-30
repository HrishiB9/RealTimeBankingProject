package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Utilities.BaseClass;

public class AccountDetailsPage extends BaseClass
{
	WebDriver driver;
	
	public AccountDetailsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(how=How.XPATH, using="//a[normalize-space()='Account Detail']")
	 WebElement accountLink;
	 
	 @FindBy(xpath="//select[@id=\"collection_comp-m8swuunx\"]")
	 WebElement accDropDown;

		@FindBy(xpath="//div[@id='menuitem-0']")
		WebElement accOne;
	 
	 @FindBy(xpath="//button[@data-testid='buttonElement']")
	 WebElement logBtn;
	 
	 @FindBy(xpath="//div[@id='comp-m8sxilxq']/h6/span")
	 WebElement welcome;
	 
	 @FindBy(xpath="//select[@id='collection_comp-m8sxryjj']")
	 WebElement selectAC;
	 
	 @FindBy(xpath="//div[@id='menuitem-2']/div")
	 WebElement acNumber;
	 
	 @FindBy(xpath="(//span[@class='TabsList2027980309__label'])[2]")
	 WebElement deposit;
	 
	 @FindBy(css="#input_comp-m8t00o79")
	 WebElement depositAmount;
	 
	 @FindBy(css="button[aria-label='Deposit']")
	 WebElement depositBtn;
	 
	 @FindBy(xpath="(//p[@class='font_7 wixui-rich-text__text'])[3]")
	 WebElement total;
	 
	 @FindBy(xpath="//span[normalize-space()='Withdrawl']")
	 WebElement withdrawlOption;
	 
	 @FindBy(css="#input_comp-m8t03jwk")
	 WebElement withdrawlAmount;
	 
	 @FindBy(css="button[aria-label='Withdraw']")
	 WebElement withdrawBtn;
	 
	 public void accountpage()
	 {
		 accountLink.click();
	 }
	 
	 public void username() throws InterruptedException
	 {		 
		 hardCodedWait(7000);
		 accDropDown.click();
		 hardCodedWait(3000);
			accOne.click();		
	 }
	
	 public void login()
	 {
		 logBtn.click();
	 }
	 
	 public String wel()
	 {
		 return welcome.getText();
	 }
	 
	 public void selectAccount()
	 {
		 selectAC.click();
		 acNumber.click();
	 }
	 
	 public void depositOption()
	 {
		 deposit.click();
	 }
	 public void dAmount(String amnt) throws InterruptedException
	 {
		 
		 depositAmount.sendKeys(amnt);
	 }
	 
	 public void depositButton()
	 {
		 depositBtn.click();
	 }
	 
	 public String totalAmt()
	 {
		 return total.getText();
	 }
	 
	 public void withdrawlOpt()
	 {
		 withdrawlOption.click();
	 }
	 
	 public void withdrawlAmt(String amt)
	 {
		 withdrawlAmount.sendKeys(amt); 
	 }
	  
	 public void withdrawBtn()
	 {
		 withdrawBtn.click();
	 }
}
