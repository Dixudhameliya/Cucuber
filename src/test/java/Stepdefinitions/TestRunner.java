package Stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Customer.feature",
glue = {"Stepdefinitions"},
monochrome = true,
dryRun = false,
plugin = {"pretty","html:target/HtmlReports/report.html"})
public class TestRunner {

}
