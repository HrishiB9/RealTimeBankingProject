package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageObjects.ContactsUsPage;
import PageObjects.ForgetPage;
import PageObjects.LoginPage;
import PageObjects.SignUpPage;
import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass extends BaseClass
{
	WebDriver driver = BaseClass.initializeDriver();
	SignUpPage page = new SignUpPage(driver);
	LoginPage login = new LoginPage(driver);
	ForgetPage forgot = new ForgetPage(driver);
	ContactsUsPage contact = new ContactsUsPage(driver);
	
	 
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
	
	
	
		
	@When("Click on the Login Button")
	public void click_on_the_login_button()
	{
	   login.logLink();
	}
	
	@And("User enters the login Username as {string}")
	public void user_enters_the_login_username_as(String Username)
	{
	   login.userName(Username);
	}
	
	@When("User enters the login  Password as {string}")
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

}
