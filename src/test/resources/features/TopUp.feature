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

    @SelectNominal10
    Scenario: User choose Top Up amount of 10000
      When User click '10000' as