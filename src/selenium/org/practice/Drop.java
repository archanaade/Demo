package selenium.org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	//upcasting
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
	WebElement drop=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
	driver.switchTo().frame(drop);
	WebElement drag=driver.findElement(By.xpath("//div[@class=\"ui-widget-content ui-draggable ui-draggable-handle\"]"));
	WebElement droppable=driver.findElement(By.xpath("//div[@class=\"ui-widget-header ui-droppable\"]"));
	Actions a= new Actions(driver);
	//a.dragAndDropBy(drag,150,0).perform();
	a.dragAndDrop(drag, droppable).perform();
System.out.println(droppable.getText());
	}

}
