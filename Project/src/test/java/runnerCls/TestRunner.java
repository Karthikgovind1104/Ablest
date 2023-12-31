package runnerCls;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/java/featureFile/",
		glue = {"stepDefinitions"},
		
		plugin = {"pretty","html:target/cucumber-reports/reports.html","json:target/cucumber-reports/reports1.json"}
		
		
		
		
		)
public class TestRunner {

}
