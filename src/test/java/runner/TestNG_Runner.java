package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = {"src/test/resources/elearning.feature"},
		glue = {"elearning"},
		plugin = {"pretty", "html:cucumber-html-report.html", "json:cucumber-json-report.json", "junit:cucumber-xml-report.xml"})

public class TestNG_Runner extends AbstractTestNGCucumberTests {

}
