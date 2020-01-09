package selenium.org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");	
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);//creating Thread 
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("http://www.facebook.com");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xyz");//loading the locator and give the id of email
		//driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("1234");
		//driver.findElement(By.xpath("//input[@value=\'Log In\']")).click();//we should go lable 
	//driver.findElement(By.xpath("//label[@class='\login_form_login_button uiButton uiButtonConfirm\']")).click();
		
		
		//TO GET LABLE OF FEILD IN CONSOLE AS WELL AS IN TEXT FILD BY USING GETTEXT
		WebElement uname=driver.findElement(By.xpath("//label[@for=\"email\"]"));
	System.out.println(uname.getText());
	String name=uname.getText();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(name);
	WebElement pass=driver.findElement(By.xpath("//label[@for=\"pass\"]"));
	System.out.println(pass.getText());//this method is used to print lable of text field to console
	driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys(pass.getText());
	
	}
}