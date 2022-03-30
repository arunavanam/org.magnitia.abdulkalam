package tests;

import io.cucumber.java.en.Given;

public class Testa {
	@ Given("I have {int} cucumbers in my belly")
	public void i_have_cucumbers_in_my_belly(Integer x) 
	    {
		System.out.println(x);
	   }

}