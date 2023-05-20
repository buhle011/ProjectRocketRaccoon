import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "RRR_Assessment/features/Raccoon.feature" ,
		glue     = "glueCode",
		plugin   = {"pretty","html:target/HtmlReports"},
		tags ="@Test"
		
		)
public class TestRunner {
	
}

