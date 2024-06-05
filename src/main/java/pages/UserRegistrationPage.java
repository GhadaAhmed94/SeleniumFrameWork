package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="gender-male")//(id="gender-male")
			WebElement genderRadiobtn;
	
	@FindBy(id = "FirstName")
	WebElement fnTxtboxElement;
	@FindBy(id = "LastName")
	WebElement lnTxtbox;
	
	@FindBy(id = "Email")
	WebElement emailtxtbox;
	
	@FindBy(id = "Password")
	WebElement passwordtxtbox;
	

	@FindBy(id = "ConfirmPassword")
	WebElement confirmpasswordtxtbox;
	
	@FindBy(id = "register-button")
	WebElement registerbtn;
	
	@FindBy(css="div.result")
	public WebElement successmessagElement;//da hast5dmo fe el assertion 3and el test page 
	//b3d ma 3mlt elments found le kol el objects bta3et el page ha3ml b2a implmentation btmrer el data men 5elal paramter 
	//gowa el method bdl ma aktbha we tfdl fixed we da hardcode 
//	@FindBy (linkText="a.button-1.register-continue-button") //Log in
	@FindBy (xpath = "//*[@id=\"main\"]/div/div/div/div[2]/div[2]/a")
	public WebElement continuelog;
	
	//@FindBy (linkText = "Log out")
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	public WebElement logoutlink;
	
	@FindBy (css = "a.ico-login")
	public WebElement loginbtnElement;
	
	@FindBy (linkText = "My account")public WebElement myAccountlink;
	
	public void userRegisteration(String fristname, String lastnameString ,String email, String password)
	{
	
		clickButton(genderRadiobtn);
		setTextElmenttText(fnTxtboxElement,fristname);
		setTextElmenttText(lnTxtbox, lastnameString);
		setTextElmenttText(emailtxtbox, email);
		setTextElmenttText(passwordtxtbox, password);
		setTextElmenttText(confirmpasswordtxtbox, password);
		clickButton(registerbtn);
		
	}
	//b3d ma 5alst el page factory we gahezt el base haro7 akml fe el Test file 
	
	
	public void usercancontuniuelog()
	{
		clickButton(continuelog);
	}
	public void openMyAccountpage()
	{
		clickButton(myAccountlink);
	}
	public void userlogout()
	{
		clickButton(logoutlink);
	}
	public void registeruserlogin()
	{
		clickButton(loginbtnElement);
	}
	
}
