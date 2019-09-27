package meaven.CaseStudy1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import meaven.case_study.Drivers;
//import meaven.case_study.Drivers;

public class SearchTest
{
	WebDriver driver;
	Actions act;
	
	@Given("^user logs in as a User$")
	public void user_logs_in_as_a_User() throws Throwable {
		//driver = Drivers1.startBrowser("firefox", "http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
		driver = Drivers1.openBrowser("chrome");
		// driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");

		// driver.get("http://www.newtours.com/");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("SignIn")).click();
		Assert.assertEquals("Login", driver.getTitle());
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("Login")).click();
		Assert.assertEquals("Home", driver.getTitle());
	}

	@When("^user types in the search bar$")
	public void user_types_in_the_search_bar() throws Throwable {
		driver.findElement(By.name("products")).click();
	    
	}

	@When("^user enters the word \"([^\"]*)\"$")
	public void user_enters_the_word(String arg1) throws Throwable {
		driver.findElement(By.name("products")).sendKeys(arg1);
	}


	@When("^user clicks on Find Details$")
	public void user_clicks_on_Find_Details() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click(); //for find details use xpath
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^user clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String arg1) throws Throwable {
		driver.findElement(By.linkText("Add to cart")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^cart is updated with the number of objects in it$")
	public void cart_is_updated_with_the_number_of_objects_in_it() throws Throwable {
		String check=null;
		check=driver.findElement(By.partialLinkText("Cart")).getText();
		System.out.println("The number of items is:"+check.charAt(5));
	}

	@When("^user clicks on cart$")
	public void user_clicks_on_cart() throws Throwable {
		driver.findElement(By.partialLinkText("Cart")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getTitle(), "View Cart");
	}

	@Then("^user proceeds with payment$")
	public void user_proceeds_with_payment() throws Throwable {
		driver.findElement(By.linkText("Checkout")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		String txt= driver.findElement(By.xpath(".//*[@id='total']/p")).getText();
//		System.out.println("The total price is:"+txt);
		
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> r=driver.findElements(By.name("radio1"));
		System.out.println(r.size());
		driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("btn")).click();
		driver.findElement(By.name("username")).sendKeys("123457");
		driver.findElement(By.name("password")).sendKeys("Pass@457");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("transpwd")).sendKeys("Trans@457");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getTitle(), "Order Details");
		driver.findElement(By.linkText("SignOut")).click();
		driver.close();
	}

	@When("^user is shown a negative message$")
	public void user_is_shown_a_negative_message() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Home");
	}

	@Then("^user remains on the same page$")
	public void user_remains_on_the_same_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Home");
		driver.close();
	}


}
