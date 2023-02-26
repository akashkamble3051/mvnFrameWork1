package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features" }, glue = { "stepDefinition" }, plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"pretty" }, tags = "@Smoke and @Regression", monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
