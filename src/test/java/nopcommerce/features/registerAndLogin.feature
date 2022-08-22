Feature: Register and Login

 @register_login
  	Scenario: Register to system and login
	    # Open Url -> Hooks
	    Given Open Register page
	    When Input to first name textbox
	    And Input to last name textbox
	    And Input to email textbox
	    And Input to password textbox
	    And Input to confirm password textbox
	    And Click to Register button
	    And Register account completed displayed
