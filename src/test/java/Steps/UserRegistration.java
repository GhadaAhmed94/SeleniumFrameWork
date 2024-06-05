package Steps;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.UserRegistrationPage;
import tests.TestBase;

public class UserRegistration extends TestBase {
	HomePage homeobject ;
	UserRegistrationPage registerobjectPage;
	
	@Given("the user in the home page")
	public void the_user_in_the_home_page() {
	   homeobject=new HomePage(driver);
	   homeobject.openRegistrationpage();
	}
	
	
	@When("I click on Register link")
	public void i_click_on_register_link() {
		Assert.assertTrue(driver.getCurrentUrl().contains("register"));
		
	}
	   
	/*@When("I entered the user data")
	public void i_entered_the_user_data() {
	   registerobjectPage =new UserRegistrationPage(driver);
	   registerobjectPage.userRegisteration("ghada", "Ahmed", "ghada@gmail.com", "12345678");
	   
	}*/
	
	@When("I entered {string},{string},{string},{string}")
	public void i_entered(String firstname, String lastname, String email, String password)
	
	{
		registerobjectPage =new UserRegistrationPage(driver);
		   registerobjectPage.userRegisteration(firstname, lastname, email, password);
	}
	
	
	@Then("the registration page displayed successfully")
	public void the_registration_page_displayed_successfully() 
	{
	   registerobjectPage.usercancontuniuelog();
	   
}
	@Then ("logout")
	public void logout()
	{
		registerobjectPage.userlogout();
	}


}
