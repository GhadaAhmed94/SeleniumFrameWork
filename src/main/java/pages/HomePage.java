package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		jse=(JavascriptExecutor) driver;
		action=new Actions(driver);
	}
	@FindBy(id="customerCurrency")
	WebElement currencyddl;

	
	@FindBy(linkText= "Register")
	
	WebElement registerLink;
	
	@FindBy (xpath  = "log in")
	WebElement loginLink;
	
	//@FindBy(xpath ="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a") WebElement loginLink;
	@FindBy (linkText = "My account")
	WebElement Myaccount;
	
	@FindBy (linkText = "Contact us")
	WebElement contactuslink;
	

	@FindBy (linkText = "Computers")
	WebElement ComputerMenu;
	@FindBy (linkText = "Notebooks")
	WebElement notebooks;
	
	public void openRegistrationpage() 
	{
		clickButton(registerLink);
		
	}
	public void openloginPage() 
	{
		clickButton(loginLink);
		
	}
	public void openmyaccountpage() 
	{
		clickButton(Myaccount);
		
	}
	public void opencontactuspage() 
	{
		scrolltoBottom();
		clickButton(contactuslink);
	}
public void changecureency()
{
	select =new Select(currencyddl);
	select.selectByVisibleText("Euro");
}
public void selectnotebooksfromhovermenu()
{
  action.moveToElement(ComputerMenu).moveToElement(notebooks).click()
  .build().perform();
  
  
  
}
}
