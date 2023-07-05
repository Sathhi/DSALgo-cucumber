package Step_Definitions;

import org.openqa.selenium.WebDriver;

import DriverFactory.Driverfactory;
import PageObjectModel.Main_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Main_page_sd {
	WebDriver driver;
	Main_page mainpage;
	@Given("User enters into main URL")
	public void user_enters_into_main_url() {
	   driver=Driverfactory.getDriver();
	   
	}
	@When("user clicks the button")
	public void user_clicks_the_button() throws Exception {
		  mainpage=new Main_page(driver);
		   mainpage.getstartedoption().click();
		   Thread.sleep(2000);
		   
		}
	

	@Then("User navigated to new page")
	public void user_navigated_to_new_page() {
		System.out.println("user navigated from main page");
	    
	}



}
