package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Loginpage;
import pages.MyAccountPage;
import pages.UserRegistrationPage;

public class MyAccountTest extends TestBase{
	HomePage homepageobject;
	UserRegistrationPage registerobject;
	Loginpage loginobject;
	MyAccountPage myaccountobject;
	String oldpassword="123456";
	String newpassword="12345678";
	String firstname="Ghada";
	String lastname="Ahmed";
	String email="testmicky@gmail.com";
	
	@Test(priority = 1)
	public void userCanRegister() throws InterruptedException
	{
		homepageobject=new HomePage(driver);
		homepageobject.openRegistrationpage();
		registerobject=new UserRegistrationPage(driver);
		registerobject.userRegisteration(firstname, lastname,email,oldpassword);
		
Assert.assertTrue(registerobject.successmessagElement.getText().contains("Your registration completed"));		
		Thread.sleep(350);
	}
	@Test (priority = 2)
	public void RegisterUserCancontnuelogg()
	{
		registerobject.usercancontuniuelog();
	}

	@Test(priority = 3)
	public void RegisterUserCanLogin()
	{
		homepageobject.openloginPage();
		loginobject=new Loginpage(driver);
		loginobject.userLogin(email, oldpassword);
		//Assert.assertTrue(registerobject.successmessagElement.getText().contains("Log out"));		
		
	}
	@Test(priority = 4)
	public void RegisteredUserCanChangePassword() throws InterruptedException {
		myaccountobject= new MyAccountPage(driver);
		registerobject.openMyAccountpage();
		myaccountobject.openchangepasswordpage();
		myaccountobject.changepassword(oldpassword, newpassword);
		
	//Assert.assertTrue(myaccountobject.changepasswordresult.getText().contains("password was changed"));		
		//Thread.sleep(350);
	}

	@Test (priority = 5)
	public void UserCanLogout() throws InterruptedException
	{
		Thread.sleep(350);
		registerobject.userlogout();
	}
	
	
@Test (priority = 6)
public void RegisterUserCanLoginagain()
{
	homepageobject.openloginPage();
	loginobject=new Loginpage(driver);
	loginobject.userLogin(email,newpassword);
	//Assert.assertTrue(registerobject.successmessagElement.getText().contains("Log out"));		
	
}

}
