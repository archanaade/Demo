package selenium.org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Load {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		System.out.println("Launching Browser"); // upcasting
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);// creating Thread
		driver.manage().window().maximize();
		System.out.println("Loading URL");
		driver.get("file:///C:/Users/Shree/Desktop/sample.html");
		Thread.sleep(2000);
        WebElement opt=driver.findElement(By.xpath("//select[@id=\"b\"]"));
        Select s=new Select(opt);
        List<WebElement>value=s.getOptions();
        if(s.isMultiple())  //to check multiple values are there or not
        for(WebElement data:value)
          {
	        System.out.println(data.getText());
	        s.selectByValue(data.getText());
              }
        Thread.sleep(2000);
        System.out.println("--------------"+s.getFirstSelectedOption().getText()); // to get 1st selected values on console
        List<WebElement>selectopt=s.getAllSelectedOptions();
        for(WebElement val:selectopt)
        {
        	System.out.println(val.getText());
         //  s.deselectByValue(val.getText());
           
        }
	
	s.deselectAll();
	}
	

}
