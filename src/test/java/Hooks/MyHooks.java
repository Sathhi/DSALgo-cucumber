package Hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import DriverFactory.Driverfactory;
import Utils.configreader;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class MyHooks {
	public static WebDriver driver;
	
	@BeforeAll
	public static void setUp() throws Exception
	{
		Properties prop = configreader.initializeproperties();
	 	Driverfactory.initializeBrowser(prop.getProperty("browser"));
		driver=Driverfactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}
	@AfterAll
	public static void tearUp()
	{
		driver.quit();
	}

}
