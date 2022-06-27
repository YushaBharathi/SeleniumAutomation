@LoginDemo
Feature: Login Demo site

#Scenario Outline: Login is successful with valid credentials
#Given Open Demo Login Browser
#And Navigate to Login Page
#When Enter <Username> and <Password>
#And click on LoginButton
#Then  Navigate to home Page and clikc Logout
#
#Examples:
#	|Username|Password|
#	|Karthikeyan|12345|
#	|Arvind|12345|
#	|Heamanth|12345|

Background: User login
Given Open Demo Login Browser

Scenario: Login is successful with valid credentials
#Given Open Demo Login Browser
And Navigate to Login Page
When Enter username and Password
			|Karthikeyan|12345|
			|Arvind|12345|
And click on LoginButton
Then  Navigate to home Page and clikc Logout


Scenario: Validate google search is working
    #Given Open browser
    And Navigate to google search Page
    When Enter text in search box
    And Hit Enter
    Then Validate Search Results
