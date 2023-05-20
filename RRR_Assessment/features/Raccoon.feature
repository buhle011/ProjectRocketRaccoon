#Author: Lungani Delihlazo

Feature: CRUD for Project Rocket Raccoon
 
 Background:
       Given Launch the browser
       And I am on the Project Rocket Raccoon page 
		   Then I verify Rocket Raccoon name
 
  
  Scenario: Test the Delete functionality
     And I click the delete button
		Then directed to the delete page
		And Clicked the yes button
		Then User directed to the home page
		
 
  @Test
  Scenario Outline: Test Add functionality
    And I click the Add button
    Then I enter page "title" and "discription"
    And I click the Submit button
    

    Examples: 
      | title   | description   | 
      | Project | RocketRacoon  | 
      
