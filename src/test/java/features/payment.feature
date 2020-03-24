@login
  Scenario: Login
  Given I navigate to bank site
  When I input username and password
  And I click to Login button
  Then I verify Homepage displayed