
Feature: Grouping feature
Background:Grouping Feature Background
Scenario: Background scenario
Given Background Steps

 		@Regression
  	Scenario: Regression scenario
    Given Regression Test Feature
    
    @Smoke
    Scenario: Smoke scenario
    Given Smoke Test Feature
    
    @Sanity
    Scenario: Sanity scenario
    Given Sanity Test Feature
    
    @Regression @Sanity
    Scenario: RegressionSanity scenario
    Given RegressionSanity Test Feature
    