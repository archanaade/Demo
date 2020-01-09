package selenium.org.practice;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		System.out.println("Launching Browser"); // upcasting
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("loading url");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(10000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,0)");   //for x index top to down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-100,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
}
}