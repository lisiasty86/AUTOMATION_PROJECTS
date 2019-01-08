package WebdriverUniversityFramework.testRunner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
        features = {"src/test/java/WebdriverUniversityFramework/Features/"},
        glue = {"WebdriverUniversityFramework.Steps"}
        //monochrome = true,
        //tags = {},
        //plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
)

public class mainRunner {
}
