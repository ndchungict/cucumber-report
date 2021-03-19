import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       	plugin = {"json:target/cucumber-report/cucumber.json"},
//        plugin = {"pretty","html:target/report"},
        glue="steps",
        features = "src\\test\\resources\\features"
)
public class RunTest {
}
