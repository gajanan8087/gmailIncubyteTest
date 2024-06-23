package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C://Users//HP//Desktop//Incubyte//src//test//resources//Features//sendMail.feature"},
		glue = {"stepDefinations"},
		dryRun= false,
		monochrome =true,
		plugin= {"pretty","html:test-output"}
		)

public class testRunner {

}
