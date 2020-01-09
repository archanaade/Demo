package selenium.org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateback {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	//upcasting
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		
		System.out.println("Loading URL");
		driver.get("http://selenium.dev");
		Thread.sleep(2000);
	WebElement search=driver.findElement(By.xpath("//input[@title=\"search\"]"));
	search.sendKeys("Testng",Keys.ENTER);
	driver.navigate().back();
	search.sendKeys("java",Keys.ENTER);
	Thread.sleep(2000);
}
}