package tests;

import io.cucumber.java.en.Given;

public class Test4 {
	@Given("I have {string} cucumbers in my belly")
	public void i_have_cucumbers_in_my_belly(String x)
	{
	   System.out.println(x);
	}

}
