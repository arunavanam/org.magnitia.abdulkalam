package tests;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11
{
          
			RemoteWebDriver driver;
			@Given("open {string}")
			public void open(String string) 
			{
				WebDriverManager.firefoxdriver().setup();
				  driver=new FirefoxDriver();
			}
			@Given("launch site using {string}")
			public void launch_site_using(String string)
			{
			   driver.get("http://www.gmail.com");
			}
			@When("do login using {string} and {string}")
			public void do_login_using_and(String string, String string2) throws Exception 
			{
				driver.findElement(By.name("identifier")).sendKeys("rajeshwarivanam28");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
				Thread.sleep(5000);
				driver.findElement(By.name("password")).sendKeys("advika@18");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
				Thread.sleep(5000);
			}
			@When("click on compose")
			public void click_on_compose() throws Exception
			{
				driver.findElement(By.xpath("//div[text()='Compose']")).click();
				Thread.sleep(5000);
			}
			@Then("compose is displayed")
			public void compose_is_displayed() throws Exception
			{
				
			}
			@Then("fields should be displayed")
			public void fields_should_be_displayed()
			{
			    
			}



				@When("fill fields with {string},{string}<body>{string}<attachement>\"")
				public void fill_fields_with_body_attachement(String string, String string2, String string3) throws Exception 
				{
				driver.findElement(By.name("to")).sendKeys("p.rekhamohan@gmail.com");
				Thread.sleep(5000);
				// fill subject field in compose
				driver.findElement(By.name("subjectbox")).sendKeys("Hello");
				Thread.sleep(5000);
				//message body
				driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("hi akka\n how are you\n my first automation programm");
				Thread.sleep(5000);
				//attach file
				driver.findElement(By.name("Filedata")).sendKeys("C:\\Users\\rajiv\\OneDrive\\Pictures\\Screenshots\\2021-11-11.png");
				Thread.sleep(5000);
		     	}
				@Then("send is enabled")
				public void send_is_enabled()
				{
				}
				
				@When("click on send")
				public void click_on_send() throws Exception 
				{
					driver.findElement(By.xpath("//div[text()='Send']")).click();
					Thread.sleep(5000);
				}
				@Then("{string} should be displayed")
				public void should_be_displayed(String string) throws Exception 
				{
					String x=	driver.findElement(By.xpath("//div[@role='alert']/descendant::span[2]")).getText();
				    System.out.println("output message is:"+x);
				    Thread.sleep(5000);
				}
				@When("do logout")
				public void do_logout() throws Exception
				{
					driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]/img")).click();
				    Thread.sleep(5000);
				}
				@Then("login page should be displayed")
				public void login_page_should_be_displayed() 
				{
				}
				@When("close site")
				public void close_site()
				{
					driver.close();
				}
				    
			}
