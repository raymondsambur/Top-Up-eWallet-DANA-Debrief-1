@Android @TopUp
Feature: Top Up

  Background:
    Given User is on Login Page
    And User input phone "6282189814330" on phone form
    And User input password "Rahasia123!" on password form
    And User click signIn button
    And User is on Home Page
    And User click Top Up button on Home Page

  @SelectTopUpAmount
  Scenario Outline: User choose Top Up amounts
    When User is on Top Up Page
    And User input "<Nominal>" as Top Up amount
    And User click Select Payment Method button on Top Up Page
    Then User is on Choose Payment Method Page
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