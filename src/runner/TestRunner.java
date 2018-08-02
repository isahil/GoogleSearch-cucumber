package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features", //path to the features files
		glue={"step_def"} //path to your step definition
		,format= {"pretty", "html:test-output"} //generates a report
		,monochrome = true //readable console messages
		,dryRun = false //verifying each step has a definition method
		)
public class TestRunner {

}
