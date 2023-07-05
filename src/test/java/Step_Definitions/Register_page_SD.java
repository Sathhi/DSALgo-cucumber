package Step_Definitions;
import org.openqa.selenium.WebDriver;

import DriverFactory.Driverfactory;
import PageObjectModel.Registration_Page;
import io.cucumber.java.en.*;

public class Register_page_SD
{
	WebDriver driver;
	Registration_Page rp;
	String Username;
@Given("user navigated to the registration page")
public void user_navigated_to_the_registration_page() throws InterruptedException {
	driver=Driverfactory.getDriver();
	rp= new Registration_Page(driver);
    rp.registerClick().click();
    Thread.sleep(2000);
}

@And("^Enters (.*)and (.*)$")
public void enters_Username(String Username,String Password) throws InterruptedException {
    rp.Registerusername().sendKeys(Username);
    rp.passwordenter().sendKeys(Password);
    rp.passwordenter2().sendKeys(Password);
    Thread.sleep(2000);
}

@When("user clicks Register")
public void user_clicks_register() throws InterruptedException {
  rp.registerlink().click(); 
  Thread.sleep(2000);
}

@Then("user displays error message")
public void user_displays_error_message() {
  System.out.println("fields not filled");  
}
@Given("^user Enters (.*) and (.*)$")
public void user_enters_ninjagos_and_password(String Username,String Password) {
	driver=Driverfactory.getDriver();
	rp= new Registration_Page(driver);
	rp.Registerusername().sendKeys(Username);
    rp.passwordenter().sendKeys(Password);
    rp.passwordenter2().sendKeys(Password);
}

@When("user clicks login button")
public void user_clicks_login_button() throws InterruptedException {
 rp.registertologin().click();  
 Thread.sleep(2000);
}
@Then("user navigated to login page")
public void user_navigated_to_login_page() {
	System.out.println("User in sign in page");
}
}