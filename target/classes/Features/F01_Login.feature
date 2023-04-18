Feature: User should be able to Login and make some transactions

    # Test scenario 1
  Scenario: User Login then deposit and withdraw
    Given user navigate to the home page
    When user login to the profile page
    And user deposit 1000 in his account
    And user withdraw 400 from his account
    Then transaction done successfully
    And assert the withdraw


