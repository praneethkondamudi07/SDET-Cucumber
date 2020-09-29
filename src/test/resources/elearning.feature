#Author: Kondamudi Praneeth (knagapra@in.ibm.com)
@tag
Feature: To validate registration and signin functionalities of elearning page

  @e2e
  Scenario Outline: To validate registration and send message functionalities 
    Given I navigate to "<URL>"
    And I click on SignUp button
    And I enter value into input field First Name
    And I enter value into input field Last Name
    And I enter value into input field email
    And I enter value into input field Username
    And I enter value into input field Password
    And I enter value into input field Confirm Password
    When I click on Register button
    Then I verify the message "<Message1>"
    And I click on user icon
    And I click on inbox link
    And I click on compose button
    And I enter value into input field Send To as "<Send To>"
    And I click on "<Send To>" in options list
    And I enter value into input field Subject
    And I enter value into input field Message
    When I click on submit button
    Then I should see success message as "<Message2>" and "<Send To>"

    Examples: 
     | URL 																				| Message1  																		 | Send To       | Message2											|
     | http://elearningm1.upskills.in/index.php   | Your personal settings have been registered. 	 | naveen				 | The message has been sent to |