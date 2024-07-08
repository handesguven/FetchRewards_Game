Feature: Find the fake gold bar

  Scenario: Determine which gold bar is fake
    Given I open the website
    When I insert number 2 in the first cell of the left bowl's grid
    And I insert number 3 in the first cell of the right bowl's grid
    And I press the "weighing" button
    Then I get the result of weighing
    When I press the "reset" button
    And I insert number 6 in the first cell of the left bowl's grid
    And I insert number 7 in the second cell of the left bowl's grid
    And I insert number 1 in the first cell of the right bowl's grid
    And I insert number 4 in the second cell of the right bowl's grid
    And I press the "weighing" button
    Then I get the result of weighing
    And I press the button 5
    Then I get an alert message and output it
    And I get a list of weighingsResult and output them