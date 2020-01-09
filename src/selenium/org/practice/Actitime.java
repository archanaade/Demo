package selenium.org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	//upcasting
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		
		System.out.println("Loading URL");
		driver.get("http://.demo.actitime.com/login.do");
	    String home=driver.getTitle();//get title
	    Thread.sleep(2000);
		WebElement uname=driver.findElement(By.name("username"));//loading the locator and give the id of email
		uname.sendKeys("admin");//passing the value for email text field
		Thread.sleep(2000);
		WebElement upass=driver.findElement(By.name("pwd"));
		upass.sendKeys("manager",Keys.ENTER);
		Thread.sleep(2000);
		String login=driver.getTitle();
		System.out.println(home+"  "+login);
		Thread.sleep(2000);
		WebElement tasks=driver.findElement(By.id("container_tasks"));//generats tasks page
		tasks.click();
		Thread.sleep(2000);
		WebElement report=driver.findElement(By.id("container_reports"));//generates report
		report.click();
		Thread.sleep(2000);
		WebElement users=driver.findElement(By.id("container_users"));//generates users
		
		users.click();
		if(!home.equals(login))
			{
			System.out.println("login successfully");
			driver.findElement(By.id("logoutLink")).click();
		}
		String logout=driver.getTitle();
		if(home.equals(logout))
		
			System.out.println("logout");
			
		}
		
}
