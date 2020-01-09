package selenium.org.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenPopUp {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("----disable-notifications---");
		WebDriver driver = new ChromeDriver(co);
		System.out.println("Launching Browser"); // upcasting
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("loading url");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");
        Thread.sleep(2000);
        WebElement psw=driver.findElement(By.name("pwd"));
        psw.sendKeys("manager",Keys.ENTER);
        Thread.sleep(2000);
       WebElement icon=driver.findElement(By.xpath("//div[@class=\"popup_menu_button popup_menu_button_support\"]/div[@class=\"popup_menu_icon\"]"));
       icon.click();
       driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
       WebElement txt=driver.findElement(By.xpath("//span[contains(.,'© 2020 actiTIME Inc. All rights reserved.')]"));
       System.out.println(txt.getText());
       Thread.sleep(2000);
	}

        
        
		

	}


