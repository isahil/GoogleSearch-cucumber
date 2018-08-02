$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Google.feature");
formatter.feature({
  "line": 3,
  "name": "the weeknd search",
  "description": "",
  "id": "the-weeknd-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "search an artist on google",
  "description": "",
  "id": "the-weeknd-search;search-an-artist-on-google",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User opens chrome and goes to google page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters an artist name in the search box and click search",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "google search result page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleStepDefinition.User_opens_chrome_and_goes_to_google_page()"
});
formatter.result({
  "duration": 9779630559,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDefinition.User_enters_an_artist_name_in_the_search_box_and_click_search()"
});
formatter.result({
  "duration": 1598117795,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDefinition.google_search_result_page_is_displayed()"
});
formatter.result({
  "duration": 3212292505,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 545711605,
  "status": "passed"
});
});