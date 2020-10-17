package Tests;

import static Base.BasePage.waitForElem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;




public class AdidasAssignment extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	public static Logger Log = Logger.getLogger(AdidasAssignment.class.getName());
	public AdidasAssignment() {

		super();
	}

	//@BeforeTest
	//@BeforeClass
	@BeforeMethod 
	//@Parameters("browser")
	public void setUp() throws InterruptedException
	{

		//initialize(browserName); 
		initialize(); 
		//loginPage=new LoginPage();
		homePage=new HomePage();
		//loginPage.login(prop.getProperty("UserName"), prop.getProperty("Passowrd"));
	}



	@Test
	//@Parameters("browser")
	public void loginTest( ) throws InterruptedException, IOException {
		
		//initialize(browserName); 
		Log.info("*********************Logged into home page****************************");
		homePage.verifyProductCategory();
		homePage.addRemovePlaceOrder();
		homePage.fillupFormAndPurchase();
	}
	
	
	

	@AfterMethod 
	public void tearDown() {

		//driver.close();
		driver.quit();
	}
	 

}
