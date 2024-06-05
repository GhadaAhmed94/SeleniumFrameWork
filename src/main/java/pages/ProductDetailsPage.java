package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (css="strong.current-item")
			public WebElement productnamrresultassert;
			
			
	@FindBy (css="span.price-value-4.price-value-4")
	public WebElement productpricelabel;
	
	@FindBy (linkText ="Add your review")
	public WebElement addproductreviewlink;
	
@FindBy (id="add-to-cart-button-4")
public WebElement addProductbtn;


public void openaddreviewpage()
{
	clickButton(addproductreviewlink);
	
}

public void AddToCart()
{
	clickButton(addProductbtn);
}
}