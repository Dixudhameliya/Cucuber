package Stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.CustomerPage;
import PageObjects.LogInPage;
import PageObjects.SearchCustomerPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginsteps extends BaseClass{
	
    @Before
	public void setup() {
    	System.out.println("setup method executed.");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		
		lp = new LogInPage(driver);
	}

	@When("User open URL {string}")
	public void user_open_URL(String url) {
		driver.get(url); 
	}

	@When("User enter email {string} and password {string}")
	public void user_enter_email_and_password(String email, String password) {
	    lp.setusername(email);
	    lp.setpassword(password);
	}

	@When("User click on login")
	public void user_click_on_login() {
		lp.clicklogin();;	    
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		}else {
			Assert.assertEquals(title, driver.getTitle());
		}
	  	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link1() throws Exception {
	    lp.clickout();;
	    Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser1() {
	  // driver.close();
	}	
	
	//Customer file steps
	
	@Then("User can view Dashboad")
	public void user_can_view_Dashboad() {
	    cp=new CustomerPage(driver); 
	    Assert.assertEquals("Dashboard / nopCommerce administration",cp.getPagetitle());
	}

	@When("User Click on cutomer menu")
	public void user_Click_on_cutomer_menu() throws InterruptedException {
		Thread.sleep(3000);
		cp.customermenu();
	    
	}

	@When("click on customer menu Item")
	public void click_on_customer_menu_Item() throws InterruptedException {
		Thread.sleep(2000);
		cp.customermenuitem();
	   
	}

	@When("click on Add new button")
	public void click_on_Add_new_button() throws InterruptedException {
		cp.clickonnew();
		Thread.sleep(2000);
	    
	}

	@Then("User can view Add new customer page")
	public void user_can_view_Add_new_customer_page() {
	   Assert.assertEquals("Add a new customer / nopCommerce administration", cp.getPagetitle());
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
		String email=randonstring()+"@gmail.com";
		cp.setemail(email);
		cp.setpassword("test123");
		//cp.setroles("Guest");
		cp.setvendor("Vendor 2");
		cp.setgender();
		cp.setfirstname("Pavan");
		cp.setlastname("Kumar");
		cp.setDob("7/05/1985");
		cp.setcompanyname("busyQA");
		cp.setcontest("This is for testing......");
		
	    
	}

	@When("Click on save button")
	public void click_on_save_button() {
	   cp.clickonsave();
	}
	@After
	public void down(Scenario sc) {
		System.out.println("Down method executed.");
		
		if(sc.isFailed()) {
			File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrfile, new File(
						"C:\\Program Files\\Eclipse\\eclipse-workspace\\Cucumber\\ScreenShot\\failedScreenshot.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		driver.quit();
	}
	
	@When("Enter customer Email")
	public void enter_customer_Email() {
	   sc=new SearchCustomerPage(driver);
	   sc.setEmail("victoria_victoria@nopCommerce.com");
	}

	@When("Click on Search button")
	public void click_on_Search_button() {
	   sc.clickSearch();
	}

	@Then("User should found Email in the search table")
	public void user_should_found_Email_in_the_search_table() {
		boolean status=sc.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
		Assert.assertEquals(false,status);
	}
	
	@When("Enter customer Firstname")
	public void enter_customer_Firstname() {
		 sc=new SearchCustomerPage(driver);
		 sc.setFirstName("Victoria");
	}

	@When("Enter customer Lastname")
	public void enter_customer_Lastname() {
	    sc.setLastName("Terces");
	}

	@Then("User should found Name in the search table")
	public void user_should_found_Name_in_the_search_table() {
		boolean status=sc.searchCustomerByName("Victoria Terces");
		Assert.assertEquals(true,status);
	}


	
	
	
}
