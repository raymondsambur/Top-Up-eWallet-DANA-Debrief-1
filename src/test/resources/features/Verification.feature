#@Android @Verification
#  Feature: Verification
#
#    @VerifyResendOTP
#    Scenario: Verify Resend OTP
#      Given User is on Login Page
#      And User Click Register Button On Login Page
#      And User Is On Register Page
#      When User Input "John" as First Name
#      And User Input "Cena" as Last Name
#      And User Input "rayjhonathan97@gmail.com" as Email
#      And User Input "6285155208864" as Phone Number
#      And User Input "Rahasia123!" as Password
#      And User Input "Rahasia123!" as Retype Password
#      And User Click Register On Register Page
#      And User click Back Button On Verification
#      And User is on Login Page
#      When User input phone "6285155208864" on phone login page
#      And User input password "Rahasia123!" on password login page
#      And User click signIn button
#      And User is on Email Verification Page
#      And User input "rayjhonathan97@gmail.com" as email
#      And User click verify button on Email Verification Page
#      And User is Directed to Verification Page
#      And User click resend button on Email Verification Page
#      And User input otp code
#      And User click Validate button on Verification Page
#      And User is on Login Page
#      And User input phone "6285155208864" on phone form
#      And User input password "Rahasia123!" on password form
#      And User click signIn button
#      Then User is on Home Page