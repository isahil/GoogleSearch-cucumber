
@tag
Feature: the weeknd search

  @tag1
  Scenario: search an artist on google
    Given User opens chrome and goes to google page
    When User enters an artist name in the search box and click search 
    Then google search result page is displayed
    And close the browser


    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
