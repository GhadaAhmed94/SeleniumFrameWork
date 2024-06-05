package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPAge;
import pages.HomePage;

public class ContactusTestscroll  extends TestBase{
	
	HomePage home;

	ContactUsPAge contactusObject;
	
	String firstname="TestG";
	String email="test@gmail.com";
	String enquiry="hello admin this is test";
	
	@Test
	
	public void Usercancontactus()
	{
		home=new HomePage(driver);
		home.opencontactuspage();
		contactusObject=new ContactUsPAge(driver);
		contactusObject.contactUS(firstname, email, enquiry);
		Assert.assertTrue(contactusObject.successmsgcontact.getText()
		.contains("Your enquiry has been successfully sent to the store owner."));
		
	}
}
