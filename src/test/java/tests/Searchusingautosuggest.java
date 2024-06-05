package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class Searchusingautosuggest extends TestBase 
{
	String productName ="Apple MacBook Pro 13-inch";
SearchPage searchObject;
ProductDetailsPage detailsobject;

@Test

public void UserCansearchwithautoSugesst()
{
	searchObject =new SearchPage(driver);
	searchObject.productsearchusingautosugesst("MacB");
	detailsobject=new ProductDetailsPage(driver);
	Assert.assertTrue(detailsobject.productnamrresultassert.getText().equalsIgnoreCase(productName));

	
}
}
