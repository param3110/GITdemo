

Feature: Search Engine

Scenario: user gets the search correct
Given user logs in as a User
When  user types in the search bar
And user enters the word "head"
And user clicks on Find Details
And user clicks on "Add to Cart" 
And cart is updated with the number of objects in it
And user clicks on cart
Then user proceeds with payment

Scenario: user gets the search wrong
Given user logs in as a User
When  user types in the search bar
And user enters the word "gfdghv"
And user clicks on Find Details
Then user remains on the same page