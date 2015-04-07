$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com\\learning\\cucumber\\login\\login.feature");
formatter.feature({
  "id": "salesforce-login",
  "description": "",
  "name": "salesforce login",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "salesforce-login;user-should-be-able-to-login",
  "tags": [
    {
      "name": "@Bokka",
      "line": 4
    }
  ],
  "description": "",
  "name": "User should be able to login",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "I open \"loginUrl\" on \"Mozilla\"",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "I enter \"LoginUserName\" as \"testuser\"",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "I enter \"LoginPassword\" as \"testpwd\"",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "I click on \"LoginButton\"",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "Login should be \"Successful\"",
  "keyword": "Then ",
  "line": 10
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
  "duration": 10586907161,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginUserName",
      "offset": 9
    },
    {
      "val": "testuser",
      "offset": 28
    }
  ],
  "location": "SalesForceLogin.I_Enter(String,String)"
});
formatter.result({
  "duration": 197461,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginPassword",
      "offset": 9
    },
    {
      "val": "testpwd",
      "offset": 28
    }
  ],
  "location": "SalesForceLogin.I_Enter(String,String)"
});
formatter.result({
  "duration": 161335,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginButton",
      "offset": 12
    }
  ],
  "location": "SalesForceLogin.I_click_on_LoginButton(String)"
});
formatter.result({
  "duration": 133009,
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
  "duration": 123567,
  "status": "passed"
});
formatter.scenario({
  "id": "salesforce-login;user-should-be-able-to-login",
  "tags": [
    {
      "name": "@Bokka1",
      "line": 12
    },
    {
      "name": "@Bokka",
      "line": 12
    }
  ],
  "description": "",
  "name": "User should be able to login",
  "keyword": "Scenario",
  "line": 13,
  "type": "scenario"
});
formatter.step({
  "name": "I open \"loginUrl\" on \"Mozilla\"",
  "keyword": "Given ",
  "line": 14
});
formatter.step({
  "name": "I enter \"LoginUserName\" as \"testuser\"",
  "keyword": "And ",
  "line": 15
});
formatter.step({
  "name": "I enter \"LoginPassword\" as \"testpwd\"",
  "keyword": "And ",
  "line": 16
});
formatter.step({
  "name": "I click on \"LoginButton\"",
  "keyword": "And ",
  "line": 17
});
formatter.step({
  "name": "Login should be \"Successful\"",
  "keyword": "Then ",
  "line": 18
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
  "duration": 9158514602,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginUserName",
      "offset": 9
    },
    {
      "val": "testuser",
      "offset": 28
    }
  ],
  "location": "SalesForceLogin.I_Enter(String,String)"
});
formatter.result({
  "duration": 176934,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginPassword",
      "offset": 9
    },
    {
      "val": "testpwd",
      "offset": 28
    }
  ],
  "location": "SalesForceLogin.I_Enter(String,String)"
});
formatter.result({
  "duration": 106325,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginButton",
      "offset": 12
    }
  ],
  "location": "SalesForceLogin.I_click_on_LoginButton(String)"
});
formatter.result({
  "duration": 77178,
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
  "duration": 123157,
  "status": "passed"
});
});