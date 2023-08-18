package Stepdefinitions;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObjects.CustomerPage;
import PageObjects.LogInPage;
import PageObjects.SearchCustomerPage;

public class BaseClass {

	public WebDriver driver;
	public LogInPage lp;
	public CustomerPage cp;
	public SearchCustomerPage sc;
	
	public static String randonstring() {
		String generatString=RandomStringUtils.randomAlphabetic(5);
		return (generatString);
	}
}
