@smoke
Feature: Docuport Login Logout Feature
  Background: will run for each scenario first
    Given user is on Docuport login page

  Scenario: Login as a client
    When user enters username for client
    When user enters password for client
    And user clicks login button
    Then user should see the home page for client


  Scenario: Login as a employee
    When user enters username for employee
    And  user enters password for employee
    And  user clicks login button
    Then user should see the home page for employee


  Scenario: Login as a advisor
    When user enters username for advisor
    And  user enters password for advisor
    And  user clicks login button
    Then user should see the home page for advisor


  Scenario: Login as a supervisor
    When user enters username for supervisor
    And  user enters password for supervisor
    And  user clicks login button
    Then user should see the home page for supervisor