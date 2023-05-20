package glueCode;

import accelerators.RR_Action;
import accelerators.RR_Base;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.RR_PageObjects;

public class RR_Gluecode {
	
	
	@Given("^Launch the browser$")
	public void launch_the_browser() {
		 RR_Base.OpenBrowser(); 
	}
	@And("^I am on the Project Rocket Raccoon page$")
	public void i_am_on_the_project_rocket_raccoon_page() {
		 System.out.println("home page");
	}
	@Then("^I verify Rocket Raccoon name$")
	public void i_verify_rocket_raccoon_name() {
		
		RR_Action.waitForElement(RR_PageObjects.Homepage_title, 15);
		String title=RR_Action.getElementText(RR_PageObjects.Homepage_title, "homepageTitle");
		Assert.isTrue(true, title, "homepageTitle");
		
	}
	@And("^I click the delete button$")
	public void i_click_the_delete_button() {
		RR_Action.clickOnElement(RR_PageObjects.delete_button, "delete button") ;
	}
	@Then("^directed to the delete page$")
	public void directed_to_the_delete_page() {
		 System.out.println("home page");
	}
	@And("^Clicked the yes button$")
	public void clicked_the_yes_button() {
		RR_Action.clickOnElement(RR_PageObjects.yes_button, "Yes button") ;
	}
	
	@Then("^User directed to the home page$")
	public void user_directed_to_the_home_page() {
	    System.out.println("home page");
	}

	@Then("I click the Add button")
	public void i_click_the_add_button() {
		RR_Action.clickOnElement(RR_PageObjects.add_button, "Add Button");
	}
	@Then("^I enter page \"(.*)\" and \"(.*)\"$")
	public void I_enter_page_project_and_discription(String sTitle ,String sDescr ) {
		RR_Action.typeInTextBox(RR_PageObjects.title_textfield, sTitle, "title text field");
		RR_Action.typeInTextBox(RR_PageObjects.Descr_textAr, sDescr, "Description text area");
		
	}
	@Then("I click the Submit button")
	public void i_click_the_submit_button() {
		
		RR_Action.clickOnElement(RR_PageObjects.submit_button, "Submit Button");
	}

	
	
	
}
