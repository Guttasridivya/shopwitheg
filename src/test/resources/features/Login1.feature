Feature: verify user login

Scenario:  verify user login with valid credentials

Given user launches shopwitheg site
When user enters valid credentials
And user clicks on login button
Then user will be navigated to landing page