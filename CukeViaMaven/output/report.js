$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com\\learning\\cucumber\\login\\login.feature");
formatter.feature({
  "id": "salesforce-login",
  "description": "",
  "name": "salesforce login",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "salesforce-login;user-should-be-able-to-login-to-uat-thesun.co.uk",
  "tags": [
    {
      "name": "@Bokka",
      "line": 17
    }
  ],
  "description": "",
  "name": "User should be able to login to UAT thesun.co.uk",
  "keyword": "Scenario",
  "line": 18,
  "type": "scenario"
});
formatter.step({
  "name": "I open \"loginUrl\" on \"Mozilla\"",
  "keyword": "Given ",
  "line": 19
});
formatter.step({
  "name": "I enter \"loginEmailAddress\" as \"sunil.yadav+uat@news.co.uk\"",
  "keyword": "And ",
  "line": 20
});
formatter.step({
  "name": "I enter \"loginPassword\" as \"Password123\"",
  "keyword": "And ",
  "line": 21
});
formatter.step({
  "name": "I click on \"loginSignInButton\"",
  "keyword": "And ",
  "line": 22
});
formatter.step({
  "name": "Login should be \"Successful\"",
  "keyword": "Then ",
  "line": 23
});
formatter.match({
  "arguments": [
    {
      "val": "loginUrl",
      "offset": 8
    },
    {
      "val": "Mozilla",
      "offset": 22
    }
  ],
  "location": "SalesForceLogin.I_Go_To(String,String)"
});
formatter.result({
  "duration": 6667524108,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginEmailAddress",
      "offset": 9
    },
    {
      "val": "sunil.yadav+uat@news.co.uk",
      "offset": 32
    }
  ],
  "location": "SalesForceLogin.I_Enter(String,String)"
});
formatter.result({
  "duration": 452985250,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginPassword",
      "offset": 9
    },
    {
      "val": "Password123",
      "offset": 28
    }
  ],
  "location": "SalesForceLogin.I_Enter(String,String)"
});
formatter.result({
  "duration": 238689008,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginSignInButton",
      "offset": 12
    }
  ],
  "location": "SalesForceLogin.I_click_on_LoginButton(String)"
});
formatter.result({
  "duration": 3902612434,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Successful",
      "offset": 17
    }
  ],
  "location": "SalesForceLogin.Login_Statu(String)"
});
formatter.result({
  "duration": 762194844,
  "status": "passed"
});
});