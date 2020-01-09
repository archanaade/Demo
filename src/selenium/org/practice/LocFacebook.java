package selenium.org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocFacebook 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
       WebElement login=driver.findElement(By.xpath("//label[@class=\"login_form_login_button uiButton uiButtonConfirm\"]"));
  Point loc=login.getLocation();  //point is class
  System.out.println(loc);
  int x=loc.getX();
  int y=loc.getY();
  System.out.println(x+" "+y);
}
}