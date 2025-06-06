package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.When;

public class HomePage extends BaseClass{

	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public RegisterUser gotoRegister() {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		return new RegisterUser(driver);
	}
}
