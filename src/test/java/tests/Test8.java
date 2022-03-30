package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test8
  {
	@Given("open the Firefox and launch the application")
	public void open_the_firefox_and_launch_the_application() 
	{
	   System.out.println("open the firefox and launch the application");
	}

	@When("Enter the username and password")
	public void enter_the_username_and_password()
	{
	    System.out.println("enter username and password onthe login page");
	    
	}

	@Then("Reset the credential")
	public void reset_the_credential()
	{
	   System.out.println("click on the reset button");
	}
}
