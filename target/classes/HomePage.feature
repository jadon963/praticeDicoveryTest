Feature: Add videos from HomePage
  Scenario: Add videos from Recommended
    Given User is already on homePage
    When user scroll down upto recommended section
    Then user addVideos from recommended
    And Navigate to MyVideos page
    Then Verify favorites added to My videos
