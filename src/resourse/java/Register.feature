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

Feature: Registration
  
  
  Scenario: Register user details
    Given User not previously registered with test me 
   
   # And some other precondition
   
    When User enter valid credentials of  username "tobykuttan1" , 
    And firstname as "toby" 
    And Lastname "kuttan" 
    And password  "12345678"
    And Confirm password  = "12345678"
    And choose gender as "Male"
    And Enter email address as "tobykuttan@gmail.com"
    And Mobile number  "9004163198"
    And Select DOB as 10/31/1997
    And Enter the Address as "212 Royal garden, No 12 North Avenue, Keshavaperumal Puram RA Puram, Chennai 600028"
    And Select the security question "What is your faviourite color "
    And Enter the Answer as "Tiger"
    And click the "Register" button
    
    Then User directed to home page

 