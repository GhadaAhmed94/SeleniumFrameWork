package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class HoverMenue extends TestBase {
HomePage homeObject;

@Test 
public void usercanhover()
{
	homeObject=new HomePage(driver);
	homeObject.selectnotebooksfromhovermenu();
	//Assert.assertTrue(driver.getCurrentUrl().contains("Notebooks"));
}
}
