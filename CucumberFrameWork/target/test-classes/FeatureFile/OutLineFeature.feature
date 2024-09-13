

Feature: Title of your feature
  I want to use this template for my feature file

 
  Scenario Outline: Login as a invalid user and verify error message
  
   Given Launch Gmail Application
    When Enter the invalid <name>
    And  Click on "Next" button

    Examples: 
      |name|
      | "kjifdtfukjkjgct" |   
      | "hjfdfgjyfdcfghh" | 
      | "iufydtrdtgkhhjs" |
