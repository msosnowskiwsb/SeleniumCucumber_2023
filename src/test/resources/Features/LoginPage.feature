Feature: Test OrangeHRM with wrong credentials

  Scenario: Check login with wrong credentials
    Given Open login page
    When User enters unsername and password
    And Click on login button
    Then The validation message is displayed