 Feature: Test Login Functionality

Scenario: Check login is successful with valid credentials
Given Set Drivers
  And Browser is open
When Type amazon on search box
  And click on search
Then User is navigate to the homepage

