package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/PetStoreCreateOrder.feature",
        glue 	 = {"stepdefinitions","utils"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PetStoreCreateOrderRunner {
}
