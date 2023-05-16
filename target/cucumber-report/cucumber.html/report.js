$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AccountLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Account Login Page",
  "description": "As a user I want to Login to the tutorials ninja website",
  "id": "account-login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4069847400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "Verify user should navigate to Login Page successfully",
  "description": "",
  "id": "account-login-page;verify-user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke"
    },
    {
      "line": 6,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I click on my Account link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select \"Login\" from my Account options",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I am navigated to the Login page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountLoginSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 123417600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 10
    }
  ],
  "location": "AccountLoginSteps.iSelectFromMyAccountOptions(String)"
});
formatter.result({
  "duration": 342277201,
  "status": "passed"
});
formatter.match({
  "location": "AccountLoginSteps.iAmNavigatedToTheLoginPageSuccessfully()"
});
formatter.result({
  "duration": 27976499,
  "status": "passed"
});
formatter.after({
  "duration": 610720200,
  "status": "passed"
});
formatter.uri("DesktopPage.feature");
formatter.feature({
  "line": 1,
  "name": "Desktop Page Test",
  "description": "As As a user I want to be able to explore the different features and pages on the Desktop page",
  "id": "desktop-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2859451300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "Verify that products arrange in an Alphabetical order when user selects sort by Name Z to A",
  "description": "",
  "id": "desktop-page-test;verify-that-products-arrange-in-an-alphabetical-order-when-user-selects-sort-by-name-z-to-a",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke"
    },
    {
      "line": 6,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I mouse hover on Desktops tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select Show All Desktops from Drop down",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I am able to see that the products are arranged in Alphabetical oder when user selects sort by Name Z to A",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopsPageSteps.iMouseHoverOnDesktopsTabAndClick()"
});
formatter.result({
  "duration": 148881801,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageSteps.iSelectShowAllDesktopsFromDropDown()"
});
formatter.result({
  "duration": 20057214599,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageSteps.iAmAbleToSeeThatTheProductsAreArrangedInAlphabeticalOderWhenUserSelectsSortByNameZToA()"
});
formatter.result({
  "duration": 23206786200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//select[@id\u003d\u0027input-sort\u0027]\"}\n  (Session info: chrome\u003d113.0.5672.93)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [13926e1d3021e2eaba2a3a01aad33819, findElement {using\u003dxpath, value\u003d//select[@id\u003d\u0027input-sort\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.93, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\patel\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:59811}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:59811/devtoo..., se:cdpVersion: 113.0.5672.93, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 13926e1d3021e2eaba2a3a01aad33819\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy22.getTagName(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:46)\r\n\tat com.tutorialsninja.utility.Utility.selectByVisibleTextFromDropDown(Utility.java:140)\r\n\tat com.tutorialsninja.pages.DesktopPage.getProductNamesListByNameZToA(DesktopPage.java:82)\r\n\tat com.tutorialsninja.steps.DesktopsPageSteps.iAmAbleToSeeThatTheProductsAreArrangedInAlphabeticalOderWhenUserSelectsSortByNameZToA(DesktopsPageSteps.java:29)\r\n\tat ✽.Then I am able to see that the products are arranged in Alphabetical oder when user selects sort by Name Z to A(DesktopPage.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 849176500,
  "status": "passed"
});
formatter.uri("LaptopsAndNotebooksPage.feature");
formatter.feature({
  "line": 1,
  "name": "Laptops And Notebooks Page",
  "description": "As a user I want to be able to explore the different features and pages on the Laptops And Notebooks Page",
  "id": "laptops-and-notebooks-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2962130200,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 8,
  "name": "Verify that products arrange from High to Low price order when user selects sort by Price (High \u003e Low)",
  "description": "",
  "id": "laptops-and-notebooks-page;verify-that-products-arrange-from-high-to-low-price-order-when-user-selects-sort-by-price-(high-\u003e-low)",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Smoke"
    },
    {
      "line": 7,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I mouse hover on Laptops and Notebooks tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I select Show All Laptops and Notebooks from Drop down",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I am able to see that the products are arranged  from High to Low price order when user selects sort by Price (High \u003e Low)",
  "keyword": "Then "
});
formatter.match({
  "location": "LaptopsAndNotebooksPageSteps.iMouseHoverOnLaptopsAndNotebooksTabAndClick()"
});
formatter.result({
  "duration": 140890000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksPageSteps.iSelectShowAllLaptopsAndNotebooksFromDropDown()"
});
formatter.result({
  "duration": 20023480301,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksPageSteps.iAmAbleToSeeThatTheProductsAreArrangedFromHighToLowPriceOrderWhenUserSelectsSortByPriceHighLow()"
});
formatter.result({
  "duration": 59428299,
  "error_message": "java.lang.NumberFormatException: For input string: \"110.00 $122.00\"\r\n\tat sun.misc.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2043)\r\n\tat sun.misc.FloatingDecimal.parseDouble(FloatingDecimal.java:110)\r\n\tat java.lang.Double.parseDouble(Double.java:538)\r\n\tat java.lang.Double.valueOf(Double.java:502)\r\n\tat com.tutorialsninja.pages.LaptopsAndNotebooksPage.getProductNamesListedUnderLaptopsAndNotebooks(LaptopsAndNotebooksPage.java:60)\r\n\tat com.tutorialsninja.steps.LaptopsAndNotebooksPageSteps.iAmAbleToSeeThatTheProductsAreArrangedFromHighToLowPriceOrderWhenUserSelectsSortByPriceHighLow(LaptopsAndNotebooksPageSteps.java:27)\r\n\tat ✽.Then I am able to see that the products are arranged  from High to Low price order when user selects sort by Price (High \u003e Low)(LaptopsAndNotebooksPage.feature:11)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 798953099,
  "status": "passed"
});
formatter.uri("RegisterPage.feature");
formatter.feature({
  "line": 1,
  "name": "Register Page Test",
  "description": "\r\nAs a user I am able to register on the tutorials ninja website",
  "id": "register-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2959797000,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 8,
  "name": "Verify user should navigate to Register page successfully",
  "description": "",
  "id": "register-page-test;verify-user-should-navigate-to-register-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Smoke"
    },
    {
      "line": 7,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on my Account link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I select \"Register\" from my Account options",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I am navigated to the Register page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountLoginSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 45721300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 10
    }
  ],
  "location": "AccountLoginSteps.iSelectFromMyAccountOptions(String)"
});
formatter.result({
  "duration": 596523100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iAmNavigatedToTheRegisterPageSuccessfully()"
});
formatter.result({
  "duration": 24633600,
  "status": "passed"
});
formatter.after({
  "duration": 583844599,
  "status": "passed"
});
formatter.uri("TopMenu.feature");
formatter.feature({
  "line": 1,
  "name": "Top Menu",
  "description": "As a user I want to explore the top menu tabs",
  "id": "top-menu",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2776782701,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "Verify user should navigate to Desktops Page successfully",
  "description": "",
  "id": "top-menu;verify-user-should-navigate-to-desktops-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke"
    },
    {
      "line": 6,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I mouse hover on Desktops tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select Show All Desktops from Drop down",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I am navigated to the Desktops page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopsPageSteps.iMouseHoverOnDesktopsTabAndClick()"
});
formatter.result({
  "duration": 148901100,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageSteps.iSelectShowAllDesktopsFromDropDown()"
});
formatter.result({
  "duration": 20054263800,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iAmNavigatedToTheDesktopsPageSuccessfully()"
});
formatter.result({
  "duration": 40091238299,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h2[contains(text(),\u0027Desktops\u0027)]\"}\n  (Session info: chrome\u003d113.0.5672.93)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [1ca5401401a6e509992c687bf7bec3f4, findElement {using\u003dxpath, value\u003d//h2[contains(text(),\u0027Desktops\u0027)]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.93, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\patel\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:59890}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:59890/devtoo..., se:cdpVersion: 113.0.5672.93, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 1ca5401401a6e509992c687bf7bec3f4\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy22.getText(Unknown Source)\r\n\tat com.tutorialsninja.utility.Utility.getTextFromElement(Utility.java:56)\r\n\tat com.tutorialsninja.pages.DesktopPage.getPageName(DesktopPage.java:65)\r\n\tat com.tutorialsninja.steps.TopMenuSteps.iAmNavigatedToTheDesktopsPageSuccessfully(TopMenuSteps.java:15)\r\n\tat ✽.Then I am navigated to the Desktops page successfully(TopMenu.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 800962500,
  "status": "passed"
});
});