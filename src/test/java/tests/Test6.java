package tests;

import java.math.BigDecimal;

import io.cucumber.java.en.Given;

public class Test6 
{
	@Given("pi value is {bigdecimal}")
	public void pi_value_is (BigDecimal x) 
	{
	    System.out.println(x);
	
	}
}
