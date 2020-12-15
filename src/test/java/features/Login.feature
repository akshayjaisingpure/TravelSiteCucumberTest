@Login 
Feature: Login functionality 

Scenario Outline: 

	Given User is on the the main website page 
	When User clicks on login they should be directed to the login page 
	Then User enters username "<username>" and password "<password>" and login 
	Then User will land on the account page 
	
	Examples: 
		| username            | password |
		| user@phptravels.com | demouser |