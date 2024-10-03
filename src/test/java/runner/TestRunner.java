package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\features", //location where are defined the feature files
    glue = "steps", //location where are implemented the steps definitions defined into the feature files 
    plugin = { "pretty","html:target/cucumber-reports" }
)
public class TestRunner {

}
