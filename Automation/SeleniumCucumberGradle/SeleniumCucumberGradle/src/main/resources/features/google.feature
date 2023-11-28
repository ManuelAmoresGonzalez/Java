
Feature: Test google search functionallity

  @Smoke
  Scenario: As a user I enter a search criteria in google
    Given I am on the google search page
    When I enter a search criteria
    And Click on the search button
    Then The results match the criteria