package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPAge extends PageBase{

	public ContactUsPAge(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (id="FullName")
	WebElement firstnamtxt;
	@FindBy (id="Email")
	WebElement Emailtxt;
	@FindBy (id="Enquiry")
	WebElement Enquirytxt;
	@FindBy (css="button.button-1 contact-us-button")
	WebElement submitbtn;
	
	@FindBy (css="div.result")
	public WebElement successmsgcontact;
	
	public void contactUS(String firstname,String email ,String enquiry)
	{
		setTextElmenttText(firstnamtxt, firstname);
		setTextElmenttText(Emailtxt,email);
		setTextElmenttText(Enquirytxt,enquiry);
		clickButton(submitbtn);
		
	}
	


}
