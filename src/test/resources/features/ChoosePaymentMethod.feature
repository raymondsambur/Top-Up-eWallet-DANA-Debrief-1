@Android @ChoosePayment
Feature: Choose Payment Method

  Background:
    Given User is on Login Page
    And User input phone "6282189814330" on phone form
    And User input password "Rahasia123!" on password form
    And User click signIn button
    And User is on Home Page
    And User click Top Up button on Home Page
    And User is on Top Up Page
    And User input "10.000" as Top Up amount
    And User click Select Payment Method button on Top Up Page

  @ChoosePaymentType
  Scenario Outline: Verify User Choose Payment Method
    When User is on Choose Payment Method Page
    And User choose "<PaymentName>" as Payment Method
    And User see Purchase Pop Up
    And User see top up amount of "10.000"
    And User see "<PaymentName>" as Payment Name
    And User click Pay button on Choose Payment Type Page
    Then User is on Detail Transaction Page
    Examples:
      | PaymentName |
      | BCA         |
      | Indomaret   |
