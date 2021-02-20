Feature: Login Functionality

@RegressionTest
Scenario Outline: InValid Login with Multiple set of data

Given User navigates to the login page and Enters the userID "<Username>" and password "<Password>"
And  User Clicks on the login button
Then User verify if correct "<ErrorMessage>" is displayed


Examples: 
|Username|Password|ErrorMessage|
|Admin|admi4567|Invalid credentials|
|murad|admin123|Invalid credentials|
|murad|meat123|Invalid credentials|