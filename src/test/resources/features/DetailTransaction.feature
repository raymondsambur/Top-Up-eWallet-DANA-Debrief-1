@Android @DetailTransaction
  Feature: Detail Transaction

    Background:
      Given User is on Login Page
      And User input phone "6282189814330" on phone form
      And User input password "Rahasia123!" on password form
      And User click signIn button
      And User is on Home Page
      And User click Top Up button on Home Page

    @VerifyTransactionData
    Scenario: Verify transaction data
      Given User is on Top Up Page
      When User input "100.000" as Top Up amount
      And User click Select Payment Method button on Top Up Page
      And User is on Choose Payment Method Page
      And User is on Choose Payment Method Page
      And User choose "BCA" as Payment Method
      And User click Pay button on Choose Payment Type Page
      And User is on Detail Transaction Page
      Then User see transaction Top Up amount as "Rp.100.000"
      And User see transaction Status is "Pending"
      And User see transaction date
      And User see transaction payment method is "Bank Transfer"
      And User see transaction payment name is "BCA"
      And User see transaction validity timer

    @VerifyTransactionWithBankTakeFromCamera
    Scenario: Verify transaction using Bank with upload receipt take from camera
      Given User is on Top Up Page
      And User input "100.000" as Top Up amount
      And User click Select Payment Method button on Top Up Page
      And User is on Choose Payment Method Page
      And User is on Choose Payment Method Page
      And User choose "BCA" as Payment Method
      And User click Pay button on Choose Payment Type Page
      When User is on Detail Transaction Page
      And User click confirm button on Detail Transaction Page
      And User is on Confirm Upload Receipt
      And User click take photo button
      And User choose take from camera
      And User take a receipt photo
      And User click confirm button on Confirm Upload Receipt Page
      And User click confirm button on pop up message confirmation
      Then User is on Detail Transaction Page

