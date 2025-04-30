package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features="src/test/java/FeatureFiles/",
	glue= {"StepDefinition", "Hooks"},
	dryRun=false,
	//tags="@test1",
	monochrome=false,
	plugin= {"pretty", "html:target/cucumber.html",
			//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	}
		
)
public class TestRunner
{

	
}
 