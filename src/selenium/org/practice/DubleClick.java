package selenium.org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DubleClick {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("http://www.google.com");
		Thread.sleep(2000);
        WebElement search=driver.findElement(By.name("q")) ;
        //search.sendKeys("java");
      search.sendKeys("java",Keys.ENTER);
      
      WebElement search1=driver.findElement(By.xpath("//div[@class=\"kno-ecr-pt PZPZlf gsmt\"]/span[contains(.,'Java')]"));
      //using text()//WebElement search1=driver.findElement(By.xpath("//div[@class=\"kno-ecr-pt PZPZlf gsmt\"]/span[text()='Java']");
      Actions a=new Actions(driver);
      a.doubleClick(search1).perform();
 
}
}