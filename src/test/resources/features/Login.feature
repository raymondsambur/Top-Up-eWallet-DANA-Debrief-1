@Android @Login
Feature: Login

  @ValidLogin
  Scenario: login with valid username and password
    Given User is on Login Page
    When User input phone "6282189814330" on phone form
    And User input password "Rahasia123!" on password form
    And User click signIn button
    Then User is on Home Page

  @EmptyUsername
  Scenario: Verify User Login without input on Username Field
    Given User is on Login Page
    When User input password "Test" on password form
    And User click signIn button
    Then User See Error Message for Empty Field