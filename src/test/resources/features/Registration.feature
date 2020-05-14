@Registration
  Feature: Check Registration Main Features

    Scenario: Verify Register as New User
      Given User Click Register Button On Login Page
      And User Is On Register Page
      When User Input "John" as First Name
      And User Input "Cena" as Last Name
      And User Input "082189814330" as Phone Number
      And User Input "raymondsambur@gmail.com" as Email
      And User Input "Rahasia123!" as Password
      And User Input "Rahasia123!" as Retype Password
      And User Click Register
      Then User is Directed to Verification Page