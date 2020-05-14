@Android @Login
Feature: Login

  Scenario: login with valid username and password
    Given User is on Login Page
    When User input phone "6285708123799" on phone form
    And User input password "Mantapjiw@0" on password form
    And User click signIn button
    Then User is on Home Page