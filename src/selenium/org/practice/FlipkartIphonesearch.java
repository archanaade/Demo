package selenium.org.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartIphonesearch {
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
		
		WebElement search=driver.findElement(By.xpath("//input[@type=\"text\"]"));  //for  search
	    search.sendKeys("iphone");
	   Actions a=new Actions(driver);
	   System.out.println("----------------suggetions------------------");
        List<WebElement> list=driver.findElements(By.xpath("//ul[@class=\'col-12-12 _1PBbw8\']/descendant::li/ancestor::form[@class=\'_1WMLwI header-form-search\']"));
  
    Thread.sleep(2000);
    for(WebElement list1:list)
    {
   
    a.moveToElement(list1).build().perform();
    System.out.println(list1.getText());
    Thread.sleep(2000);
	}
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//driver.findElement(By.xpath("//span[contains(.,'iphone')]/parent::div[@class=\"_2kpuIQ\"]/descendant::div[contains(.,'in Mobiles')]")).click();
	}
}
	////ul[@class=\'col-12-12 _1PBbw8\']/descendant::li"

//ul[@class=\"col-12-12 _1PBbw8\"]/descendant::li/ancestor::form[@class=\"_1WMLwI header-form-search
////ul[@class=\"col-12-12 _1PBbw8\"]