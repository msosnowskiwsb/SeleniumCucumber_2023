Feature: Test OrangeHRM with wrong credentials

  Scenario Outline: Check login with wrong credentials
    Given Open login page
    When User enters <username> and <password>
    And Click on login button
    Then The validation <message> is displayed

    Examples:
    | username | password    | message             |
    | Admin    | admin321321 | Invalid credentials |
    | ąśęłó    | gdsjakddddd | Invalid credentials |
    | admin    | ąśćfdff     | Invalid credentials |
