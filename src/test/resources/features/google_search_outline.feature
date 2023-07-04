Feature: Scenario: outline practice
  @wip
  Scenario Outline: Google search cities
    Given user is on Google search page
    When user searches for the "<country>"
    Then user should see the "<capital>" in the result
    Examples:
      | country     | capital    |
      | Azerbaijan  | Baku       |
      | Ukraine     | Kyiv       |
      | Afghanistan | Kabul      |
      | Turkey      | Ankara     |
      | USA         | Washington, D.C. |

