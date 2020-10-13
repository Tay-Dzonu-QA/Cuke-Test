package com.qa.Cuke.Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/Cuke",
		plugin = {"pretty","html:target/reports/htmlReports","json:target/reports/json/animalsReport.json","junit:target/reports/xml/animalsxml"},
		monochrome = true	
		)
public class RunTest {
}
