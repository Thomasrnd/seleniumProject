$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "open browser",
  "description": "",
  "id": "open-browser",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#open browser"
    }
  ],
  "line": 5,
  "name": "add to basket",
  "description": "",
  "id": "open-browser;add-to-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "that i am on the shopping website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "i add an item to the basket",
  "rows": [
    {
      "cells": [
        "key_word"
      ],
      "line": 8
    },
    {
      "cells": [
        "gundam"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Login.that_i_am_on_the_shopping_website()"
});
formatter.result({
  "duration": 7943632200,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_add_an_item_to_the_basket(DataTable)"
});
formatter.result({
  "duration": 1434496400,
  "error_message": "java.lang.AssertionError: expected:\u003c0\u003e but was:\u003c1\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:645)\r\n\tat org.junit.Assert.assertEquals(Assert.java:631)\r\n\tat steps.Login.i_add_an_item_to_the_basket(Login.java:45)\r\n\tat ✽.When i add an item to the basket(login.feature:7)\r\n",
  "status": "failed"
});
});