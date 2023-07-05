Feature: Signin page validation

  Scenario Outline: 
    Given user is in Signin page
    When user enters <Username> and <Password>
    And clicks login button
    Then user navigated to Homepage

    Examples: 
      | Username | Password  |
      | Ninjagos | Rose@1234 |
