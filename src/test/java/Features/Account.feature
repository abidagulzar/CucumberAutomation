Feature: Banking Application Login
  Background:
  Given validate the browser
  When browser is triggered
  Then check if browser is started

  @AdminPortalTest
  Scenario: Home page default login

    Given User is on banking landing page
    When user login by "abidarana" and password "54321"
    Then Home page is populated
    And Cards displayed are "true"