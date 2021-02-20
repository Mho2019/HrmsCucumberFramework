package com.hrms.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\Features\\"
,glue="com.hrms.Steps"
,tags= {"@Login"},
plugin= {
		"pretty",//prints gherkin steps in console
		"html:target/cucumber-default-report",//create basic html report in specified location
		"json:target/cucumber.json"}
		)
public class testRunner {

	
}
