package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataDrivenPage {
	
	WebDriver driver;

	public DataDrivenPage(WebDriver driver) {
		this.driver = driver;
	}
	By username=By.id("email");
	By password=By.id("passwd");
	By loginbtn=By.id("SubmitLogin");
	
	public void enterusername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	public void enterpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void clicklogin() {
		driver.findElement(loginbtn).click();;
	}
	

}
