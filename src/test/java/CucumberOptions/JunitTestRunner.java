package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/Features/login.feature",
        glue ="stepDefinition",stepNotifications = true,tags = "@regTest or @smokeTest",//provide name of pkg where java class is implemented
        plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cucumberJunit.xml"})
public class JunitTestRunner {

//tags= not "@sanityTest"  -- it will run all test case except sanityTest tags
    //tags ="@smokeTest" -- it will run only smoketest
    //tags="@regTest" and "@smokeTest"  ---- it will run those testcase who have both tags
    //tags="@regTest" or "@smokeTest"  -- it will run those test case either it have smoke tag or reg tag
}