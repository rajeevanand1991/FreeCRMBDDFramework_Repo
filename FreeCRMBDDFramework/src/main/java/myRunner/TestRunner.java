package myRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\eclipseWorkspace\\FreeCRMBDDFramework\\src\\main\\java\\features\\login.feature", 
		glue = {"stepDefinitions"}

		// format= {"pretty","html:test-output"}
)

public class TestRunner {

}