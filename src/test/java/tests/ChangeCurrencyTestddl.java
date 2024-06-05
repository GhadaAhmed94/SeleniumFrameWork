package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class ChangeCurrencyTestddl extends TestBase {
	HomePage home;
	ProductDetailsPage detailesobject;
	SearchPage searchObject;
	String productName ="Apple MacBook Pro 13-inch";

	@Test(priority = 1)
	public void usercanchangecurrency()
	{
		home=new HomePage(driver);
		home.changecureency();
		detailesobject=new ProductDetailsPage(driver);
		
		
		
	}
	@Test(priority = 2)
	public void usercansearchwithautosuggest()
	{
		try {
			
		
		searchObject=new SearchPage(driver);
		searchObject.productsearchusingautosugesst("MacB");
		detailesobject=new ProductDetailsPage(driver);
		Assert.assertTrue(detailesobject.productnamrresultassert.getText().equalsIgnoreCase(productName));
		Assert.assertTrue(detailesobject.productpricelabel.getText().contains("€"));
		
		} catch (Exception e) {
			System.out.println("error occured"+ e.getMessage());
		}
		
	}
	

}
