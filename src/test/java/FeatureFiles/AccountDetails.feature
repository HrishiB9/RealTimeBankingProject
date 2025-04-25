Feature: Validate the Account details functionality

  Background: 
    Given User launch the application
    And User clicks on the Account details link
    And User selects the name from dropdown
    And User clicks on the login button

  Scenario Outline: Validate the deposit functionality of account details
    When User verifies the welcome label
    And User selects the Account number
    And User clicks on the deposit option
    And User enters the deposit amount in the amount field "<DepositAmount>"
    And User clicks on the Deposit button
    And Validate the correct balance

  Scenario Outline: Validate the withdrawl functionality of account details
    When User verifies the welcome label
    And User selects the Account number
    And User clicks on the Withdrawl option
    And User enters the withdrawl amount in the amount field "<WithdrawlAmount>"
    And User clicks on the Withdrawl button
    And Validate the correct balance

    Examples: 
      | DepositAmount | WithdrawlAmount |
      |         4000 |            2000 |
