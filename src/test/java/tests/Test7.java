package tests;

 import io.cucumber.java.en.Given;

public class Test7 
{
	@Given ("send mail to {string} with {word} as subject and body as:")

    public void method (String x,String y,String z)
    {
  	  System.out.println(x);
  	  System.out.println(y);
  	  System.out.println(z);
    }
} 