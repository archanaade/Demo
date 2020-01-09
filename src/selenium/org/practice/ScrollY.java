package selenium.org.practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollY {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		System.out.println("Launching Browser"); // upcasting
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		System.out.println("loading url");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(10000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");   //for y index top to down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollWidth)");
	}
}
