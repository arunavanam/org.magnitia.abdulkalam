package tests;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;

public class Test3 {
	@ParameterType(name="mbno",value="[6-9][0-9]{9}")
	public String get (String x)
	{
		return("+91"+x);
	}
	@Given("my india contact is {mbno}")
	public void my_india_contact_is(String C) 
	{
	   System.out.println(C);
	}

	
}
