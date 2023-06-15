package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	WebDriver driver;
	
	
	
	@Given("user launches shopwitheg site")
	public void user_launches_shopwitheg_site() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://stg.shopwitheg.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
	
	    
	}


@When("user clicks on login button")
public void user_clicks_on_login_button() {
    
}

@Then("user will be navigated to landing page")
public void user_will_be_navigated_to_landing_page() {
    
}


}
