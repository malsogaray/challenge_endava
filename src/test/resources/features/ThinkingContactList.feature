Feature: Contact List 
    In order to add new user, get a list o users created and remove users from the contact list
    as an Admin 
    I want to add, update and remove a user from the contact list

Scenario: I can add a new user into the Contact list 
Given I navigate to Thinking Contact List page
And I loguin in Thinking Contact List page
And I press on add a new contact button
Then I navigate to add contact page
And I enter a first name into Fist name text field
And I enter a last name into Last name text field
And I enter an email into Email text field
And I enter a password into Password text field
When I press on Submit button
Then the new user is added


