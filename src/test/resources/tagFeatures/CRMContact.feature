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
@ModuleOne
Feature: Handle CRM Contact module
  I want to use this template for my feature file

Background:
# to setup the details in application level whereas before tag is for test case level
Given User enters valid Login

  @tag2
  Scenario: Create Contact
  	
    When User create a new contact
    
    @SmokeTest
   Scenario: View Contact details
   
    When User view contact details
       
  @RegressionTest  @SmokeTest
   Scenario: Edit Contact details
   
    When User edits contact details
    
    @SmokeTest
  	Scenario: Delete Contact details
  		
    	When User deletes contact details
    	
  @RegressionTest        
  Scenario: User Logout
  
    When User Logout
