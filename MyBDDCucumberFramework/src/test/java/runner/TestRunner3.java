package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
///to generate report add plugin
@CucumberOptions (features= {"src/test/resources/features/VTigerCompaign.feature"}, glue= {"stepDefinition"}, plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"pretty" })
public class TestRunner3 extends AbstractTestNGCucumberTests {

}
