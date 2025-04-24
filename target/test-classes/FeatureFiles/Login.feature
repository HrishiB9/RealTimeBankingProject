Feature: Validate the login functionalty of application

  Scenario Outline: Validate the positive scenario of login functionality
    Given User launch the application
    When Click on the Login Button
    And User enters the login Username as "<Username>"
    And User enters the login  Password as "<Password>"
    And Click on the login buton
    Then Validate that user is getting success message after login successfully
    And Verify that the title of the page 

    Examples: 
      | Username | Password |
      | Ram      |    12345 |
