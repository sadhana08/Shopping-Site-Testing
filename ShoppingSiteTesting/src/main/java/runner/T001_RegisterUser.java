package runner;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.RegisterUser;

public class T001_RegisterUser extends BaseClass{
	
	@Test
	public void register() {
		RegisterUser regUser = new RegisterUser(driver);
		HomePage homePg = new HomePage(driver);
		homePg.gotoRegister();
		regUser.enterFirstName("Sadh").enterLastName("S").enterEmail("sadhs@gmail.com").enterPassword("sadh@123").clickRegister();
	}
}
