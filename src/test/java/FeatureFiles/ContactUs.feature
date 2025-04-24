Feature: Validate the functionality of Contact Us

  Scenario Outline: Validate the contact us form with positive data
    Given User launch the application
    When User clicks on the Contact US link
    And User enters the name "<Name>"
    And User enters the email "<Email>"
    And User enters the Phone Number "<PhoneNumber>"
    And User enters the Address "<Address>"
    And User enters the country "<Country>"
    And User enters the ZipCode "<ZipCode>"
    And User clicks on the submit button
    Then Validate that user is getting success message after contact us form submission
   
    Examples: 
      | Name | Email         | PhoneNumber | Address | Country | ZipCode |
      | abc  | abc@gmail.com |  9876543210 | Pune    | India   |   12345 |
