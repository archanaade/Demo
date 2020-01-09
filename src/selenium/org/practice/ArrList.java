package selenium.org.practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrList {
	public static void main(String[] args) throws InterruptedException 
	{
		//to load naukari.com id and CLOSES CHILD BROWSERS
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>wins=driver.getWindowHandles();
		System.out.println(wins.getClass());
		ArrayList<String>al=new ArrayList<>();
		for(String s:wins)
		{
			al.add(s);
			
			driver.switchTo().window(s).close();
		}
	}
			

}
