@mustRun
Feature: Test Login Functionality

  Background: This is for common steps
    Given User should be logged in and should be present at its own wall
    @smokeō
  Scenario: Post a message on user wall
    When I type the message as "My Post" in the text box
    And Click on post button
    Then Then message should get posted
@regression @smoke
  Scenario: Post a video on user wall
    When User supply the youtube link as "http://www.google.com" in the text box
    And Click on post button
    Then  Then video should get posted on the user wall
    And The video should have proper thumbnail
@regression @important
  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And User is on login page
    When User enters <username> and <password>
    And User click on login button
    Then User is navigate to the homepage

    Examples:
      | username        | password     |
      | standard_user   | secret_sauce |
      | performance_glitch_user |secret_sauce  |