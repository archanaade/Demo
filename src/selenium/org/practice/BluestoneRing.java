package selenium.org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneRing 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	//upcasting
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("http://www.bluestone.com");
		Thread.sleep(5000);
       WebElement ring= driver.findElement(By.xpath("//a[@title=\"Rings\"]/parent::li[@class=\"menuparent repb\"]"));
       Actions a=new Actions(driver);
       a.moveToElement(ring).build().perform();
       //System.out.println(ring.getText());
       Thread.sleep(2000);
       WebElement diamond=driver.findElement(By.xpath("//ul[@class=\"odd-even-bg\"]/descendant::a[contains(.,'Diamond')]"));
       diamond.click();
       Thread.sleep(2000);
	 
	WebElement price=driver.findElement(By.xpath("//span[@class=\"title style-fill i-right\"]/ancestor::section[@id=\"Price-form\"]"));
	 price.click();
	 a.moveToElement(price).build().perform();
	 Thread.sleep(2000);
	 System.out.println(price.getText());
	 Thread.sleep(2000);	}
}
////a[contains(.,'Diamond')]/parent::li[@class=\"active\"]"
////span[@class=\"title style-fill i-right\"]/ancestor::div[@class=\"new-filters\"]