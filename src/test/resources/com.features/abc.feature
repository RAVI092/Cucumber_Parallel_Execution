Feature: Spice agent Login 
Scenario Outline: : Login with in-valid data 

	Given user is at home page 
	When user move to login section and click the Travel Agent login section 
	And enter the user name <"uname"> and password <"pwd"> and click the sign-in button 
	Then verfiy that he is on the agent home page. 
	
	Examples: 
		|uname|pwd|
		|ravi|4654|
		
		
		
	 
Scenario Outline: : Login with valid data 

	Given user is at homepage 
	When user move to login section and click the TravelAgent login section.
	And enter the valid user name <"uname"> and password <"pwd"> and click the sign-in button.
	Then verfiy that he is not on the agent home page
	
	Examples: 
		|uname|pwd|
		|ravi|4654|