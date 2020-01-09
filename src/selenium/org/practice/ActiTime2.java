package selenium.org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	//upcasting
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		
		System.out.println("Loading URL");
		driver.get("http://.demo.actitime.com/login.do");
	   // String home=driver.getTitle();//get title
	    Thread.sleep(2000);
	   WebElement uname=driver.findElement(By.xpath("//td[@id=\"headerContainer\"]"));
       System.out.println(uname.getText());
       String label=uname.getText();
       Thread.sleep(2000);
      
       //BY USING XPATH
       driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(label);
       driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(label);
       driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
       Thread.sleep(2000);
       WebElement label1=driver.findElement(By.xpath("//td[@style=\"padding-left:6px;\"]"));
       System.out.println(label1.getText());   
	}
}