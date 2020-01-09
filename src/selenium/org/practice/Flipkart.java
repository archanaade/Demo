package selenium.org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		System.out.println("Launching Browser"); // upcasting
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);// creating Thread
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("http://www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"_114Zhd\"]/li"));
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		for (WebElement item : menu) {
			System.out.println(item.getText());
			String name=item.getText();
			a.moveToElement(item).build().perform();
			Thread.sleep(1000);
			List<WebElement> submenu = driver.findElements(By.xpath("//span[contains(.,'"+name+"')]/parent::li/descendant::ul[@class=\"QPOmNK\"]/li"));
			
		 for(WebElement subitemname:submenu) {
				 System.out.println(subitemname.getText());
			    }
			    
		}
	}
}