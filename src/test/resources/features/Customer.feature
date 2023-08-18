
Feature: Customers
 
 Background: Below are common steps for every scenario
  Given User launch chrome browser
  When User open URL "https://admin-demo.nopcommerce.com/login"
  And User enter email "admin@yourstore.com" and password "admin"
  And User click on login
  Then User can view Dashboad

  Scenario: Add a new customer
  When  User Click on cutomer menu
  And click on customer menu Item
  And click on Add new button
  Then User can view Add new customer page
  When User enter customer info
  And Click on save button
  Then close browser
  
  Scenario: Search Customer by EmailID
  When User Click on cutomer menu
  And click on customer menu Item
  And Enter customer Email
  When Click on Search button
  Then User should found Email in the search table
  And close browser
  
  Scenario: Search Customer by Name
  When User Click on cutomer menu
  And click on customer menu Item
  And Enter customer Firstname
  And Enter customer Lastname
  When Click on Search button
  Then User should found Name in the search table
  And close browser
  
   

  
