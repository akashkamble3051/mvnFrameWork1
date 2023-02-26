package suitRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/features/VTigerCompaign.feature"},glue= {"stepDefinition"},
plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"},tags="@smoke")
public class SmokeSuitVtiger extends AbstractTestNGCucumberTests {
	

}
