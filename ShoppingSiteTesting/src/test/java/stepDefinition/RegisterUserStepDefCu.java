package stepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import baseCu.BaseClassCu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterUserStepDefCu extends BaseClassCu{

//	public RegisterUserStepDefCu(ChromeDriver driver) {
//		this.driver = driver;
//	}
	
	@When("enter the first name as {string}")
	public RegisterUserStepDefCu enterFirstName(String fName) {
		driver.findElement(By.id("FirstName")).sendKeys(fName);
		return this;
	}
	
	@And("enter the last name as {string}")
	public RegisterUserStepDefCu enterLastName(String lName) {
		driver.findElement(By.id("LastName")).sendKeys(lName);
		return this;
	}
	
	@And("enter the email as {string}")
	public RegisterUserStepDefCu enterEmail(String email) {
		driver.findElement(By.id("Email")).sendKeys(email);
		return this;
	}
	
	@And("enter the password as {string}")
	public RegisterUserStepDefCu enterPassword(String password) {
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		return this;
	}
	
	@And("click Register")
	public RegisterUserStepDefCu clickRegister() {
		driver.findElement(By.id("register-button")).click();
		return this;	
	}
	
	@Then("registration should be successful")
	public void registraionDone() {
		String text = driver.findElement(By.xpath("//div[contains(text(), 'registration completed')]")).getText();
		Assert.assertEquals(text, "Your registration completed");
	}
}
