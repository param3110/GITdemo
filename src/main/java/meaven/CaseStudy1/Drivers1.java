package meaven.CaseStudy1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers1 {
	
	
	
	
	static WebDriver driver;
	public static WebDriver openBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\selenium 1\\selenium driver file\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\selenium 1\\selenium driver file\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\selenium 1\\selenium driver file\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		else
			System.out.println("Invalid browser !!");
		return driver;
	}
		
		
		
	

}