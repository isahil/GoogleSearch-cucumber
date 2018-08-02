package step_def;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleStepDefinition {
	
	WebDriver driver;
	
	@Given("^User opens chrome and goes to google page$")
	public void User_opens_chrome_and_goes_to_google_page()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/sahil/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@When("^User enters an artist name in the search box and click search$")
	public void User_enters_an_artist_name_in_the_search_box_and_click_search(){
		
	    WebElement box = driver.findElement(By.xpath("//input[@id = 'lst-ib']"));
	   
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click", box);
	    
	    
	    box.sendKeys("the weeknd");
	}

	@Then("^google search result page is displayed$")
	public void google_search_result_page_is_displayed(){
		WebElement button = driver.findElement(By.xpath("//input[@name = 'btnK']"));
	    Actions ac = new Actions(driver);
	    ac.moveToElement(button).click(button).perform();
	}
	
	@Then("^close the browser$")
	public void close_the_browser(){
		driver.close();
		driver.quit();
	}

}
