$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com\\learning\\cucumber\\myaccount\\myaccount.feature");
formatter.feature({
  "id": "my-account-access",
  "description": "",
  "name": "my account access",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
<<<<<<< HEAD
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
<<<<<<< HEAD
  "line": 5
});
formatter.match({
  "location": "myaccount.userstate()"
});
formatter.result({
  "duration": 86279311,
=======
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
>>>>>>> 5809a77d5e9b1b84086658c5e557443a5ee74e5b
  "status": "passed"
});
});