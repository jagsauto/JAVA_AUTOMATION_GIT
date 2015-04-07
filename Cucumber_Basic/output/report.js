$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027com\\learning\\cucumber\\resource\\emp.feature\u0027");
formatter.feature({
  "id": "employee",
  "description": "",
  "name": "Employee",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "employee;search-test-employee",
  "description": "",
  "name": "Search test Employee",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I have search page",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "i have a \"test\" employee record",
  "keyword": "And ",
  "line": 5
});
formatter.step({
  "name": "I search for a \"test\" emp",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "search result should show \"test\" records",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "firstClass.searcpage()"
});
formatter.result({
  "duration": 95375228,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 10
    }
  ],
  "location": "firstClass.empRecord(String)"
});
formatter.result({
  "duration": 1509475,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 16
    }
  ],
  "location": "firstClass.searchRecord(String)"
});
formatter.result({
  "duration": 77588,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 27
    }
  ],
  "location": "firstClass.searchResult(String)"
});
formatter.result({
  "duration": 127261,
  "status": "passed"
});
formatter.scenario({
  "id": "employee;search-dev-employee",
  "description": "",
  "name": "Search dev Employee",
  "keyword": "Scenario",
  "line": 9,
  "type": "scenario"
});
formatter.step({
  "name": "I have search page",
  "keyword": "Given ",
  "line": 10
});
formatter.step({
  "name": "i have a \"dev\" employee record",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "I search for a \"dev\" emp",
  "keyword": "When ",
  "line": 12
});
formatter.step({
  "name": "search result should show \"dev\" records",
  "keyword": "Then ",
  "line": 13
});
formatter.match({
  "location": "firstClass.searcpage()"
});
formatter.result({
  "duration": 48031,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dev",
      "offset": 10
    }
  ],
  "location": "firstClass.empRecord(String)"
});
formatter.result({
  "duration": 65683,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dev",
      "offset": 16
    }
  ],
  "location": "firstClass.searchRecord(String)"
});
formatter.result({
  "duration": 66504,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dev",
      "offset": 27
    }
  ],
  "location": "firstClass.searchResult(String)"
});
formatter.result({
  "duration": 84566,
  "status": "passed"
});
formatter.uri("\u0027com\\learning\\cucumber\\resource\\itcomp.feature\u0027");
formatter.feature({
  "id": "it-company",
  "description": "",
  "name": "It company",
  "keyword": "Feature",
  "line": 1
});
formatter.uri("\u0027com\\learning\\cucumber\\resource\\parameter.feature\u0027");
formatter.feature({
  "id": "meal",
  "description": "",
  "name": "Meal",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "meal;eating",
  "description": "",
  "name": "eating",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "there are \"Ten\" cucumbers",
  "keyword": "Given ",
  "line": 4,
  "rows": [
    {
      "cells": [
        "TotalCu",
        "AteCucu",
        "RemaiCu"
      ],
      "line": 5
    },
    {
      "cells": [
        "three",
        "four",
        "eight"
      ],
      "line": 6
    },
    {
      "cells": [
        "Ten",
        "two",
        "eight"
      ],
      "line": 7
    }
  ]
});
formatter.step({
  "name": "I eat \"Two\" cucumbers",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "I should have left \"Eight\" cucumbers",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "arguments": [
    {
      "val": "Ten",
      "offset": 11
    }
  ],
  "location": "paramclass.totalcucum(String,DataTable)"
});
formatter.result({
  "duration": 1290669,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Two",
      "offset": 7
    }
  ],
  "location": "paramclass.atecucum(String)"
});
formatter.result({
  "duration": 89082,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Eight",
      "offset": 20
    }
  ],
  "location": "paramclass.remaincucum(String)"
});
formatter.result({
  "duration": 118229,
  "status": "passed"
});
});