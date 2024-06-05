package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Loginpage;
import pages.ProductDetailsPage;
import pages.ProductReviewPage;
import pages.SearchPage;
import pages.UserRegistrationPage;

public class AddProductReviewTest extends TestBase 
{

	/*
	 * 1-user registeration
	 * 2-user login
	 * 3-search for product 
	 * 4-add review 
	 * 
	 */
	HomePage homepageobject;
	UserRegistrationPage registerobject;
	Loginpage loginobject;
	String productName ="Apple MacBook Pro 13-inch";
	SearchPage searchObject;
	ProductDetailsPage detailsobject;
	ProductReviewPage reviewObject;

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegister() throws InterruptedException
	{
		homepageobject=new HomePage(driver);
		homepageobject.openRegistrationpage();
		registerobject=new UserRegistrationPage(driver);
		registerobject.userRegisteration("Ghada", "Ahmed","ghadaahmedta@gmail.com","123456");
		
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
	loginobject.userLogin("ghadaahmedta@gmail.com", "123456");
	//Assert.assertTrue(registerobject.successmessagElement.getText().contains("Log out"));		
	
}
@Test (dependsOnMethods = {"RegisterUserCanLogin"})

public void UserCansearchwithautoSugesst()
{
	searchObject =new SearchPage(driver);
	searchObject.productsearchusingautosugesst("MacB");
	detailsobject=new ProductDetailsPage(driver);
	Assert.assertTrue(detailsobject.productnamrresultassert.getText().equalsIgnoreCase(productName));

	
}
@Test (dependsOnMethods = {"UserCansearchwithautoSugesst"})
public void usercanreviewproduct() throws InterruptedException
{
	detailsobject.openaddreviewpage();
	reviewObject=new ProductReviewPage(driver);
	reviewObject.AddproductReview("new review","good product");
	Assert.assertTrue(reviewObject.reviewdone.getText().contains("Product review is successfully added."));
	Thread.sleep(350);
	
}

@Test (dependsOnMethods  = {"usercanreviewproduct"})

public void usercanlogout()
{
	registerobject.userlogout();
}

	
}
