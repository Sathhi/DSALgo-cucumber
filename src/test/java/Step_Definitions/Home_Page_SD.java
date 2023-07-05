package Step_Definitions;

import org.openqa.selenium.WebDriver;

import DriverFactory.Driverfactory;
import PageObjectModel.Home_page;
import io.cucumber.java.en.*;

public class Home_Page_SD {
	WebDriver driver;
	Home_page hg;
	@Given("User click the datastructure dropdown will come")
	public void user_click_the_datastructure_dropdown_will_come() {
	    System.out.println("User is in Home page");
	    driver=Driverfactory.getDriver();
	    hg=new Home_page(driver);
	    hg.dropdowndatastructures().click();
		 
	}

	@When("user clicks the Arrays")
	public void user_clicks_the_arrays() throws InterruptedException {
		
	 hg.Arrayclick().click();
	 Thread.sleep(2000);
	}

	/*@Then("User clicks Array get a message you are not logged in")
	public void Array_clickuser_get_a_message_you_are_not_logged_in() {
	    System.out.println("click Array you are not logged in");
	}*/

	@When("user clicks the Linked list")
	public void user_clicks_the_linked_list() throws InterruptedException {
		hg.dropdowndatastructures().click();
	   hg.linkedlistClick().click();
	   Thread.sleep(2000);
	}
	/*@And("User clicks linked list get a message you are not logged in")
	public void linked_listclick_user_get_a_message_you_are_not_logged_in() {
	    System.out.println("click linked list you are not logged in");
	}*/

	@When("user clicks the stack")
	public void user_clicks_the_stack() {
		hg.dropdowndatastructures().click();
		hg.stackclick().click();
	}
	/*@And("User click the stack get a message you are not logged in")
	public void stack_click_user_get_a_message_you_are_not_logged_in() {
	    System.out.println("click the stack you are not logged in");
	}*/

	@When("user clicks the queue")
	public void user_clicks_the_queue() {
		hg.dropdowndatastructures().click();
	    hg.queueClick().click();
	}
	/*@And("User click the queue get a message you are not logged in")
	public void queue_click_user_get_a_message_you_are_not_logged_in() {
	    System.out.println("click the queue you are not logged in");
	}*/

	@When("user clicks the Tree")
	public void user_clicks_the_tree() {
		hg.dropdowndatastructures().click();
	    hg.treeclick().click();
	}
	/*@And("User click the tree get a message you are not logged in")
	public void tree_click_user_get_a_message_you_are_not_logged_in() {
	    System.out.println("click the tree you are not logged in");
	}*/
	@When("user clicks the Graph")
	public void user_clicks_the_graph() {
		hg.dropdowndatastructures().click();
	    hg.graphclick().click();
	    }
	/*@And("User click the graph get a message you are not logged in")
	public void graph_click_user_get_a_message_you_are_not_logged_in() {
	    System.out.println("click the graph you are not logged in");
	}*/


}
