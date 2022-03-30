package tests;

import io.cucumber.java.en.Given;

public class Test9 
{
  @Given("my girl friend is {word} {word}")
  public void method(String x,String y)
  {
	  System.out.println(x);
	  System.out.println(y);
	  
  }
}
