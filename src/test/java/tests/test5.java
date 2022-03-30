package tests;

import io.cucumber.java.en.Given;

public class test5 
{
     @ Given("i have {int} cucumber(s) in my belly/stomach")
     public void i_have_cucumber_in_my_belly(Integer x)
     {
    	 System.out.println(x);
     }
}
