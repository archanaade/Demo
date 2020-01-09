package selenium.org.practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.classfile.Opcode.Set;

public class Iqgenie {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
			System.out.println("Launching Browser");	
			WebDriver driver=new ChromeDriver();
			//Thread.sleep(2000);//creating Thread 
			driver.manage().window().maximize();
			System.out.println("Loading URL");
			driver.get("http://iqgenie.org/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//i[@class=\"person fas fa-user-circle\"]")).click();
		
           WebElement signup= driver.findElement(By.xpath("//a[@class=\"hollow button alert\"]"));	
		    signup.click();
		  Set <String>w=driver.getWindowHandles();
		for (String s:w)
		{
			
		
			driver.switchTo().window(s);
		}
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		System.out.println("title:"+title);
		
		
		
		 
}
}