package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"},
		glue={"stepDefination","myHooks"},
		monochrome = true, tags="@SL"
		
		)
public class Lprunner {

}
