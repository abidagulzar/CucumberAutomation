Feature: Banking Application Login
  Scenario: Home page default login

    Given User is on banking landing page
    When user login into application with "rana" and password "4321"
    Then Home page is populated
    And Cards displayed are "true"

  Scenario: Home page default login

    Given User is on banking landing page
    When user login into application with "abida" and password "12345"
    Then Home page is populated
    And Cards displayed are "false"