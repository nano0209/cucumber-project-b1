Feature: Validation of Leads in Advisor

  Background:
    Given user is on Docuport login page

    Scenario: Login Docuport
      When user enters username for advisor
      And user clicks on "Leads" option
      Then user should validate that Rows Per Page shows by default 10


