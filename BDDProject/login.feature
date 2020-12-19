Feature: Login validation

Scenario: Valid credential
#Given -Precondition
#And - Same type of statment
#When -
#Then -
#But - Except condition

Given open browser
And Navigate to url
When user type userid in textbox
And User type password in textbox
And User click on login button

Then User should land in profile page

Scenario Outline: Invalid credential


Given open browser
And Navigate to url
When user type <"userid"> in user textbox
And User type <"password"> in pass textbox
And User click on login button

Then User should not land in profile page

Examples:
|userId|password|
|user1|s233|
|user2|dg45|
