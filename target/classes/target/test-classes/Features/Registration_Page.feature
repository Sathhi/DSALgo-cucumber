Feature: Registration page validation

  @Scenario1
  Scenario Outline: user validating different scenarios
    Given user navigated to the registration page
    And Enters <Username> and <Password>
    When user clicks Register
    Then user displays error message

    Examples: 
      | Username | Password |
      | Numpy    |          |

    Examples: 
      | Username | Password |
      | Numpy    | Ninja    |
      | Numpy    | Nin      |

  @Scenario2
  Scenario Outline: 
    And user Enters <Username> and <password>
    When user clicks login button
    Then user navigated to login page

    Examples: 
      | Username | Password  | Password  |
      | Ninjagos | Rose@1234 | Rose@1234 |
