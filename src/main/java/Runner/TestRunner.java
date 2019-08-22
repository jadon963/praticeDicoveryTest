package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static java.lang.System.getProperty;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/neeraj93/tut/DiscoveryTestBasic/src/test/java/Feature", //the path of the feature files
        glue={"stepDefinition"},format= {"pretty","html:test-outout","json:json_output/cucumber.json"},
        monochrome = true,
        strict = true,
        dryRun = false
        )
        public class TestRunner {

}
