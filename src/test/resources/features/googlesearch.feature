#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Google Page Search
  This feature is for verifying google page


  Scenario: Search Java Tutorial
    Given I launch google page    
    When I search Java Tutorial
    Then Should display Java result page
    And close the browser

  Scenario: Search Selenium Tutorial
    Given I launch google page    
    When I search Selenium Tutorial
    Then Should display Selenium result page
    And close the browser
