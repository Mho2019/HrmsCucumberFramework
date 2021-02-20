package com.hrms.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\Features\\"
,glue="com.hrms.Steps"
,tags= {"@RegressionTest"}
		)
public class RegressionTestRunner {

}
