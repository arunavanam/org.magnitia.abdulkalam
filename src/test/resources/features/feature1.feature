Feature: user login

  Scenario: validate title
    Given open browser
    When launch site
    Then title should be google

 Scenario Outline: validate login opertion
    Given open browser
    When launch site
    And enter"<userid>"
    And enter"<password>"
    And click on signin button
    Then next page should be displayed

    Examples: 
      | userid | password |          |
      | asdf   |          | qwert34@ |
      | asdf   |          |          |
      |        | qwert34@ |          |
