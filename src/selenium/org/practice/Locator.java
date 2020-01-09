package selenium.org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;//it is interface
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("http://www.facebook.com");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email"));//loading the locator and give the id of email
		email.sendKeys("abc");//passing the value for email text field
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Archu");//passing value for pwd
		//Thread.sleep(2000);
		//driver.close();
		WebElement login=driver.findElement(By.id("loginbutton"));
		login.click();
		
		

}
}