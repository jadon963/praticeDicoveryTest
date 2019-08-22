Feature: Add videos from HomePage
  Scenario Outline: Add videos from Recommended
    Given User is already on homePage
    When user scroll down upto recommended section
    Then user add <firstVideo> and <secondVideo> from recommended
    Then Verify favorites to My videos

    Examples:
      | firstVideo | secondVideo |
      | 0  | 1 |