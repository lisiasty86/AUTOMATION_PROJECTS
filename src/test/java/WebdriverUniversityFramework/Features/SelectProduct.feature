Feature: Go to Page Object Model sub-page and select some product.


  @product
  Scenario Outline: Navigating to Page Object Model
    Given User navigate to "<url>"
    When User click on the Page Objcet Model
    And User click "<button1>"
    And User select "<product>"
    Then User click on "<button2>"

    Examples:
    |                        url                      |    button1                             |                product                          |           button2                                 |
    |  http://www.webdriveruniversity.com/index.html  | //*[@id="div-main-nav"]/div/ul/li[2]/a | //*[@id="container-special-offers"]/div[1]/p    |  "//*[@id="myModal"]/div/div/div[3]/button[1]"    |