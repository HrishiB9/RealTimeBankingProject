Feature: Validate the Account details functionality

  Background: 
    Given User launch the application
    And User clicks on the Account details link
    And User selects the name from dropdown
    And User clicks on the login button

  Scenario Outline: Validate the deposit & withdrawl functionality of account details
    When User verifies the welcome label
    And User selects the Account number
    And User clicks on the deposit option
    And User enters the deposit amount in the amount field "<DepositAmount>"
    And User clicks on the Deposit button
    And Validate the total account balance
    And User clicks on the Withdrawl option
    And User enters the withdrawl amount in the amount field "<WithdrawlAmount>"
    And User clicks on the Withdrawl button
    And User validate the remaining balance

    Examples: 
      | DepositAmount | WithdrawlAmount |
      |          5000 |            2000 |
