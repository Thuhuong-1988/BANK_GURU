package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "src/test/java/stepDefinitions",
        monochrome = true,
        plugin = {
                "pretty",
                "html: target/site/cucumber-reports",
                "json:target/site/cucumber.json"},
        snippets = SnippetType.CAMELCASE,
        tags = {"@login"}
)
public class TestRunner {
}
