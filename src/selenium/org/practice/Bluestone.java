package selenium.org.practice;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	//upcasting
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("http://www.bluestone.com");
		Thread.sleep(5000);
        WebElement jwel=driver.findElement(By.xpath("//a[@href=\"https://www.bluestone.com/jewellery.html\"]"));
        Actions a=new Actions(driver);
        Thread.sleep(1000);
	    a.moveToElement(jwel).build().perform();
        System.out.print(jwel.getText());
        Thread.sleep(1000);
        WebElement subjwel=driver.findElement(By.xpath("//a[contains(.,'Kadas')]"));
        subjwel.click();
        driver.findElement(By.xpath("//span[@data-details=\"The Ranveer Kada for Him__8967__Bangles\"]/parent::li")).click();
        
        Thread.sleep(1000);
        Set<String>wins=driver.getWindowHandles();
        for(String win:wins)
		{
		System.out.println(win);
			driver.switchTo().window(win);
			
		}
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"buy-now\"]")).click();
        Thread.sleep(1000);
        WebElement msg=driver.findElement(By.xpath("//div[@class=\"formErrorContent\"]/parent::div[@class=\"ringselectformError parentFormbuy_block formError\"]"));
        //String msg1=driver.getWindowHandle();
        //driver.switchTo().window(msg1);
        //driver.switchTo().frame();
        
        
        System.out.println(msg.getText());
	}
}