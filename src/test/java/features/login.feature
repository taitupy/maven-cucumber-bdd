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
@login
Feature: Title of your feature
  I want to use this template for my feature file

#Background: 
	#Given Open facebook application

 @tag1
  Scenario: Scenario have no parameter
    When Input to Username textbox
    And Input to Password textbox
    And Click to submit button
    
 @tag2
  Scenario: Scenario have parameter
    When Input to Username textbox with "automationtest@gmail.com"
    And Input to Password textbox with "123456"
    And Click to submit button
