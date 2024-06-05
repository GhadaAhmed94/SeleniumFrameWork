package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Loginpage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase
{
	HomePage homepageobject;
	UserRegistrationPage registerobject;
	Loginpage loginobject;
	
	@Test(priority = 1, alwaysRun = true)
	public void userCanRegister() throws InterruptedException
	{
		homepageobject=new HomePage(driver);
		homepageobject.openRegistrationpage();
		registerobject=new UserRegistrationPage(driver);
		registerobject.userRegisteration("Ghada", "Ahmed","ghaadataha@test207.com","123456");
		
Assert.assertTrue(registerobject.successmessagElement.getText().contains("Your registration completed"));		
		Thread.sleep(350);
	}
@Test (dependsOnMethods = {"userCanRegister"})
public void RegisterUserCancontnuelogg()
{
	registerobject.usercancontuniuelog();
}

@Test(dependsOnMethods = {"RegisterUserCancontnuelogg"})
public void RegisterUserCanLogout() throws InterruptedException
{
	Thread.sleep(350);
		registerobject.userlogout();
		
	
}

/*@Test
public void RegisterUserCanLogin() throws InterruptedException
{
	Thread.sleep(450);
	registerobject.registeruserlogin();

	loginobject=new Loginpage(driver);
	loginobject.userLogin("ghaadataha@test6", "123456");
	//Assert.assertTrue(registerobject.successmessagElement.getText().contains("Log out"));		
	
}*/

}

