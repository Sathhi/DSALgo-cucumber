package Step_Definitions;

import org.openqa.selenium.WebDriver;
import DriverFactory.Driverfactory;
import PageObjectModel.Signin_Page;
import io.cucumber.java.en.*;

public class Signin_Page_SD {
	WebDriver driver;
	Signin_Page sp;
	String Username;
	String Password;
	@Given("user is in Signin page")
	public void user_is_in_signin_page() {
		driver=Driverfactory.getDriver();
		sp= new Signin_Page(driver);
	 	   
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_ninjagos_and_rose(String Username,String Password) {
		sp.userNameEnter().sendKeys(Username);
		sp.passwordEnter().sendKeys(Password);
	   
	}

	@When("clicks login button")
	public void clicks_login_button() throws InterruptedException {
	   sp.loginClick().click();
	   Thread.sleep(2000);
	}

	@Then("user navigated to Homepage")
	public void user_navigated_to_homepage() {
	    System.out.println("User navigated to Main page");
	}


}
