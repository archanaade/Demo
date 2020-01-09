package selenium.org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAtrribut 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement email=driver.findElement(By.id("email"));
        String val=email.getAttribute("data-testid");
        System.out.println(val);
        System.out.println("title of the webpage:-"+driver.getTitle());
        WebElement titleEle=driver.findElement(By.tagName("title"));
        System.out.println("title of the page:-"+titleEle.getAttribute("textContent"));
	
	}
}