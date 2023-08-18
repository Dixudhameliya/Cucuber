package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	WebDriver driver;

	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="Email")
	WebElement txtemail;
	
	@FindBy(id="Password")
	WebElement txtpassword;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement btnlogin;
	
	@FindBy(linkText = "Logout")
	WebElement lnklogout;
	
	public void setusername(String user) {
		txtemail.clear();
		txtemail.sendKeys(user);
	}
	public void setpassword(String pass) {
		txtpassword.clear();
		txtpassword.sendKeys(pass);
	}
	public void clicklogin() {
		btnlogin.click();;
	}
	public void clickout() {
		lnklogout.click();;
	}
	
	

}
