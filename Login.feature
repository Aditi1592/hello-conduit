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
#@tag1
  #Scenario: Login with valid userid and password
    #Given I should be at the login page
    #And I provide valid userid and password
    #When I click on login button
    #Then I should be able to login inside conduit
    #And the title of the webpage should be conduit
#
 #@tag2
  #Scenario: Login with invalid userid and password
    #Given I should be at the login page
    #And I provide invalid userid and password
    #When I click on login button
    #Then I should get the error message
#
 #@tag3
  #Scenario: click on My articles tab and favorited articles tab
    #Given I should be at the login page
    #And I provide valid userid and password
    #When I click on login button
    #Then I should be able to login inside conduit
    #And I should be able to click on my name tab
    #And I should be able to click on my articles
    #And I should be able to click on favorited articles
    #
#
    #@tag1
  #Scenario: Post new feed on the page
    #Given I should be at the login page
    #And I provide valid userid and password
    #When I click on login button
    #Then I should be able to login inside conduit
    #When I click on new post
    #Then I enter the details
    #When I click on publish article button
    #Then I see my post with comment section
    
   @tag1
  Scenario: Post new article on the page and post message comment
    Given I should be at the login page
    And I provide valid userid and password
    When I click on login button
    Then I should be able to login inside conduit
    When I click on new post
    Then I enter the details
    When I click on publish article button 
    Then i post a new comment
    #
    #@tag6
  #Scenario Outline: check you article should be present in global feed
    #Given I should be at the login page
    #And I provide valid userid and password
    #When I click on sign in button
    #Then I should be able to login inside conduit
    #And I click on Global feed to check my article
    