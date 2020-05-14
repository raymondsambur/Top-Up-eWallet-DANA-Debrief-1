@Android @Registration
  Feature: Check Registration Main Features

    @RegisterValid
    Scenario: Verify Register as New User
      Given User is on Login Page
      And User Click Register Button On Login Page
      And User Is On Register Page
      When User Input "John" as First Name
      And User Input "Cena" as Last Name
      And User Input "raymondsambur@gmail.com" as Email
      And User Input "6282189814330" as Phone Number
      And User Input "Rahasia123!" as Password
      And User Input "Rahasia123!" as Retype Password
      And User Click Register On Register Page
      Then User is Directed to Verification Page

    @BackButton
    Scenario: Verify Back Button functionality
      Given User is on Login Page
      And User Click Register Button On Login Page
      When User Click Back Button On Register Page
      Then User is on Login Page

    @ErrorMessageFirstName
    Scenario: Verify Error Message Format for When User Didn't Input First Name
      Given User is on Login Page
      And User Click Register Button On Login Page
      And User Is On Register Page
      When User Input "Cena" as Last Name
      And User Input "test@mail.com" as Email
      And User Input "628123456789" as Phone Number
      And User Input "Rahasia123!" as Password
      And User Input "Rahasia123!" as Retype Password
      And User Click Register On Register Page
      Then User See Error Message In First Name Field

    @ErrorMessageLastName
    Scenario: Verify Error Message Format for When User Didn't Input Last Name
      Given User is on Login Page
      And User Click Register Button On Login Page
      And User Is On Register Page
      When User Input "John" as First Name
      And User Input "test@mail.com" as Email
      And User Input "628123456789" as Phone Number
      And User Input "Rahasia123!" as Password
      And User Input "Rahasia123!" as Retype Password
      And User Click Register On Register Page
      Then User See Error Message In Last Name Field

    @ErrorMessageEmail
    Scenario: Verify Error Message Format for When User Didn't Input Email
      Given User is on Login Page
      And User Click Register Button On Login Page
      And User Is On Register Page
      When User Input "John" as First Name
      And User Input "Cena" as Last Name
      And User Input "628123456789" as Phone Number
      And User Input "Rahasia123!" as Password
      And User Input "Rahasia123!" as Retype Password
      And User Click Register On Register Page
      Then User See Error Message In Email Field

    @ErrorMessagePhoneNumber
    Scenario: Verify Error Message Format for When User Didn't Input Phone Number
      Given User is on Login Page
      And User Click Register Button On Login Page
      And User Is On Register Page
      When User Input "John" as First Name
      And User Input "Cena" as Last Name
      And User Input "test@mail.com" as Email
      And User Input "Rahasia123!" as Password
      And User Input "Rahasia123!" as Retype Password
      And User Click Register On Register Page
      Then User See Error Message In Phone Number Field

    @ErrorMessagePassword
    Scenario: Verify Error Message Format for When User Didn't Input Password
      Given User is on Login Page
      And User Click Register Button On Login Page
      And User Is On Register Page
      When User Input "John" as First Name
      And User Input "Cena" as Last Name
      And User Input "test@mail.com" as Email
      And User Input "628123456789!" as Phone Number
      And User Input "Rahasia123!" as Retype Password
      And User Click Register On Register Page
      Then User See Error Message In Password Field

    @ErrorMessageRetypePassword
    Scenario: Verify Error Message Format for When User Didn't Input Retype Password
      Given User is on Login Page
      And User Click Register Button On Login Page
      And User Is On Register Page
      When User Input "John" as First Name
      And User Input "Cena" as Last Name
      And User Input "test@mail.com" as Email
      And User Input "628123456789!" as Phone Number
      And User Input "Rahasia123!" as Password
      And User Click Register On Register Page
      Then User See Error Message In Retype Password Field