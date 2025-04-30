Feature: Validate the sign up functionatlity of application

  Scenario Outline:  Validate the positive scenario of user registration
    Given User launch the application
    When User click on the sign up button
    And User enters the First name as "<FirstName>"
    And User enters the Last name as "<LastName>"
    And User enters the Phone as "<PhoneNumber>"
    And User enters the DOB as "<DOB>"
    And User selects the gender
    And User enters the city as "<City>"
    And User enters the User name as "<Username>"
    And User enters the Password as "<Password>"
    And User click on the Sign up button
    Then Validate that user is getting success message from application
    And Verify that the title of the page is showing correct value
    
    Examples:
      | FirstName | LastName | PhoneNumber | DOB        | City | Username | Password |
      | Ram       | Mahajan  |  9876543210 | 11 12 2015 | Pune | Ram      |    12345 |
