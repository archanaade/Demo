package selenium.org.practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchguru99 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	System.out.println("Launching Browser"); // upcasting
	WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);// creating Thread
	driver.manage().window().maximize();
	System.out.println("Loading URL");
   driver.get("http://demo.guru99.com/test/upload/");
   WebElement cl=driver.findElement(By.xpath("//div[@id=\"file_wraper0\"]"));
   cl.click();
   Runtime rt=Runtime.getRuntime();
   rt.exec("‪‪C:\\Users\\Shree\\Desktop\\upload1.exe");

}
}
