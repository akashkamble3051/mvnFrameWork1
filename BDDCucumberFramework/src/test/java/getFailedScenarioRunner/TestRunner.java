package getFailedScenarioRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/VTigerCompaign.feature" }, glue = {
		"stepDefinition" }, plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty",
				"rerun:target/failedScenario.txt" })
public class TestRunner extends AbstractTestNGCucumberTests {

}
