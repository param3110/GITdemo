package meaven.CaseStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import meaven.case_study.Drivers;

public class RegistrationTset {
	
	 WebDriver driver;
	
	
//	@Given("^User not previously registered with test me$")
//	public void user_not_previously_registered_with_test_me() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	   // throw new PendingException();
//		
//		Assert.assertEquals(driver.getTitle(), "Home");
//		System.out.println("Launched testme");
//		driver.findElement(By.linkText("SignUp")).click();
//	}

	 @Given("^User not previously registered with test me$")
	public void user_at_the_SignUp_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		 
		 
		 driver = Drivers1.openBrowser("chrome");
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 
		Assert.assertEquals(driver.getTitle(), "Home");
		System.out.println("Launched testme");
		driver.findElement(By.linkText("SignUp")).click();
	}

	@When("^User enter valid credentials of  username \"([^\"]*)\" ,$")
	public void user_enter_valid_credentials_of_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		driver.findElement(By.name("userName")).sendKeys("tobykuttan1");
		
		
	}

	@When("^firstname as \"([^\"]*)\"$")
	public void firstname_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		driver.findElement(By.name("firstName")).sendKeys("toby");
	}

	@When("^Lastname \"([^\"]*)\"$")
	public void lastname(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.findElement(By.name("lastName")).sendKeys("kuttan");
	}

	@When("^password  \"([^\"]*)\"$")
	public void password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.findElement(By.name("password")).sendKeys("12345678");
	}

	@When("^Confirm password  = \"([^\"]*)\"$")
	public void confirm_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("confirmPassword")).sendKeys("12345678");
		
	}

	@When("^choose gender as \"([^\"]*)\"$")
	public void choose_gender_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.xpath("//input[@type='radio' and @value = 'Male']")).click();
		
	}

	@When("^Enter email address as \"([^\"]*)\"$")
	public void enter_email_address_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("emailAddress")).sendKeys("tobykuttan@gmail.com");
	}

	@When("^Mobile number  \"([^\"]*)\"$")
	public void mobile_number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("mobileNumber")).sendKeys("9004042530");
	}

	@When("^Select DOB as (\\d+)/(\\d+)/(\\d+)$")
	public void select_DOB_as(int arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("dob")).sendKeys("10/31/1997");
	}

	@When("^Enter the Address as \"([^\"]*)\"$")
	public void enter_the_Address_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.id("address"))
		.sendKeys("212 royal gardn, No12 North Avenue , keshavaperumal puram Ra Puram ");
	}

	@When("^Select the security question \"([^\"]*)\"$")
	public void select_the_security_question(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("securityQuestion")).sendKeys("What is your favour color");
	}

	@When("^Enter the Answer as \"([^\"]*)\"$")
	public void enter_the_Answer_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("answer")).sendKeys("tiger");
	}

	@When("^click the \"([^\"]*)\" button$")
	public void click_the_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^User directed to home page$")
	public void user_directed_to_home_page() throws Throwable {
	}


	

}
