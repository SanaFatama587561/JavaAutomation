package selenium_test_learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class JobSearchPage {
	@Test
	public static void searchPage() {
		String url= "https://staging.careerwebsite.com/jobs/?site_id=22457";   // Store the url in the url veriable
		
		//Initialize your chromwdriver
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sanafatama.shah/eclipse-workspace/selenium_test_learn/src/main/resources/chromedriver (2).exe");
		
		WebDriver driver = new ChromeDriver();      // create an object for Chromedriver class. 
		 driver.get(url);  // pass the url to get method using driver object
		
		 //Mazimize the window
		 
		 driver.manage().window().maximize();
		 
		 //Verify the Title of the page .
		 // Get page Title at runtime from page  
		 String PageTitle = driver.getTitle();
		 
		 System.out.println("The page title we are getting is"+ PageTitle);
		 
		 //Verify with the actual and expected result .
		 Assert.assertEquals("Recent Jobs - Jean's Test Site, etc. &", PageTitle);
		 
		 driver.close();
		
	}
	

}
