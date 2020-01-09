package selenium.org.practice;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchThanos {
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("http://www.google.com");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement search=driver.findElement(By.name("q")) ;
        Thread.sleep(2000);
      search.sendKeys("thanose",Keys.ENTER);
    WebElement result= driver.findElement(By.xpath("//div[@id=\"resultStats\"]/parent::div[@id=\"sbfrm_l\"]"));
     System.out.println(result.getText());
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[@jscontroller=\"zfndQe\"]")).click();
	
	}
}