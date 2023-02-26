package runner;
///here only package name full path used to run all features sequentially
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= {"src/test/resources/features"}, glue= {"stepDefinition"})
public class TestRunner2 extends AbstractTestNGCucumberTests {

}
