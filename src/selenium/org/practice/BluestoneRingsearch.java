package selenium.org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneRingsearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	//upcasting
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("http://www.bluestone.com");
		Thread.sleep(5000);
	     WebElement search=	driver.findElement(By.xpath("//input[@id=\"search_query_top_elastic_search\"]"));
		search.sendKeys("rings",Keys.ENTER);
		
		List<WebElement>ringcount=driver.findElements(By.xpath("//div[@class=\"grid-view browse-page-var2 g34 row grid-view-result-active\"]/descendant::ul[@class=\"product-grid search-box-result\"]/li"));
		int i=0;
		for(WebElement ring:ringcount)
		{
			i=i+1;
			//System.out.println(ring.getText());
			
		}
System.out.println("total count of ring:"+i);
	}
}