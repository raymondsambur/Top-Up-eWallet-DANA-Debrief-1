@Android @TopUp
Feature: Top Up

  Background:
    Given User is on Login Page
    And User input phone "6285708123799" on phone form
    And User input password "Mantapjiw@0" on password form
    And User click signIn button
    And User is on Home Page
    And User click Top Up button on Home Page
    And User is on Top Up Page

  @SelectTopUpAmount
  Scenario Outline: User choose Top Up amount of 10000
    When User click "<Nominal>" as Top Up amount
    And User click Select Payment Method button on Top Up Page
    Then User is on Detail Transaction Page
    Examples:
      | Nominal |
      | 10.000  |
      | 20.000  |
      | 50.000  |
      | 100.000 |
      | 200.000 |
      | 500.000 |

  @VerifyBackButton
  Scenario: Verify Back button functionality on Top Up Page
    When User click Back Button On Top Up Page
    Then User is on Home Page