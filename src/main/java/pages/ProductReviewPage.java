package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends PageBase {

	public ProductReviewPage(WebDriver driver) {
		super(driver);
	}
		
		@FindBy (id="AddProductReview_Title")
		WebElement reviewtitletxt;
		
		@FindBy (id="AddProductReview_ReviewText")
		WebElement reviewtxt;
		
		@FindBy (id="addproductrating_3")
		WebElement ratebtn;
		
		@FindBy (name="add-review")
		WebElement submitbtn;
		
		@FindBy (css="div.result")
		public WebElement reviewdone;
		
		public void AddproductReview(String revtitle,String  revitxt) {
			
			setTextElmenttText(reviewtitletxt, revtitle);
			setTextElmenttText(reviewtxt, revitxt);
			clickButton(ratebtn);
			clickButton(submitbtn);
			
		}
		
		
	

}
