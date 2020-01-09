package selenium.org.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("http://www.gmail.com");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   // to avoid thread.sleep we use implictlyWait
		
		WebElement uname=driver.findElement(By.id("identifierId"));//loading the locator and give the id of email
		uname.sendKeys("archanaade17@gmail.com");//passing the value for email text field
		
		
		//driver.close();
		WebElement nextbtn=driver.findElement(By.id("identifierNext"));
		nextbtn.click();
		//Thread.sleep(5000);
		WebElement upass=driver.findElement(By.name("password"));
		upass.sendKeys("archumunnu17",Keys.ENTER);
		
		
		
		
	}

}
