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
@tag
Feature: Login page of conduit
  To test the login page of conduit blogging web site

  @tag1
  Scenario: Login with valid userid and password
    Given I should be at the login page
    And I provide valid userid and password
    When I click on sign in button
    Then I should be able to login inside conduit
    And the title of the webpage should be conduit

  @tag2
  Scenario Outline: Login with invalid userid and password
    Given I should be at the login page
    And I provide invalid userid and password
    When I click on sign in button
    Then I should get the error message

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
