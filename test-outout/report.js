$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Add videos from HomePage",
  "description": "",
  "id": "add-videos-from-homepage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14824103200,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Add videos from Recommended",
  "description": "",
  "id": "add-videos-from-homepage;add-videos-from-recommended",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is already on homePage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user scroll down upto recommended section",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user addVideos from recommended",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Navigate to MyVideos page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Verify favorites added to My videos",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.user_is_already_on_homePage()"
});
formatter.result({
  "duration": 153930960,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.user_scroll_down_upto_recommended_section()"
});
formatter.result({
  "duration": 100426663,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.user_add_and_from_recommended()"
});
formatter.result({
  "duration": 1105456012,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.Navigate_to_MyVideos_page()"
});
formatter.result({
  "duration": 4432125328,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.Verify_favorites_added_to_My_video()"
});
formatter.result({
  "duration": 144848600,
  "status": "passed"
});
formatter.after({
  "duration": 211384054,
  "status": "passed"
});
});