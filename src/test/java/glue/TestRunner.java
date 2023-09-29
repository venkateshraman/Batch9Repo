package glue;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "glue",
        tags = "@abc2",
        plugin = {"pretty","html:target/abc.html"}
)
public class TestRunner {
}
