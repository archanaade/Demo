package selenium.org.practice;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleExplicit {
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		WebDriverWait ww=new WebDriverWait(driver,10);
		System.out.println("Loading URL");
		driver.get("http://www.google.com");
		Thread.sleep(2000);
        WebElement search=driver.findElement(By.name("q")) ;
       search.sendKeys("java",Keys.ENTER);
       ww.until(ExpectedConditions.titleContains("java"));
       driver.close();
}
}