package pl.gda.wsb.TestRunner;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
        features = "src/test/resources/Features/",
        glue = "pl/gda/wsb/StepDefinitions",
        publish = true)
public class TestRunner {
}