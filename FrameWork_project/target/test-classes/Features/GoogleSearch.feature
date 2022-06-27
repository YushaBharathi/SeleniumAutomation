Feature: Google Search functionality

  Scenario: Validate google search is working
    Given Open browser
    And Navigate to google search Page
    When Enter text in search box
    And Hit Enter
    Then Validate Search Results
