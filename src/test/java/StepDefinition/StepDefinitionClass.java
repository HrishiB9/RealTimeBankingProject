package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageObjects.AccountDetailsPage;
import PageObjects.ContactsUsPage;
import PageObjects.ForgetPage;
import PageObjects.LoginPage;
import PageObjects.SignUpPage;
import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitionClass extends BaseClass
{
	
	/*@Before
	public void setup()
	{
		
	}*/
	
	WebDriver driver = BaseClass.initializeDriver();
	SignUpPage page = new SignUpPage(driver);
	LoginPage login = new LoginPage(driver);
	ForgetPage forgot = new ForgetPage(driver);
	ContactsUsPage contact = new ContactsUsPage(driver);
	AccountDetailsPage account = new AccountDetailsPage(driver);
	
	 
	@Given("User launch the application")
	public void user_launch_the_application()
	{
		System.out.println("Application Launch successfully");
		
	}

	@When("User click on the sign up button")
	public void user_click_on_the_sign_up_button() 
	{
		page.registration();
		
	}

	@And("User enters the First name as {string}") 
	public void user_enters_the_first_name_as(String FirstName) 
	{
		page.firstName(FirstName);
	}

	@And("User enters the Last name as {string}")
	public void user_enters_the_last_name_as(String LastName)
	{
	    page.lastName(LastName);
	}

	@And("User enters the Phone as {string}")
	public void user_enters_the_phone_as(String PhoneNumber)
	{
		page.phoneNumber(PhoneNumber);
	}

	@And("User enters the DOB as {string}")
	public void user_enters_the_dob_as(String DOB)
	{
		addImplicitWait();
		page.dateOfBirth(DOB);
	}

	@And("User selects the gender")
	public void user_selects_the_gender()
	{
		page.genderSelection("Male");
	}

	@And("User enters the city as {string}")
	public void user_enters_the_city_as(String city)
	{
		page.cityName(city);
	}

	@And("User enters the User name as {string}")
	public void user_enters_the_user_name_as(String username)
	{
	    page.userName(username);
	}

	@And("User enters the Password as {string}")
	public void user_enters_the_password_as(String Password) 
	{
		page.password(Password);
	}

	@And("User click on the Sign up button")
	public void user_click_on_the_submit() 
	{
		page.submitButton();
	}

	@Then("Validate that user is getting success message from application")
	public void validate_that_user_is_getting_success_message_from_application() 
	{
	   page.successMessage();
	}
	@Then("Verify that the title of the page is showing correct value")
	public void verify_that_the_title_of_the_page_is_showing_correct_value() 
	{
	  getTitle();
	}

	
// ****** End of signup functionality ****** //
	
	//***** Login Functionality ***** //
	
	
	
		
	@And("Click on the Login Button")
	public void click_on_the_login_button()
	{
	   login.logLink();
	}
	
	@When("User enters the login Username as {string}")
	public void user_enters_the_login_username_as(String Username)
	{
	   login.userName(Username);
	}
	
	@And("User enters the login  Password as {string}")
	public void user_enters_the_login_password_as(String password) {
	   login.passwd(password);
	}
	
	@And("Click on the login buton")
	public void click_on_the_login_buton() {
	   login.loginBtn();
	}
	
	@Then("Validate that user is getting success message after login successfully")
	public void validate_that_user_is_getting_success_message_after_login_successfully() 
	{
	   login.msg();
	}
	
	@Then("Verify that the title of the page")
	public void verify_that_the_title_of_the_page() 
	{
	  getTitle();
	}
	
	@Then("Validate that user is getting error message")
	public void validate_that_user_is_getting_error_message() 
	{
	   String error = login.errMsg();
	   Assert.assertEquals(error, "None of the fields are filled in");
	   
	}


//*******End of login functionality *******//
	
	//Forgot Password functionality
	
	
	@When("User clicks on the  Forget Password menu")
	public void user_clicks_on_the_forget_password_menu() 
	{
		forgot.forgetPwd();
	}

	@And("User enters the email as {string}")
	public void user_enters_the_email_as(String email) 
	{
	   forgot.emailId(email);
	}

	@And("User enters the Mobile number {string}")
	public void user_enters_the_mobile_number(String mob) 
	{
		forgot.mobNo(mob);
	}

	@And("User clicks on the Reset Password button")
	public void user_clicks_on_the_reset_password_button() 
	{
		forgot.reset();
	}
	
	@Then("Validate that user is getting success message after password reset successfully")
	public void validate_that_user_is_getting_success_message_after_passsword_reset_successfully() 
	{
	   forgot.getMsg();
	}
		
	@And("Verify that the title of the current page")
	public void verify_that_the_title_of_the_current_page() 
	{
	  getTitle();
	}

//*****Contact us page functionality*******
	
	@When("User clicks on the Contact US link")
	public void user_clicks_on_the_contact_us_link()
	{
		contact.contactUs();
	}

	@When("User enters the name {string}")
	public void user_enters_the_name(String Name) {
	    contact.name(Name);
	}

	@When("User enters the email {string}")
	public void user_enters_the_email(String Email) {
	    contact.emailId(Email);
	}

	@When("User enters the Phone Number {string}")
	public void user_enters_the_phone_number(String PhoneNumber) {
	   contact.phoneNumber(PhoneNumber);
	}

	@When("User enters the Address {string}")
	public void user_enters_the_address(String Address) {
	   contact.addressEntered(Address);
	}

	@When("User enters the country {string}")
	public void user_enters_the_country(String Country) {
	    contact.countrySelection(Country);
	}

	@When("User enters the ZipCode {string}")
	public void user_enters_the_zip_code(String ZipCode) {
		contact.zip(ZipCode);
	}

	@When("User clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
	   contact.submitbtn();
	}

	@Then("Validate that user is getting success message after contact us form submission")
	public void validate_that_user_is_getting_success_message_after_contact_us_form_submission() {
	   contact.getMsg();
	}


	//********* Account details page functionality*******
	
	@Given("User clicks on the Account details link")
	public void user_clicks_on_the_account_details_link() 
	{
		
		account.accountpage();
		getWindowHandle();
		
	}

	@Given("User selects the name from dropdown")
	public void user_selects_the_name_from_dropdown()
	{			
	    try {
			account.username();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Given("User clicks on the login button")
	public void user_clicks_on_the_login_button()
	{
	    account.login();
	}
	
	@When("User verifies the welcome label")
	public void user_verifies_the_welcome_label()
	{
	    String msg = account.wel();
	   // Assert.assertEquals(msg, "Welcome");
	   
	}

	@When("User selects the Account number")
	public void user_selects_the_account_number() 
	{
	    account.selectAccount();
	}

	@When("User clicks on the deposit option")
	public void user_clicks_on_the_deposit_option() 
	{
		account.depositOption();
	}
	
	@When("User enters the deposit amount in the amount field {string}")
	public void user_enters_the_deposit_amount_in_the_amount_field(String depositAmount) {
		
		System.out.println(depositAmount);
	    try {
			account.dAmount(depositAmount);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(depositAmount);
	    
	}

	@When("User clicks on the Deposit button")
	public void user_clicks_on_the_deposit_button() {
	    account.depositButton();
	}
	
	@When("Validate the correct balance")
	public void validate_the_correct_balance() {
		String total = account.totalAmt();
	    System.out.println("Total Account balance:" +total);
	}

	@When("User clicks on the Withdrawl option")
	public void user_clicks_on_the_withdrawl_option() {
	    account.withdrawlOpt();
	}

	@When("User enters the withdrawl amount in the amount field {string}")
	public void user_enters_the_withdrawl_amount_in_the_amount_field(String withdrawlAmount) {
	   account.withdrawlAmt(withdrawlAmount);
	   
	}

	@When("User clicks on the Withdrawl button")
	public void user_clicks_on_the_withdrawl_button() {
	    account.withdrawBtn();
	}	
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
