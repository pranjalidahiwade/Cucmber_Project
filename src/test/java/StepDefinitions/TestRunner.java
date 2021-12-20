package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features",
glue = {"StepDefinitions"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}, 
//dryRun =true,
tags= { "@sanity"}

)
public class TestRunner {

}
