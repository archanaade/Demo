package selenium.org.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UrbanLa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	//upcasting
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		
		System.out.println("Loading URL");
		driver.get("http://www.urbanladder.com");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
	    driver.findElement(By.xpath("//a[contains(.,' Stores ')]")).click();
	    Actions a=new Actions(driver);
       List<WebElement>list =driver.findElements(By.xpath("//h3[@class=\"_3JJeW\"]"));
       Thread.sleep(2000);
       for(WebElement sugg:list)
       {
       System.out.println(sugg.getText());
       a.moveToElement(sugg).build().perform();
       Thread.sleep(1000);
	}
}
}
//div[@class=\"_3oCTi\"]/a