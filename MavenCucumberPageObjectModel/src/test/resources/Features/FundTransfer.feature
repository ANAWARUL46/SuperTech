@FundTransfer
Feature: Transfer fund online function
User wants to transfer fund using fund transfer online

Scenario: Valid Payee No Amount
Given User is on fund transfer online page
When User will select payee "Jim" from payee drop down box
And User will enter " " in amount textbox
And User will click transfer button
Then User should see balance "2000.00" in balace amount field
And User should see message "Please a valid amount" 

Scenario: Valid Payee Valid Amount
Given User is on fund transfer online page
When User will select payee "Jim" from payee drop down box
And User will enter "500 " in amount textbox
And User will click transfer button
Then User should see balance "1500.00" in balace amount field
And User should see message "$500 transferred successfully to Jim!!" 

Scenario: Valid Payee Invalid Amount
Given User is on fund transfer online page
When User will select payee "Jim" from payee drop down box
And User will enter "7000 " in amount textbox
And User will click transfer button
Then User should see balance "2000.00" in balace amount field
And User should see message "Transfer failed!! account cannot be overdrawn" 

Scenario: Invalid Payee Valid Amount
Given User is on fund transfer online page
When User will select payee "John" from payee drop down box
And User will enter "70 " in amount textbox
And User will click transfer button
Then User should see balance "2000.00" in balace amount field
And User should see message "Transfer failed!! 'John' is not approved. Please contact your branch" 