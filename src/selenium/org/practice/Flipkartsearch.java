package selenium.org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartsearch {
	
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	System.out.println("Launching Browser"); // upcasting
	WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);// creating Thread
	driver.manage().window().maximize();
	System.out.println("Loading URL");
	driver.get("http://www.flipkart.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
	WebElement search=driver.findElement(By.xpath("//input[@name=\"q\"]"));
search.sendKeys("c# books",Keys.ENTER);
Thread.sleep(2000);
WebElement price=driver.findElement(By.xpath("//div[@class=\"_3ywJNQ\"]/descendant::div[contains(.,'Price -- Low to High')]"));
Thread.sleep(2000);
price.click();

}

}
////div[@class=\"_3ywJNQ\"]/descendant::div[@class=\"_1xHtJz\"]"