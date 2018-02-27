Feature: This is just a test feature for cucumber

Scenario: User searchers an item on google and check if the title matches the keyword

	Given I navigate to google homepage 
	When i enter a keyword to search
	And I click on the search button 
	Then i should be able to see the title contains the keyword
	