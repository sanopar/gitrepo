Feature: adding one item in cart

@tag1
Scenario: log in to the application
Given  launch the swag labs
When I entered the username in the username field
And I entered the Password in the password field
And I clicked the login button
Then i logged in into the page

@tag2
Scenario: selecting an item
When I clicked the  sauce labs Fleese jacket
And  i clicked the add to cart option

@tag3
Scenario: checking the cart
When i clicked the cart button
And i checked whether the item is added to the cart
Then the item is added to the cart
