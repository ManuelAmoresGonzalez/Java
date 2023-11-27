@Test
  Feature: Test different actions on a sandbox page
    Scenario: As a test engineer, I try out different actions on a sandbox page
      Given I navigate to the sandbox page
      And Select a value from the dropdown

      Scenario: As a test engineer, I want to retrieve the value of an static table.
        Given I navigate to the static table
        Then I can return the value I wanted
