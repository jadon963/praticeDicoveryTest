package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/HomePage.feature", //the path of the feature files
        glue={"stepDefinition"},format= {"pretty","html:test-outout","json:json_output/cucumber.json"},
        monochrome = true,
        strict = true,
        dryRun = false
        )
        public class TestRunner {



}
