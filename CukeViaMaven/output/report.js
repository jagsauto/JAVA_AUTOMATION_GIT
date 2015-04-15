$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com\\learning\\cucumber\\login\\login.feature");
formatter.feature({
  "line": 2,
  "name": "salesforce login",
  "description": "",
  "id": "salesforce-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 19,
  "name": "User should be able to login to UAT thesun.co.uk",
  "description": "",
  "id": "salesforce-login;user-should-be-able-to-login-to-uat-thesun.co.uk",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@Bokka6"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I open \"loginUrl\" on \"Mozilla\"",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I enter \"loginEmailAddress\" as \"sunil.yadav+uat@news.co.uk\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter \"loginPassword\" as \"Password123\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on \"loginSignInButton\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Login should be \"Successful\"",
  "keyword": "Then "
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
  "duration": 11086536776,
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
  "duration": 719773459,
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
  "duration": 409010952,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginSignInButton",
      "offset": 12
    }
  ],
  "location": "common_annotation_util.I_click_On(String)"
});
formatter.result({
  "duration": 5289762872,
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
  "duration": 1709897219,
  "status": "passed"
});
formatter.uri("com\\learning\\cucumber\\myaccount\\myaccount.feature");
formatter.feature({
  "line": 1,
  "name": "my account access",
  "description": "",
  "id": "my-account-access",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "loggged in User should be able to access my account",
  "description": "",
  "id": "my-account-access;loggged-in-user-should-be-able-to-access-my-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Bokka22"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am a logged in user on the site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on \"sunMenuLink\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Menu bar should get opened",
  "keyword": "Then "
});
formatter.match({
  "location": "myaccount.userstate()"
});
formatter.result({
  "duration": 212344111,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sunMenuLink",
      "offset": 12
    }
  ],
  "location": "common_annotation_util.I_click_On(String)"
});
formatter.result({
  "duration": 5591337989,
  "error_message": "org.openqa.selenium.remote.UnreachableBrowserException: Error communicating with the remote browser. It may have died.\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027L109372\u0027, ip: \u002710.25.27.15\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:593)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat com.learning.cucumber.util.WebConnector.click(WebConnector.java:104)\r\n\tat com.learning.cucumber.login.common_annotation_util.I_click_On(common_annotation_util.java:15)\r\n\tat ✽.And I click on \"sunMenuLink\"(com\\learning\\cucumber\\myaccount\\myaccount.feature:6)\r\nCaused by: org.apache.http.conn.HttpHostConnectException: Connect to 127.0.0.1:7055 [/127.0.0.1] failed: Connection refused: connect\r\n\tat org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:142)\r\n\tat org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:319)\r\n\tat org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:363)\r\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:219)\r\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:195)\r\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:86)\r\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:108)\r\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:72)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:57)\r\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.fallBackExecute(ApacheHttpClient.java:144)\r\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.execute(ApacheHttpClient.java:72)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:133)\r\n\tat org.openqa.selenium.firefox.internal.NewProfileExtensionConnection.execute(NewProfileExtensionConnection.java:165)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver$LazyCommandExecutor.execute(FirefoxDriver.java:362)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:572)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat com.learning.cucumber.util.WebConnector.click(WebConnector.java:104)\r\n\tat com.learning.cucumber.login.common_annotation_util.I_click_On(common_annotation_util.java:15)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:44)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:12)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:40)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:35)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:38)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:268)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:45)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:40)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:36)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:83)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:77)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:82)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:252)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:141)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:112)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)\r\nCaused by: java.net.ConnectException: Connection refused: connect\r\n\tat java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)\r\n\tat java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:85)\r\n\tat java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:345)\r\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)\r\n\tat java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)\r\n\tat java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)\r\n\tat java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)\r\n\tat java.net.Socket.connect(Socket.java:589)\r\n\tat org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:72)\r\n\tat org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:125)\r\n\t... 65 more\r\n",
  "status": "failed"
});
formatter.match({
  "location": "myaccount.Manu_Status()"
});
formatter.result({
  "status": "skipped"
});
});