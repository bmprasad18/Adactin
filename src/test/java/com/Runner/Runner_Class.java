package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
		
		features ="src\\test\\Features",
		glue = "src\\test\\java\\com\\step_definition",
		dryRun = false,
		monochrome = true
		)

public class Runner_Class {

}
