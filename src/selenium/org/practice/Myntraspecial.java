package selenium.org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntraspecial {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	//upcasting
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		List<WebElement>menu=driver.findElements(By.xpath("//header[@class=\"desktop-container\"]"));
		Actions a=new Actions(driver);
		for(WebElement item :menu)
		 {
			 
			 a.moveToElement(item).build().perform();
			 String menu1=item.getText();

			 //System.out.println(item.getText());
			  String submenu=menu1.substring(0, 1)+menu1.substring(1).toLowerCase();
			  System.out.println(submenu);
			  Thread.sleep(2000);
			  List<WebElement>menu2=driver.findElements(By.xpath("//a[contains(.,'"+submenu+"')]/parent::div[@class=\"desktop-navLink\"]"));	  
			  Thread.sleep(2000);
			  for(WebElement submenuname:menu2)
			  {
				  System.out.println(submenuname.getText());
			  }
			  Thread.sleep(2000);
		 }

	}

}
