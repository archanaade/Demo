package selenium.org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	//upcasting
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("http://www.myntra.com");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		List<WebElement>menu=driver.findElements(By.xpath("//header[@class=\"desktop-container\"]"));
		for(WebElement item :menu)
		 {
			 System.out.println(item.getText());
		 }

}
}