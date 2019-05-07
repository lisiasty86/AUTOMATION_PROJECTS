Feature: Login to account at webdriveruniversity.com using login portal

 # Background:
 #   Given I access webdriveruniversity2
 #   When I click on the login portal button
 #   And I enter a username

 # Scenario: Login to account with a valid password
 #   And I enter a "valid" pass
 #   When I click on the login button
 #   Then I should be presented with a successful validation alert

 # Scenario: Login to account with a invalid password
 #   And I enter a "invalid" password
 #   When I click on the login button
 #   Then I should be presented with a unsuccessful validation alert

  Scenario Outline: Login to account with credentials
      Given user navigates to "<url>"
      When user clicks on the login portal button
      And user enter the "<username>" username
      And user enter the "<password>" password
      When user clicks on the login button
      Then the user should be presented with the following prompt alert "<message>"

      Examples:
          |                      url                         |    username    |    password       |      message                |
          |  http://www.webdriveruniversity.com/index.html   |    user1       |    pass1          |      validation failed      |
          |  http://www.webdriveruniversity.com/index.html   |    webdriver   |    webdriver123   |      validation succeeded   |