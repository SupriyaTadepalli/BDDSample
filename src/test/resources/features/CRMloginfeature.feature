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
@tag
Feature: Free CRM Login
  

  @tag1
 # Scenario: Free CRM Login test scenario
  #  Given User is already on login page   
   # When user enters credentials
    #Then Should display HomePage
    #And close browser


 # Scenario: Free CRM Login test scenario
  #  Given User is already on login page   
  #  When user enters "corpdevops@gmail.com" and "CrmPro123"
  #  Then Should display HomePage
  #  And close browser
    
 #Scenario: Free CRM Login test scenario
 #   Given User is already on login page   
 #   When user enters "<username>" and "<password>"
 #   Then Should display HomePage
  #  And close browser
    
#   Examples:
#   	| username | password |
#   	|corpdevops@gmail.com|CrmPro123|
#    |tom23@gmail.com|Welcome123|
    
#  Scenario: Free CRM Login test scenario
#    Given User is already on login page   
#	   When user enters credentials
#	   |corpdevops@gmail.com|CrmPro123|
#    Then Should display HomePage
#    And close browser  
    
    
   Scenario: Free CRM Login test scenario
    Given User is already on login page   
	   When user enters credentials
	   |username|password|
	   |corpdevops@gmail.com|CrmPro123|
    Then Should display HomePage
    And close browser 