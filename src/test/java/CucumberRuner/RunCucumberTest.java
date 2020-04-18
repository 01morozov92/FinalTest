package CucumberRuner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(strict =true, plugin = {"pretty"}, features = {"src/test/resources/features/"}, glue = "Steps")
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}