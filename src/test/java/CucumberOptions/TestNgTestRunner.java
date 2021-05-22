package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features/Login.feature",
glue = "stepDefinition")
public class TestNgTestRunner extends AbstractTestNGCucumberTests { // we user AbstractTestNGCucumberTests this class to run testNG runner in cucuber for run test cases
    //and for junitestrunner we simply use RunWith(Cucumber.class

}
