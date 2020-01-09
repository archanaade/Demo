package selenium.org.practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void screenShot(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);  //
		File screensave=new File(".\\ScreenShots\\"+name+".png");
		Files.copy(screenshot, screensave);
		
	}

}
