package selenium.org.practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {
	public static void main(String[] args) 
	{
		//to load naukari.com id and CLOSES CHILD BROWSERS
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>wins=driver.getWindowHandles();
		wins.remove(parent);
		for(String win:wins)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			driver.close();
		}
	}
}
