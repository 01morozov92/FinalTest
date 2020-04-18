Feature: login user

  Scenario: login user
    Then click "nav" button
    Then click "sign_in" button log
    Then input login
    Then input password
    Then click "new_user" button login
    Then click "welcome-modal" close button
    Then content have text All projects