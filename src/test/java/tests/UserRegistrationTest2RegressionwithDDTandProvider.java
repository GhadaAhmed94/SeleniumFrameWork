package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Loginpage;
import pages.UserRegistrationPage;

public class UserRegistrationTest2RegressionwithDDTandProvider extends TestBase
{
	HomePage homepageobject;
	UserRegistrationPage registerobject;
	Loginpage loginobject;
	
	@DataProvider(name="testData")
	public static Object [] []userData()
	{
		return new Object[][]
				{
			{"Ghada ","Ahmed","testdatad@gmail.com","12345678"},
			{"ghada","taha","testdd@gmail.com","123456"}
			};
	}
	
	@Test(priority = 1, alwaysRun = true,dataProvider = "testData")
	public void userCanRegister(String Fname,String Lname,String email,String pass) throws InterruptedException
	{
		homepageobject=new HomePage(driver);
		homepageobject.openRegistrationpage();
		registerobject=new UserRegistrationPage(driver);
		//registerobject.userRegisteration("Ghada", "Ahmed","ghadat@gmail.com","123456");
		registerobject.userRegisteration(Fname,Lname,email,pass);
		
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
	loginobject.userLogin("ghadat@gmail.com", "123456");
	//Assert.assertTrue(registerobject.successmessagElement.getText().contains("Log out"));		
	
}
}
