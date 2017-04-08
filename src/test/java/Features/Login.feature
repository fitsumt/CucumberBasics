Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I entered the following for login
      |Username|Password|
      |Admin   |AdminPassword|
    And I click a login button
    Then I should see a userform page