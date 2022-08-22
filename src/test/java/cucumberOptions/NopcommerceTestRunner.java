package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// Duong dan toi file feature
		features = "src/test/java/nopcommerce/features",
		
		// Tim den package step definition
		glue = "nopcommerce.stepDefinitions",
		//dryRun = true,
		monochrome = true,
		plugin = { "pretty", "html:target/site/cucumber-report-default", "json:target/site/cucumber.json"},
		snippets = SnippetType.CAMELCASE,
		tags = { "@register_login" })
public class NopcommerceTestRunner {

}
