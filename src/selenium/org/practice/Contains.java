package selenium.org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Contains {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	//upcasting
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		
		System.out.println("Loading URL");
		driver.get("http://www.urbanladder.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
	//WebElement sale=driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
//System.out.println(sale.getText());
//WebElement decor=driver.findElement(By.xpath("//li/span[contains(.,'Decor')]"));
//System.out.println(decor.getText())
 List<WebElement>menu=driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));//all 10 options
 for(WebElement item :menu)
 {
	 System.out.println(item.getText());
 }
 //display submenus of sales
List<WebElement>submenu=driver.findElements(By.xpath("//span[contains(.,'Sale')]/parent::li/descendant::ul[@class=\"taxonslist\"]/li"));
for (WebElement item1:submenu)
{
	System.out.println(item1.getText());
}

}
 }


