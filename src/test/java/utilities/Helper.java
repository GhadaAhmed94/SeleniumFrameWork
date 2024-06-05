package utilities;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Helper {
     //method to take screenshot when the test case failed 
	public static void captureScreenshot(WebDriver driver ,String screenshotname)
	{
		Path destination=Paths.get("./Screenshots",screenshotname+".png");
		try {
			Files.createDirectories(destination.getParent());
			FileOutputStream out=new FileOutputStream(destination.toString());
			out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Excpetion while takingscreenshot"+e.getMessage());
		}
	}
}
