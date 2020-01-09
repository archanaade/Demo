package selenium.org.practice;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Goggle {
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
        search.sendKeys("java");
      //search.sendKeys("java",Keys.ENTER);
        Thread.sleep(1000);
        System.out.println("---------suggestions--------");
       
        Actions a=new Actions(driver);
       List<WebElement> suggetions=driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
      for(WebElement sugg:suggetions)
      {
      System.out.println(sugg.getText());
      a.moveToElement(sugg).build().perform();
      Thread.sleep(1000);
      }
      
      System.out.println("---------------click and print-------------");
      WebElement option=driver.findElement(By.xpath("//span[contains(.,'javascript')]/b"));
      System.out.println(option.getText());
      option.click();
      Thread.sleep(2000);
      
        
}
}