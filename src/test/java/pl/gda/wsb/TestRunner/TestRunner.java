package pl.gda.wsb.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
        features = "src/test/resources/Features/",
        glue = "pl/gda/wsb/StepDefinitions")
public class TestRunner {
}