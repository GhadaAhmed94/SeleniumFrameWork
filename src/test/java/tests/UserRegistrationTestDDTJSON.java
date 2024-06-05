package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonDataReader;

import pages.HomePage;
import pages.Loginpage;
import pages.UserRegistrationPage;

public class UserRegistrationTestDDTJSON extends TestBase
{
	
	HomePage homepageobject;
	UserRegistrationPage registerobject;
	Loginpage loginobject;
	
	
	@Test(priority = 1, alwaysRun = true)
	public void userCanRegister() throws InterruptedException, FileNotFoundException, IOException, ParseException
	{
		 JsonDataReader jsonReader=new JsonDataReader();
		jsonReader.JsonReader();
		
		homepageobject=new HomePage(driver);
		homepageobject.openRegistrationpage();
		registerobject=new UserRegistrationPage(driver);
		registerobject.userRegisteration(jsonReader.firstname,jsonReader.lastname,jsonReader.email,jsonReader.password);
Assert.assertTrue(registerobject.successmessagElement.getText().contains("Your registration completed"));		
		Thread.sleep(350);
		
	}
@Test (dependsOnMethods = {"userCanRegister"})
public void RegisterUserCancontnuelogg()
{
	registerobject.usercancontuniuelog();
}

@Test(dependsOnMethods = {"RegisterUserCancontnuelogg"})
public void RegisterUserCanLogin() throws FileNotFoundException, IOException, ParseException
{
	JsonDataReader jsonReader=new JsonDataReader();
	jsonReader.JsonReader();
	homepageobject.openloginPage();
	loginobject=new Loginpage(driver);
	loginobject.userLogin(jsonReader.email, jsonReader.password);
	//Assert.assertTrue(registerobject.successmessagElement.getText().contains("Log out"));		
	
}
}
