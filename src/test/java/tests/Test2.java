package tests;


import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;

public class Test2
{
	@Given("User PAN CARD number is {pancard}")
	public void user_pan_card_number_is(String C) 
	  {
	    System.out.println("hello my pan is "+C);
	    
	  }
 @ParameterType(name="pancard",value="\"[A-Z]{5}[0-9]{4}[A-Z]\"")
 	public String get(String x)
 	{
	 return(x);
 	}
}