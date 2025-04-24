Feature: Validate the Forgot password functionality

  Scenario Outline: Verify the forgot password with valid email id
    Given User launch the application
    When User clicks on the  Forget Password menu
    And User enters the email as "<Email>"
    And User enters the Mobile number "<MobileNo>"
    And User clicks on the Reset Password button
    Then Validate that user is getting success message after password reset successfully
    And Verify that the title of the page is showing correct value

    Examples: 
      | Email         | MobileNo   |
      | abc@gmail.com | 9876543210 |
