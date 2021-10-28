package co.com.tata.prueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/portalDemoblaze.feature",
        glue = "co.com.tata.prueba.stepdefinitions",
        tags = "@tag",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
