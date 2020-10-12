package Tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import Base.TestBase;


public class ParentTest{

     
	static public  void main(String[] args) 
    { 
        System.out.println("Inside Main"); 
        
        DesiredCapabilities capCH=DesiredCapabilities.chrome();
        capCH.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        
        

        DesiredCapabilities capIE=DesiredCapabilities.internetExplorer();
        capIE.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        

        FirefoxProfile profile=new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);

            WebDriver driver=new ChromeDriver();
            
            driver.manage().getCookies();
            
            
           Alert al= driver.switchTo().alert();
           al.accept();
           
           
           Actions act=new Actions(driver);
           WebElement ele=driver.findElement(By.xpath(""));
           act.moveToElement(ele).perform();
           act.doubleClick(ele).perform();
           
           Action ac=act.build();
           ac.perform();
           
            
    } 
}
