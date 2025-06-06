package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ExcelIntegrationWithTC;

public class BaseClass {
	
	public String fileName;
	public ChromeDriver driver;
	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
//		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name="getData")
	public String[][] sendData() throws IOException {
		return ExcelIntegrationWithTC.excelValue(fileName);
	}

}
