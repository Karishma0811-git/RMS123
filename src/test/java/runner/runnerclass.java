package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/feature/RMS123.feature"},
        glue = {"steps"},monochrome = true,
        plugin={"pretty","html:target/htmlReport","json:target/report.json","junit:target/report.xml"
        }
)

public class runnerclass {
}
