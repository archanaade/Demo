package selenium.org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {
	public static void main(String[] args) throws InterruptedException 
	{
		
	//GETTING URL AND TITLE OF THE PAGE
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	
		WebDriver driver=new ChromeDriver();
		//System.out.println("Loading URL");
		//driver.get("http://www.facebook.com");
		System.out.println("Closing url");
		
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("http://www.facebook.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}

}
