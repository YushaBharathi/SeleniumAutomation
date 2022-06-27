@Background
Feature: Login Site
Background:
Given Open browser url Page

Scenario Outline: Facebook url
Given Open the Fb url
And Enter <Username> and <Password>
Then Close the Driver
  
Examples:
|Username|Password|
|Abcd@gmail.com|hwdyged|

#
#Scenario: Organe url
#Given Open the Organe url
#And Enter the <name> and <passcode>
#Then Close the all url
#
#
#
#Examples:
#|name|passcode|
#|Admin|admin123|
#
