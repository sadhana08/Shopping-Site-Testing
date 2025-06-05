package runner;

import baseCu.BaseClassCu;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Registration.feature",
glue="stepDefinition",
publish = true,
monochrome = true)

public class T001_RegisterUser_Cu extends BaseClassCu{
	
}
