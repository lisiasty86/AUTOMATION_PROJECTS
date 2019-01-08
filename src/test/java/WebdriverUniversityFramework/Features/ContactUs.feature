Feature: Submit data to webdriveruniversity.com using contact us form
  A user should be able to submit information via the contact us form

  Background:
    Given I access webdriveruniversity
    When I click on the contact us button

  Scenario: Submit information using the contact us form
    And I enter a first name
    And I enter a last name
    And I enter an email address
    And I enter comments
    When I click on the submit button
    Then the information should successfully be submitted via the contact us form



