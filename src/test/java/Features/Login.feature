Feature: Banking Application Login
@sanityTest
  Scenario: Home page default login

    Given User is on banking landing page
    When user login by "rana" and password "4321"
    Then Home page is populated
    And Cards displayed are "true"
  @sanityTest
  Scenario: Home page default login

    Given User is on banking landing page
    When user login by "abida" and password "12345"
    Then Home page is populated
    And Cards displayed are "false"
  @sanityTest
  Scenario: Home page default login

    Given User is on banking landing page
    When user signup with the following detail
    |abbi|12345|abidarana96@gmail.com|Lahore|
    Then Home page is populated
    And Cards displayed are "false"

  @smokeTest @RegTest
  Scenario Outline: Home page default login
    Given User is on banking landing page
    When user login into application <Username> password <password>
    Then Home page is populated
    And Cards displayed are "true"
    Examples:
      |Username|password|
    |user1   |u12345   |
    |user2   |u12345   |
    |user3   |u12345   |
    |user4   |u12345   |
    |user5   |u12345   |



