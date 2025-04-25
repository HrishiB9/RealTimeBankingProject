Feature: Validate the login functionalty of application

Background: 
    Given User launch the application
    And Click on the Login Button

  Scenario Outline: Validate the valid credentials of login functionality
    When User enters the login Username as "<Username>"
    And User enters the login  Password as "<Password>"
    And Click on the login buton
    Then Validate that user is getting success message after login successfully
    And Verify that the title of the page 

    Examples: 
      | Username | Password |
      | Ram      |    12345 |
      |Sham	     | 98765    |

      
      
   Scenario Outline: Validate the invalid credentials of login functionality
    When User enters the login Username as "<Username>"
    And User enters the login  Password as "<Password>"
    And Click on the login buton
    Then Validate that user is getting error message
   

    Examples: 
      | Username | Password |
      |          |          |
     
  