package WebdriverUniversityFramework.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
        features = {"src/test/java/WebdriverUniversityFramework/Features/"},
        glue = {"WebdriverUniversityFramework.Steps"},
        monochrome = true,
        dryRun = false,
        tags = {},
        plugin = {"pretty",
                "html:target/cucumber",
                "json:target/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
)

public class mainRunner extends AbstractTestNGCucumberTests{
}
