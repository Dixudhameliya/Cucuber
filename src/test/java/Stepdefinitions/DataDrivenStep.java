package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.DataDrivenPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenStep {
  
	WebDriver driver;
	DataDrivenPage login;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/login.html");
	}

	@Given("^(.*) and (.*) are entered by user$")
	public void username_and_password_are_entered_by_user(String username, String password) {
		login=new DataDrivenPage(driver);
		login.enterusername(username);
		login.enterpassword(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    login.clicklogin();
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
	    driver.close();
	    driver.quit();
	}
}
