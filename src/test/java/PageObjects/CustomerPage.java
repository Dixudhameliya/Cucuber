package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage {

	WebDriver driver;

	public CustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By lnkCustomer_menu=By.xpath("//body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]");
	By lnkCustomers_menuitem=By.xpath("//body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]");
	
	By btnAddnew=By.xpath("//body/div[3]/div[1]/form[1]/div[1]/div[1]/a[1]");
	By txtEmail=By.id("Email");
	By txtpassword=By.id("Password");
	By txtrole=By.xpath("//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[1]/div[1]/div[2]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]");
	
	By drpOfVendor=By.xpath("//select[@id='VendorId']");
	
	By txtFirstname=By.id("FirstName");
	By txtLastname=By.id("LastName");
	By rdgender=By.id("Gender_Male");
	
	By txtDob=By.xpath("//input[@id='DateOfBirth']");
	By txtCompnyname=By.id("Company");
	By AdminContent=By.xpath("//textarea[@id='AdminComment']");
	By btnsave=By.xpath("//body/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]");
	
	public String getPagetitle() {
		return driver.getTitle();
	}
	
	public void customermenu() {
	driver.findElement(lnkCustomer_menu).click();
	}
	public void customermenuitem() {
		driver.findElement(lnkCustomers_menuitem).click();
		}
	public void clickonnew() {
		driver.findElement(btnAddnew).click();
		}
	public void setemail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
		}
	public void setpassword(String password) {
		driver.findElement(txtpassword).sendKeys(password);
		}
	public void setroles(String role) {
		driver.findElement(txtrole).click();
		}
	public void setvendor(String value) {
		Select drp=new Select(driver.findElement(drpOfVendor));
		drp.selectByVisibleText(value);
		}
	public void setfirstname(String fname) {
		driver.findElement(txtFirstname).sendKeys(fname);
		}
	public void setlastname(String lname) {
		driver.findElement(txtLastname).sendKeys(lname);
		}
	public void setgender() {
		driver.findElement(rdgender).click();
		}
	public void setDob(String dob) {
		driver.findElement(txtDob).sendKeys(dob);
		}
	public void setcompanyname(String cname) {
		driver.findElement(txtCompnyname).sendKeys(cname);
		}
	public void setcontest(String con) {
		driver.findElement(AdminContent).sendKeys(con);
		}
	public void clickonsave() {
		driver.findElement(btnsave).click();
		}
}
