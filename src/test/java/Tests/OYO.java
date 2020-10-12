


	
	package Tests;

	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;

	public class OYO {
		
		
		public static void main(String[] args) {
			
			 String path=System.getProperty("user.dir");
			 WebDriver driver;
			
			  System.setProperty("webdriver.chrome.driver", path+"/driver/chromedriver.exe");
			  ////div[@class='oyo-cell--12-col oyo-cell--8-col-tablet oyo-cell--4-col-phone']/div/div/following-sibling::div/div/div/div/div/a/h3
			 
		        
		        //Instantiating driver object
			  driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://www.oyorooms.com/search/?location=Coimbatore%2C%20Tamil%20Nadu%2C%20India&city=Coimbatore&searchType=city&checkin=24%2F06%2F2020&checkout=25%2F06%2F2020&roomConfig[0]=1&guests=1&rooms=1&filters[city_id]=82&fbclid=IwAR3e3Wf8-gD22TKuKg4HaYisAS_glgkWDnOcNXc8QSU1_K4bgWzECeov-eU");
			  
			  List<WebElement> elems=driver.findElements(By.xpath("//div[@class='oyo-cell--12-col oyo-cell--8-col-tablet oyo-cell--4-col-phone']/div/div/following-sibling::div/div/div/div/div/a/h3"));
			  
			  for(WebElement ele:elems) {
				  
				 String hotelName= ele.getText();
				  System.out.println(hotelName);
			  }
			  
			  
			  
			  
			  
			  
			
		        
			
			
			
			
			
		}

	}


