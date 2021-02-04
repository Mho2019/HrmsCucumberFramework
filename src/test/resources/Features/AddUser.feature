Feature: Add new User Functionality

@AddNewUser
Scenario: Add new User with valid Details


Given User login with valid credintals 
And User navigate to Add new user page 
When User Enters following user details "Aaliyah Haq" "user5" "Password1" and "Password1"
And  User Clicks on the Save button
Then User is added successfully