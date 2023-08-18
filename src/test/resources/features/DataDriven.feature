Feature: Test login functionality

@DataDriven
Scenario Outline: Check login is sucessful with vaild credentials
   Given user is on login page
   And <username> and <password> are entered by user
   When user click on login button 
   Then user navigate to home page
   
   Examples:
      | username | password |
      | Kajal    | testing  |
      | Ravi     | 567Abs   |
      | Mahesh   | test123  |
      