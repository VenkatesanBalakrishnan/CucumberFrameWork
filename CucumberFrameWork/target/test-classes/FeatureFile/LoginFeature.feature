
Feature: Gmail Login Feature

 
  Scenario: Login as a invalid user and verify Error message
  
    Given Launch Gmail Application
    When Enter the invalid "mnbjfhdxcchgkdy"
    And  Click on "Next" button
    #Then Verify the Error message
    #And Could not find your google account error message is Displayed
 