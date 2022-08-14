@datatable
Feature: DataTable feature

  @no_param
  Scenario: Scenario have no parameter
    Given Open facebook application
    When Input to Username textbox
    And Input to Password textbox
    And Click to submit button
    And Close application
    
    @param_mark
  Scenario: Scenario have parameter
    Given Open facebook application
    When Input to Username textbox with "automationtest@gmail.com"
    And Input to Password textbox with "123456"
    And Click to submit button
    And Close application
    
    @param_no_mark
  Scenario: Scenario have parameter
    Given Open facebook application
    When Input to Username textbox with automationtest@gmail.com
    And Input to Password textbox with 123456
    And Click to submit button
    And Close application
    
    @multiple_param
  Scenario: Scenario have parameter
    Given Open facebook application
    When Input to Username textbox with "automationtest@gmail.com" and Password textbox with "123456"
    And Click to submit button
    And Close application
    
    @datatable_step
  Scenario Outline: Create new Customer with email <Username>
    Given Open facebook application
     When Input to Username and Password
      | Username   | Password   |
      | <Username> | <Password> |
      And Click to submit button
      And Close application
  
    Examples: 
      | Username                 | Password |
      | automationtest@gmail.com | 123456   |

     @datatable_scenario @data_driven_testing
  	Scenario Outline: Data Table in Scenario
    Given Open facebook application
    When Input to Username textbox with "<Username>"
    And Input to Password textbox with "<Password>"
    And Click to submit button
    And Close application
   
  	 Examples: 
   		| Username               | Password |
   		| automation01@gmail.com | 123456   | 
   		| automation02@gmail.com | 123456   | 
   		| automation03@gmail.com | 123456   | 
   
   