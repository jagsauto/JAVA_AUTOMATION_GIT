$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com\\learning\\cucumber\\myaccount\\myaccount.feature");
formatter.feature({
  "id": "my-account-access",
  "description": "",
  "name": "my account access",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "my-account-access;loggged-in-user-should-be-able-to-access-my-account",
  "tags": [
    {
      "name": "@Bokka22",
      "line": 3
    }
  ],
  "description": "",
  "name": "loggged in User should be able to access my account",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I am a logged in user on the site",
  "keyword": "Given ",
  "line": 5
});
formatter.match({
  "location": "myaccount.userstate()"
});
formatter.result({
  "duration": 86279311,
  "status": "passed"
});
});