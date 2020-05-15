@Android @Login
Feature: Login

  @ValidLogin
  Scenario: login with valid username and password
    Given User is on Login Page
    When User input phone "6285708123799" on phone form
    And User input password "Mantapjiw@0" on password form
    And User click signIn button
    Then User is on Home Page

  @EmptyUsername
  Scenario: Verify User Login without input on Username Field
    Given User is on Login Page
    When User input password "Test" on password form
    And User click signIn button
    Then User See Error Message for Empty Field

  @EmptyPassword
  Scenario: Verify User Login without input on Password Field
    Given User is on Login Page
    When User input phone "6285708123799" on phone form
    And User click signIn button
    Then User See Error Message for Empty Field