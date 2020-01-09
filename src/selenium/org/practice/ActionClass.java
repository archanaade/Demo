package selenium.org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	//upcasting
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		
		System.out.println("Loading URL");
		driver.get("http://www.urbanladder.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
		List<WebElement>menu=driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
	    //mouseover actions
		Actions a=new Actions(driver);//actions class
	    Thread.sleep(1000);
	    for(WebElement item :menu)
	    {
	   	 System.out.println(item.getText());
	   	 String name=item.getText();
	    a.moveToElement(item).build().perform();//perform mouse over action
	    Thread.sleep(1000);
	    List<WebElement>submenu=driver.findElements(By.xpath("//span[contains(.,'"+name+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
	    for(WebElement subitemname:submenu) {
	    	System.out.println(subitemname.getText());
	    }
	    
	    }
	}
}