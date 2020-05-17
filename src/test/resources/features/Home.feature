@Android @Home
  Feature: Home

    Background:
      Given User is on Login Page
      And User input phone "6282189814330" on phone form
      And User input password "Rahasia123!" on password form
      And User click signIn button
      And User is on Home Page

    @VerifyTopUpButton
    Scenario: Verify Top Up button functionality
      When User click Top Up button on Home Page
      Then User is on Top Up Page

    @VerifyHomeButton
    Scenario: Verify Home button functionality
      When User click Home button on Home Page
      Then User is on Home Page

    @VerifyHistoryButton
    Scenario: Verify History button functionality
      When User click History button on Home Page
      Then User is on History Page

    @VerifyUserInformationButton
    Scenario: Verify User Information button functionality
      When User click User Information button on Home Page
      Then User is on User Information Page