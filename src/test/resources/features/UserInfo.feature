@Android @UserInformation
Feature: User Information

  Background:
    Given User is on Login Page
    And User input phone "6282189814330" on phone form
    And User input password "Rahasia123!" on password form
    And User click signIn button
    And User is on Home Page

  Scenario: Check user credential
    When User click user information
    Then User is on User Information Page