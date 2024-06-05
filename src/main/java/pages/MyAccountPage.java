package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (linkText = "Change password") 
	WebElement changepasswordLink;
	
	@FindBy (id= "OldPassword") 
	WebElement oldpasswordTXt;
	
	@FindBy (id= "NewPassword") 
	WebElement newpasswordTXt;
	
	@FindBy (id= "ConfirmNewPassword") 
	WebElement confirmpasswordTXt;
	
	@FindBy (css="button.button-1.change-password-button")
	WebElement changepasswordbtn;
	
	@FindBy (id="bar-notification")//div.bar-notification.success
	public WebElement changepasswordresult;
	@FindBy (css="span.close")
	public WebElement closemesgElement;
	
	@FindBy (linkText="Log in")
	public WebElement continuelog;
	
	@FindBy (linkText= "Log out")
	public WebElement logoutlink;
	
	public void openchangepasswordpage ()
	{
		clickButton(changepasswordLink);
	}
	
	public void changepassword(String oldpass,String newpass)
	{
		setTextElmenttText(oldpasswordTXt, oldpass);
		setTextElmenttText(newpasswordTXt,newpass);
		setTextElmenttText(confirmpasswordTXt, newpass);
		clickButton(changepasswordbtn);
		clickButton(closemesgElement);
	}
	
	public void userlogout ()
	{
		clickButton(logoutlink);
	}
}
