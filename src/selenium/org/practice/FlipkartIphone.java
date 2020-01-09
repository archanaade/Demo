package selenium.org.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartIphone 
{
 public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		System.out.println("Launching Browser"); // upcasting
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(2000);// creating Thread
		driver.manage().window().maximize();
		System.out.println("Loading URL");
       driver.get("http://www.flipkart.com");
       
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		
		WebElement search=driver.findElement(By.xpath("//input[@name=\"q\"]"));  //for  search
	search.sendKeys("iphone");
	Actions a=new Actions(driver);
    List<WebElement> list=driver.findElements(By.xpath("//form[@class=\'_1WMLwI header-form-search\']/descendant::ul[@class=\'col-12-12 _1PBbw8\']/li"));
    
	
    for(WebElement list1:list)
    {
    	System.out.println(list1.getText());
    a.moveToElement(list1).build().perform();
    
	Thread.sleep(2000);
	}

}
}