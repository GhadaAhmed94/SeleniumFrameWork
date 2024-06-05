package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
		
	}
	

 @FindBy(id="small-searchterms")
 WebElement searchtextbox;
 @FindBy(css="button.button-1.search-box-button")
 WebElement searchbtn;
 @FindBy(id="ui-id-1")
 List<WebElement> productList;
 
 @FindBy(linkText = "Apple MacBook Pro 13-inch")
 WebElement producttitle;


public void Productsearch(String  productname) 
{
	setTextElmenttText(searchtextbox, productname);
	clickButton(searchbtn);
	
}
public void mproductdetailespage()
{
	clickButton(producttitle);
}
public void productsearchusingautosugesst(String searchtxt)
{
	setTextElmenttText(searchtextbox, searchtxt);
	try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	productList.get(0).click();
	
}

}
