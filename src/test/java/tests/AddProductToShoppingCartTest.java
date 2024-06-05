package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddProductToShoppingCartPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class AddProductToShoppingCartTest extends TestBase{
    HomePage homeobject;
    SearchPage searchObject;
    ProductDetailsPage detailsobject;
    AddProductToShoppingCartPage cartPage;
    String productName="Apple MacBook Pro 13-inch";
    
    @Test(priority = 1)
    public void UserCansearchwithautoSugesst()throws InterruptedException
    
   
    {
    	searchObject =new SearchPage(driver);
    	searchObject.productsearchusingautosugesst("MacB");
    	detailsobject=new ProductDetailsPage(driver);
    	Assert.assertTrue(detailsobject.productnamrresultassert.getText().equalsIgnoreCase(productName));

    	
    }
	@Test(priority = 2)
	public void UserCanAddProducttoCart()throws InterruptedException
	{
		detailsobject=new ProductDetailsPage(driver);
		detailsobject.AddToCart();
        Thread.sleep(1000);
        driver.navigate().to("https://demo.nopcommerce.com/cart");
	}
	@Test(priority = 3)
	public void UserCanRemoveProductFromCart() {
		cartPage=new AddProductToShoppingCartPage(driver);
		cartPage.RemoveProductFromCart();
	}
}
