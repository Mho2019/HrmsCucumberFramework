@Login
Feature: Login Functionality


Scenario: Valid Login

Given User navigates to the login page
When User Enters the valid Username and Valid Password 
And  User Clicks on the login button
Then User Should successfully login into the application

Scenario: InValid Login

Given User navigates to the login page
When User Enters the Invalid Username and Valid Password 
And  User Clicks on the login button
Then User Should not successfully login into the application