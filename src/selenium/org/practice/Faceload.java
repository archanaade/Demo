
package selenium.org.practice;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Faceload {
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
	System.out.println("Launching Browser");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	Thread.sleep(2000);
   WebElement date=driver.findElement(By.xpath("//parent::span/select[@aria-label=\"Day\"]"));
  Select s=new Select(date);
  s.selectByValue("17");
	Thread.sleep(2000);
  WebElement month=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
  Select s1=new Select(month);
  s1.selectByIndex(3);
	Thread.sleep(2000);
  WebElement year =driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
  Select s2=new Select(year);
  s2.selectByValue("1990");
}
  
}