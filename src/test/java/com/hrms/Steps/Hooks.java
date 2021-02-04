package com.hrms.Steps;

import com.hrms.base.baseClass;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void beforeScenario() {
		baseClass.setup();
	}
   @After
	public void afterScenario() {
		baseClass.tearDown();
	}
}
