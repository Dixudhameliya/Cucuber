package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchStep {
  
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
	    WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("User is on google search page")
	public void user_is_on_google_search_page() {
	   driver.get("https://www.google.ca/");
	}

	@When("Uase ebters a test in search box")
	public void uase_ebters_a_test_in_search_box() {
	   driver.findElement(By.id("APjFqb")).sendKeys("Software Automation Testing");
	}

	@When("User hits enter")
	public void user_hits_enter() {
	   driver.findElement(By.name("btnK")).click();
	}

	@Then("User is navigated to search results")
	public void user_is_navigated_to_search_results() {
	  driver.getPageSource().contains("Software Automation Testing");
	  driver.close();
	  driver.quit();
	}

}
