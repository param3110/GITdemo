package meaven.CaseStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login1Test {
	WebDriver driver;
	
	@Given("^User in the login page$")
	public void user_in_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		driver = Drivers1.openBrowser("chrome");
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
		Assert.assertEquals(driver.getTitle(), "Home");
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^User enters valid credentials of lalitha and Password(\\d+)$")
	public void user_enters_valid_credentials_of_lalitha_and_Password(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
	}

	@Then("^user directed to home page$")
	public void user_directed_to_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		
		driver.findElement(By.name("Login")).click();

		Assert.assertEquals(driver.getTitle(), "Home");
	}

//	@When("^User enters valid credentials of Param and Password(\\d+)$")
//	public void user_enters_valid_credentials_of_Param_and_Password(int arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // throw new PendingException();
//	}


}
