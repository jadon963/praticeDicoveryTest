$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Add videos from HomePage",
  "description": "",
  "id": "add-videos-from-homepage",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Add videos from Recommended",
  "description": "",
  "id": "add-videos-from-homepage;add-videos-from-recommended",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
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
  "name": "user add \u003cfirstVideo\u003e and \u003csecondVideo\u003e from recommended",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Verify favorites to My videos",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "add-videos-from-homepage;add-videos-from-recommended;",
  "rows": [
    {
      "cells": [
        "firstVideo",
        "secondVideo"
      ],
      "line": 9,
      "id": "add-videos-from-homepage;add-videos-from-recommended;;1"
    },
    {
      "cells": [
        "0",
        "1"
      ],
      "line": 10,
      "id": "add-videos-from-homepage;add-videos-from-recommended;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Add videos from Recommended",
  "description": "",
  "id": "add-videos-from-homepage;add-videos-from-recommended;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
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
  "name": "user add 0 and 1 from recommended",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Verify favorites to My videos",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.user_is_already_on_homePage()"
});
formatter.result({
  "duration": 12329794153,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.user_scroll_down_upto_recommended_section()"
});
formatter.result({
  "duration": 70721433,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 9
    },
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "HomePageStepDef.user_add_and_from_recommended(int,int)"
});
formatter.result({
  "duration": 938237934,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.verify_favorites_to_myvideos()"
});
formatter.result({
  "duration": 4469097583,
  "status": "passed"
});
});