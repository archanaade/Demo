

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAll {
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
		al.addAll(wins);
		for(int i=al.size()-1;i>=0;i--)
		{
			driver.switchTo().window(al.get(i)).close();
		}

		
}}
