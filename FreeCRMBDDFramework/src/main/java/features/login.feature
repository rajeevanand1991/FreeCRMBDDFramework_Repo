Feature: Free CRM login feature

Scenario: Free CRM login test scenario
Given user is already available on login page
When title of login page is free crm
Then user enter user name and password
Then user click on login button
And user is on home page