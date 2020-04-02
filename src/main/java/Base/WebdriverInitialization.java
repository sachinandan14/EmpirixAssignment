/*
 * package Base; import java.util.Properties;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.openqa.selenium.remote.DesiredCapabilities; import
 * org.testng.annotations.BeforeTest;
 * 
 * //import PeepalAssignment.readProp;
 * 
 * public class WebdriverInitialization {
 * 
 * 
 * 
 * 
 * 
 * @BeforeTest
 * 
 * public void setup() {
 * 
 * 
 * Properties pro=readProp.readProperties(); String
 * browser=pro.getProperty("Browser"); String url=pro.getProperty("Url");
 * System.out.println(url);
 * 
 * WebDriver driver=initialize(browser); }
 * 
 * public WebDriver driver;
 * 
 * //@SuppressWarnings("deprecation") public WebDriver initialize(String
 * browser) {
 * 
 * String path=System.getProperty("user.dir"); switch(browser.toLowerCase()) {
 * 
 * case "chrome":
 * 
 * 
 * System.setProperty("webdriver.chrome.driver",
 * path+"/driver/chromedriver.exe");
 * 
 * //Instantiating driver object driver = new ChromeDriver();
 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
 * break;
 * 
 * case "firefox":
 * 
 * 
 * 
 * System.setProperty("webdriver.gecko.driver", path+"/driver/geckodriver.exe");
 * DesiredCapabilities capabilities = DesiredCapabilities.firefox();
 * capabilities.setCapability("marionette",true); // driver= new
 * FirefoxDriver(capabilities); driver = new FirefoxDriver();
 * 
 * //Instantiating driver object driver.manage().window().maximize();
 * driver.manage().deleteAllCookies();
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * return driver;
 * 
 * 
 * 
 * }
 * 
 * }
 */