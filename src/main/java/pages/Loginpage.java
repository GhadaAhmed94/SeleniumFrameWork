package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends PageBase {

	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (id="Email")WebElement emailtxtBox;
	@FindBy (id="Password")WebElement passwordtxtBox;
	
	@FindBy (xpath = "//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")WebElement loginBtn;



public void userLogin(String email, String password) {
	setTextElmenttText(emailtxtBox, email);
	setTextElmenttText(passwordtxtBox, password);
	clickButton(loginBtn);
}
}