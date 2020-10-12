package Tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class NaukriLogin {
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		 String path=System.getProperty("user.dir");
		 WebDriver driver;
		
		  System.setProperty("webdriver.chrome.driver", path+"/driver/chromedriver.exe");
	        
	        //Instantiating driver object
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.naukri.com/nlogin/login?");
		 
		  Actions builder = new Actions(driver);
		  
		  WebElement link_Home = driver.findElement(By.xpath("(//div[@class='mTxt'])[8]"));
		  
		  Action mouseOverHome = builder
                  .moveToElement(link_Home)
                  .build();
		  mouseOverHome.perform();
				  
        //  builder.clickAndHold(link_Home).moveToElement(link_Home).release(link_Home).build().perform();		  
		  driver.findElement(By.xpath("//a[@title='Edit Profile']")).click();
		  
		 
	        
		
		
		
		
		
	}

}
