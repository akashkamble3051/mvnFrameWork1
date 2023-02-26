package rerunFailedScenarioRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = { "@target/failedScenario.txt" }, glue = {
		"stepDefinition" }, plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty",
				"rerun:target/failedScenario.txt" })
public class TestRunner2  extends AbstractTestNGCucumberTests {

}