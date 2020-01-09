package selenium.org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	//upcasting
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(2000);
	  WebElement frame=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
	  WebElement slider=driver.findElement(By.xpath("//div[@class='ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']"));
		Actions a= new Actions(driver);
		a.dragAndDropBy(slider,50,0).perform();
	}

	}
