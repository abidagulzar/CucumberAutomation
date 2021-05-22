package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/Features/Login.feature",
        glue ="stepDefinition",stepNotifications = true) //provide name of pkg where java class is implemented
public class JunitTestRunner {


}
