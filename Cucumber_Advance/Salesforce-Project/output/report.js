$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test\\qtpselenium\\salesforce\\login\\login.feature");
formatter.feature({
  "id": "salesforce-login",
  "description": "",
  "name": "Salesforce login",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "salesforce-login;login-to-salesforce",
  "description": "",
  "name": "Login to salesforce",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I go to \"http://salesforce.com\" page on \"Mozilla\"",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I enter \"username\" as \"test\"",
  "keyword": "And ",
  "line": 5
});
formatter.step({
  "name": "I enter \"password\" as \"password\"",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "I click on login \"button\"",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "Login should be \"successful\"",
  "keyword": "Then ",
  "line": 8
});
formatter.match({
  "arguments": [
    {
      "val": "http://salesforce.com",
      "offset": 9
    },
    {
      "val": "Mozilla",
      "offset": 41
    }
  ],
  "location": "LoginTest.I_Go_To(String,String)"
});
formatter.result({
  "duration": 83780015,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 9
    },
    {
      "val": "test",
      "offset": 23
    }
  ],
  "location": "LoginTest.I_Enter(String,String)"
});
formatter.result({
  "duration": 100988,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 9
    },
    {
      "val": "password",
      "offset": 23
    }
  ],
  "location": "LoginTest.I_Enter(String,String)"
});
formatter.result({
  "duration": 110431,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "button",
      "offset": 18
    }
  ],
  "location": "LoginTest.I_Click(String)"
});
formatter.result({
  "duration": 101809,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "successful",
      "offset": 17
    }
  ],
  "location": "LoginTest.Login_Status(String)"
});
formatter.result({
  "duration": 144914,
  "status": "passed"
});
});