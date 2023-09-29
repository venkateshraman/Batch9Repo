package glue;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PreRequisit {

    WebDriver driver;
    Properties properties;


    @Before("@abc2")
    public void test() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\rudra\\IdeaProjects\\Batch9Test\\msedgedriver.exe");
        driver = new EdgeDriver();
        properties = new Properties();
        try {
            FileReader reader = new FileReader(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\abc.properties"));
            properties.load(reader);
        } catch (Exception e) {

        }
        System.out.println(properties.getProperty("drivername"));
    }
    @After("@abc2")
    public void after()
    {
        System.out.println("after test");
    }}
