Feature: validate the buttons

  Background:
    Given User is on Docuport login page

  @wip
  Scenario Outline: login as an advisor
    When user enters credentials "<username>" and "<password>"
    And click on Received documents
    And validate search button is displayed for Received docs
    And validate download button is displayed for Received docs
    And validate Received docs is displayed
    Then click on MyUploads
    Then validate search button is displayed for MyUploads
    Then validate download button is displayed for MyUploads
    Then validate MyUploads is displayed

    Examples:
      | username                  | password |
      | b1g1_advisor@gmail.com    | Group1   |
      | b1g1_supervisor@gmail.com | Group1   |
      | b1g1_employee@gmail.com   | Group1   |
      | b1g1_client@gmail.com     | Group1   |