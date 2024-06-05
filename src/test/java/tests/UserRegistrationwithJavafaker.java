package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.Loginpage;
import pages.UserRegistrationPage;

public class UserRegistrationwithJavafaker extends TestBase
{
	HomePage homepageobject;
	UserRegistrationPage registerobject;
	Loginpage loginobject;
	Faker fakedata=new Faker();
	String firstname=fakedata.name().firstName();
	String lastname=fakedata.name().lastName();
	String email=fakedata.internet().emailAddress();
	String password=fakedata.number().digits(8).toString();
	
	@Test(priority = 1, alwaysRun = true)
	public void userCanRegister() throws InterruptedException
	{
		homepageobject=new HomePage(driver);
		homepageobject.openRegistrationpage();
		registerobject=new UserRegistrationPage(driver);
		registerobject.userRegisteration(firstname,lastname,email,password);
		
		System.out.println("userdata is:"+email+"passwordis:"+password);
Assert.assertTrue(registerobject.successmessagElement.getText().contains("Your registration completed"));		
		Thread.sleep(350);
	}
@Test (dependsOnMethods = {"userCanRegister"})
public void RegisterUserCancontnuelogg()
{
	registerobject.usercancontuniuelog();
}

@Test(dependsOnMethods = {"RegisterUserCancontnuelogg"})
public void RegisterUserCanLogin()
{
	homepageobject.openloginPage();
	loginobject=new Loginpage(driver);
	loginobject.userLogin(email,password);
	//Assert.assertTrue(registerobject.successmessagElement.getText().contains("Log out"));		
	
}
}
