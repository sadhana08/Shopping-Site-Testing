package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import baseCu.BaseClassCu;
import io.cucumber.java.en.When;

public class HomePgCu extends BaseClassCu{

//	public HomePgCu(ChromeDriver driver) {
//		this.driver=driver;
//	}
	
	@When("Click on the Register Tab")
	public RegisterUserStepDefCu gotoRegister() {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		return new RegisterUserStepDefCu();
	}
}
