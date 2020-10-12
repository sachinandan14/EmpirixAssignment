package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import Util.TestUtil;

public class TestBase {
	
	
	public static WebDriver driver;
	public static java.util.Properties prop;
	
	public TestBase() {
		String path = System.getProperty("user.dir");
		File file=new File(path+"//config.properties");

		FileInputStream input;
		 prop=new java.util.Properties();
		try {
			input = new FileInputStream(file);
			
			try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//return prop;
		//String user=prop.getProperty("UserName");


	}
	
	
	public static WebDriver getDriver()
	{
		if (driver == null){
			return driver;
			}else{
			return driver;
			}
	}
	
	public static void initialize() {
		String browser=prop.getProperty("Browser");

	       String path=System.getProperty("user.dir");
		//switch(browser.toLowerCase()) {
		if(browser.equalsIgnoreCase("chrome")) {
		//case "chrome":
			

		        System.setProperty("webdriver.chrome.driver", path+"/driver/chromedriver.exe");
		        
		        //Instantiating driver object
		        driver = new ChromeDriver();
		        
		      //  break;
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			
		
		
//	case "firefox":
		

	       
	       System.setProperty("webdriver.gecko.driver", path+"/driver/geckodriver.exe");
	       DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	       capabilities.setCapability("marionette",true);
	     //  driver= new FirefoxDriver(capabilities);
			driver = new FirefoxDriver();
	        
	        //Instantiating driver object
		//	break;
			
		}else
		{
			
	//case "edge":	
			
		
		
		// OperaOptions options = new OperaOptions();
	      //  options.setBinary("C:\\Program Files\\Opera\\56.0.3051.43\\opera.exe");
				//set path to Edge.exe
				System.setProperty("webdriver.edge.driver",path+"/driver/MicrosoftWebDriver.exe");
				//create Edge instance
				driver = new EdgeDriver();
			
		}
		
			
			
	
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("Url"));
		
	
		
	}
	
	
	public static void initialize(String browser) {
	//	String browser=prop.getProperty("Browser");

	       String path=System.getProperty("user.dir");
		//switch(browser.toLowerCase()) {
		if(browser.equalsIgnoreCase("chrome")) {
		//case "chrome":
			

		        System.setProperty("webdriver.chrome.driver", path+"/driver/chromedriver.exe");
		        
		        //Instantiating driver object
		        driver = new ChromeDriver();
		        
		      //  break;
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			
		
		
//	case "firefox":
		

	       
	       System.setProperty("webdriver.gecko.driver", path+"/driver/geckodriver.exe");
	       DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	       capabilities.setCapability("marionette",true);
	     //  driver= new FirefoxDriver(capabilities);
			driver = new FirefoxDriver();
	        
	        //Instantiating driver object
		//	break;
			
		}else
		{
			
	//case "edge":	
			
		
		
		// OperaOptions options = new OperaOptions();
	      //  options.setBinary("C:\\Program Files\\Opera\\56.0.3051.43\\opera.exe");
				//set path to Edge.exe
				System.setProperty("webdriver.edge.driver",path+"/driver/MicrosoftWebDriver.exe");
				//create Edge instance
				driver = new EdgeDriver();
			
		}
		
			
			
	
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("Url"));
		
	
		
	}

}


