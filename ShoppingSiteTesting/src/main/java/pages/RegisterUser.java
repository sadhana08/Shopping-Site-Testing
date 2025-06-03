package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class RegisterUser extends BaseClass{
	
	public RegisterUser(ChromeDriver driver) {
		this.driver = driver;
	}
	
	
	public RegisterUser enterFirstName(String fName) {
		driver.findElement(By.id("FirstName")).sendKeys(fName);
		return this;
	}
	
	public RegisterUser enterLastName(String lName) {
		driver.findElement(By.id("LastName")).sendKeys(lName);
		return this;
	}
	
	public RegisterUser enterEmail(String email) {
		driver.findElement(By.id("Email")).sendKeys(email);
		return this;
	}
	
	public RegisterUser enterPassword(String password) {
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		return this;
	}
	
	public void clickRegister() {
		driver.findElement(By.id("register-button")).click();
			
	}
	
	public void registraionDone() {
		
	}
}
