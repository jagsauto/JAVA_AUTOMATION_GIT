$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com\\learning\\cucumber\\login\\login.feature");
formatter.feature({
  "id": "salesforce-login",
  "description": "",
  "name": "salesforce login",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "salesforce-login;user-should-be-able-to-login;;2",
  "tags": [
    {
      "name": "@Bokka5",
      "line": 4
    }
  ],
  "description": "",
  "name": "User should be able to login",
  "keyword": "Scenario Outline",
  "line": 14,
  "type": "scenario"
});
formatter.step({
  "name": "I open \"loginUrl\" on \"Mozilla\"",
  "keyword": "Given ",
  "line": 6,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I enter \"LoginUserName\" as \"Test\"",
  "keyword": "And ",
  "line": 7,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "I enter \"LoginPassword\" as \"Tester\"",
  "keyword": "And ",
  "line": 8,
  "matchedColumns": [
    2
  ]
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
  "duration": 7538975921,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginUserName",
      "offset": 9
    },
    {
      "val": "Test",
      "offset": 28
    }
  ],
  "location": "SalesForceLogin.I_Enter(String,String)"
});
formatter.result({
  "duration": 364081518,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginPassword",
      "offset": 9
    },
    {
      "val": "Tester",
      "offset": 28
    }
  ],
  "location": "SalesForceLogin.I_Enter(String,String)"
});
formatter.result({
  "duration": 233084161,
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
  "duration": 10166397843,
  "status": "failed",
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027Login\u0027]\"}\nCommand duration or timeout: 10.14 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027L109372\u0027, ip: \u002710.25.27.17\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.6.0_35\u0027\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027Login\u0027]}\nSession ID: 82cdcd55-1284-4094-b3c3-c64b81a1c5e9\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, browserName\u003dfirefox, rotatable\u003dfalse, locationContextEnabled\u003dtrue, version\u003d36.0.4, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue}]\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat com.learning.cucumber.util.WebConnector.click(WebConnector.java:102)\r\n\tat com.learning.cucumber.login.SalesForceLogin.I_click_on_LoginButton(SalesForceLogin.java:31)\r\n\tat ✽.And I click on \"LoginButton\"(com\\learning\\cucumber\\login\\login.feature:9)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027Login\u0027]\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027L109372\u0027, ip: \u002710.25.27.17\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.6.0_35\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/syadav2/AppData/Local/Temp/anonymous5157606785086517599webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10271)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/syadav2/AppData/Local/Temp/anonymous5157606785086517599webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:603)\r\n"
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
  "status": "skipped"
});
formatter.scenario({
  "id": "salesforce-login;user-should-be-able-to-login;;3",
  "tags": [
    {
      "name": "@Bokka5",
      "line": 4
    }
  ],
  "description": "",
  "name": "User should be able to login",
  "keyword": "Scenario Outline",
  "line": 15,
  "type": "scenario"
});
formatter.step({
  "name": "I open \"loginUrl\" on \"Mozilla\"",
  "keyword": "Given ",
  "line": 6,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I enter \"LoginUserName\" as \"Dev\"",
  "keyword": "And ",
  "line": 7,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "I enter \"LoginPassword\" as \"Developer\"",
  "keyword": "And ",
  "line": 8,
  "matchedColumns": [
    2
  ]
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
  "duration": 877230311,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginUserName",
      "offset": 9
    },
    {
      "val": "Dev",
      "offset": 28
    }
  ],
  "location": "SalesForceLogin.I_Enter(String,String)"
});
formatter.result({
  "duration": 184000588,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginPassword",
      "offset": 9
    },
    {
      "val": "Developer",
      "offset": 28
    }
  ],
  "location": "SalesForceLogin.I_Enter(String,String)"
});
formatter.result({
  "duration": 200574976,
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
  "duration": 10140279245,
  "status": "failed",
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027Login\u0027]\"}\nCommand duration or timeout: 10.14 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027L109372\u0027, ip: \u002710.25.27.17\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.6.0_35\u0027\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027Login\u0027]}\nSession ID: 82cdcd55-1284-4094-b3c3-c64b81a1c5e9\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, browserName\u003dfirefox, rotatable\u003dfalse, locationContextEnabled\u003dtrue, version\u003d36.0.4, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue}]\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat com.learning.cucumber.util.WebConnector.click(WebConnector.java:102)\r\n\tat com.learning.cucumber.login.SalesForceLogin.I_click_on_LoginButton(SalesForceLogin.java:31)\r\n\tat ✽.And I click on \"LoginButton\"(com\\learning\\cucumber\\login\\login.feature:9)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027Login\u0027]\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027L109372\u0027, ip: \u002710.25.27.17\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.6.0_35\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/syadav2/AppData/Local/Temp/anonymous5157606785086517599webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10271)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/syadav2/AppData/Local/Temp/anonymous5157606785086517599webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:603)\r\n"
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
  "status": "skipped"
});
formatter.scenario({
  "id": "salesforce-login;user-should-be-able-to-login-to-uat-thesun.co.uk",
  "tags": [
    {
      "name": "@Bokka6",
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
  "duration": 844998228,
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
  "duration": 213134056,
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
  "duration": 194952066,
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
  "duration": 2081622315,
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
  "duration": 723369789,
  "status": "passed"
});
});