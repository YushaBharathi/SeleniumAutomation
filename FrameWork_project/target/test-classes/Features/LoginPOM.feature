 @LoginpagePom
 Feature: Login application and Verify pom
@Loginpage1
Scenario Outline: Checking login functionality using POM
Given  User login the page pom
Then  User Enter the <Username> and <Password> pom
And  Click the Login Button pom
Then User Navigate to Home Page pom

Examples:
|Username|Password|
|Karthikeyan|12345|

#@Loginpage2
#Scenario: Checking login functionality using POM
#Given  User loginn the pages