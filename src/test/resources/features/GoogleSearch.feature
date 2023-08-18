Feature: Feature to test google search functionality

@SmokeTest
Scenario: Validate Google search is working
Given browser is open
And User is on google search page
When Uase ebters a test in search box
And User hits enter
Then User is navigated to search results