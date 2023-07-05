package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\jayam\\eclipse-workspace\\DSAlgocucumber\\src\\test\\resources\\Features",
glue= {"Step_Definitions","Hooks"},plugin= {"pretty","html:target/HTMLReports/HTMLReports.html"})
//json:target/JSONReports/report.json
//create JSONReorts folder
//JUNITReports folder asell and add report.xml in plugin

public class TestRunner {

}
