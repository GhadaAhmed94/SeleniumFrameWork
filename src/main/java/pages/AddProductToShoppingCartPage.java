package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductToShoppingCartPage extends PageBase {

	public AddProductToShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="removefromcart")
	WebElement removeCheck;
	
	@FindBy(name="updatecart")
	WebElement updateCartBtn;
	
	@FindBy (id="itemquantity11236")
	WebElement quantityTxt;
	
	@FindBy (css="span.product-subtotal")
	WebElement totallabel;
	
	public void RemoveProductFromCart()
	{
		clickButton(removeCheck);
		clickButton(updateCartBtn);
	}
    
	
	public void UpdateProductQuantity(String Quantity)throws InterruptedException
	{
		//clear old quantity
	   clearText(quantityTxt);
	  setTextElmenttText(quantityTxt,Quantity );
	  clickButton(updateCartBtn);
	}
}
