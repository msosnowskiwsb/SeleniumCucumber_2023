package pl.gda.wsb.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"},
        features = "src/test/resources/Features/",
        glue = "pl/gda/wsb/StepDefinitions",
        publish = true)
public class TestRunner {
}