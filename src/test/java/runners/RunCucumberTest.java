package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "definicionpasos"
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}