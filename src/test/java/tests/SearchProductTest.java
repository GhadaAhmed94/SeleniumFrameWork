package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchProductTest extends TestBase
{
	String productName ="Apple MacBook Pro 13-inch";
	SearchPage searchObject;
	ProductDetailsPage detailsobject;
	
	
	@Test
	public void UserCanSearchForProduct()
	{
		searchObject =new SearchPage(driver);
		detailsobject=new ProductDetailsPage(driver);
		searchObject.Productsearch(productName);
		searchObject.mproductdetailespage();
		Assert.assertTrue(detailsobject.productnamrresultassert.getText().equalsIgnoreCase(productName));
	}

}
