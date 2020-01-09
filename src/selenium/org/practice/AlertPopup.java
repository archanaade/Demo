package selenium.org.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("----disable-notifications---");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching Browser"); // upcasting
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v1/index.php");
		System.out.println("loading url");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
WebElement login=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
login.click();
Alert a=driver.switchTo().alert();
Thread.sleep(2000);
System.out.println(a.getText());
a.accept();
}
}