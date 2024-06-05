package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	
	protected WebDriver driver;	//protected 3ala level el package de bs 
     public JavascriptExecutor jse;
     public Select select;
     public Actions action;
	//create constructor
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//hena ha3ml refactor le ay btn byt3mlo click we asredirect el method de ashl
	protected static void clickButton(WebElement button) 
	{
		button.click();
		
	}
	//hena ha3ml methods le el sendkeys kolhom
	protected static void setTextElmenttText(WebElement txt,String value) 
	{
		txt.sendKeys(value);
		
	}
	public void scrolltoBottom()
	{
		jse.executeAsyncScript("scrollBy(0,3000)");
		
	}
	public void clearText(WebElement element)
	{
		element.clear();
	}

	
}
