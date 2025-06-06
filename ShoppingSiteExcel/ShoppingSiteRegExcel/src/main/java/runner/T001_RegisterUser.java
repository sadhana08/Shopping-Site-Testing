package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.RegisterUser;

public class T001_RegisterUser extends BaseClass{
	
	@BeforeTest
	public void setDataFileName() {
		fileName = "RegisterUser";
	}
	
	@Test(dataProvider = "getData")
	public void register(String fName, String lName, String email, String password) {
		RegisterUser regUser = new RegisterUser(driver);
		HomePage homePg = new HomePage(driver);
		homePg.gotoRegister();
		regUser.enterFirstName(fName).enterLastName(lName).enterEmail(email).enterPassword(password).clickRegister().registraionDone();
	}
}
