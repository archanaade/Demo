package selenium.org.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptscrol {

	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			System.out.println("Launching Browser"); // upcasting
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.get("https://selenium.dev/");
			System.out.println("loading url");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
JavascriptExecutor js=(JavascriptExecutor)driver;
WebElement ele=driver.findElement(By.xpath("//h2[contains(.,'News')]"));
js.executeScript("arguments[0].scrollIntoView()", ele);

	}

}
