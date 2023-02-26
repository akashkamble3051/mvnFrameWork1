package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//cucumberProject
@CucumberOptions(features = { "src/test/resources/features/VTigerCompaign.feature" }, glue = {
		"stepDefinition" }, plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failedScenario.txt"},tags="smoke")
public class TestRunner extends AbstractTestNGCucumberTests {

}
