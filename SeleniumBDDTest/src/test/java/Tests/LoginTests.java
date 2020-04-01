package Tests;

import static Base.BasePage.waitForElem;

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




public class LoginTests extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	public static Logger Log = Logger.getLogger(LoginTests.class.getName());
	public LoginTests() {

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
		loginPage=new LoginPage();
		homePage=new HomePage();
		loginPage.login(prop.getProperty("UserName"), prop.getProperty("Passowrd"));
	}



	@Test
	//@Parameters("browser")
	public void loginTest( ) throws InterruptedException {
		
		//initialize(browserName); 
		//loginPage.login(prop.getProperty("UserName"), prop.getProperty("Passowrd"));
		/*
		 * Properties pro=readProp.readProperties(); String
		 * browser=pro.getProperty("Browser"); String url=pro.getProperty("Url");
		 * System.out.println(url);
		 * 
		 * // WebDriver driver=initialize(browser); driver.get(url);
		 */
		Log.info("*********************Logged into home page****************************");
		
	 
		//log.error("failed");
		String actTitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(actTitle, "VoiceWatch","Title not matched");
		homePage.verifyUser("QA_traininguser25(Empirix_QA_Training)");

	}
	
	
	@Test
	//@Parameters("browser")
	public void switchProfileLanguageTest() throws InterruptedException {
		
		//initialize(browserName); 
		//loginPage.login(prop.getProperty("UserName"), prop.getProperty("Passowrd"));
		
		Map<String,Boolean> langDetails= homePage.switchLanguage();
		boolean isEngAccess=langDetails.get("isEnglish");
		boolean isJapAccess=langDetails.get("isJapanese");
		Assert.assertEquals(isEngAccess, true,"Not able to access in English");
		Log.info("English is accessible");
		Assert.assertEquals(isJapAccess, true,"Not able to access in japanese");
		Log.info("japanese is accessible");
		
		

	}
	
	@Test
	//@Parameters("browser")
	public void verifyClientDetailsTest( ) throws InterruptedException {
		
		//initialize(browserName); 
		//loginPage.login(prop.getProperty("UserName"), prop.getProperty("Passowrd"));
		
		ArrayList<String> actClientInfo= homePage.verifyClientTab();
		System.out.println(actClientInfo);
		ArrayList<String> expClientInfo = new ArrayList<String>(Arrays.asList("Client Name","Empirix_QA_Training","Description","This client is for QA Test purposes","Subscription Start Date","Jan 14, 2020","Subscription End Date","Aug 11, 2022","Maximum Load Tests","0","Maximum VoiceWatch Tests","0","Maximum Scenarios","0","Minimum Test Schedule Period (mins)","15"));

		//String[] expClientInfo= {"Client Name","Empirix_QA_Training","Description","This client is for QA Test purposes","Subscription Start Date","Jan 14, 2020","Subscription End Date","Aug 11, 2022","Maximum Load Tests","0","Maximum VoiceWatch Tests","0","Maximum Scenarios","0","Minimum Test Schedule Period (mins)","15"};
		boolean isClientDetailsPresent=actClientInfo.equals(expClientInfo);
		//Assert.assertEquals(expClientInfo, actClientInfo);
		Assert.assertTrue(isClientDetailsPresent, "Client details are not displyed properly");
		Log.info("Client details are displyed properly");

		
	}
	
	@Test
	//@Parameters("browser")
	public void verifyAllTabsTest() throws InterruptedException {
		
		//initialize(browserName); 
		//loginPage.login(prop.getProperty("UserName"), prop.getProperty("Passowrd"));
		
		waitForElem(10000);
		ArrayList<String> actAllTabsEngSelected= homePage.verifyAllTabsIfEngSelected();
		System.out.println(actAllTabsEngSelected);
		ArrayList<String> expAllTabsEngSelected = new ArrayList<String>(Arrays.asList("Overall Performance","Show All Errors","Tests","Variables","Notifications"));

		//String[] expClientInfo= {"Client Name","Empirix_QA_Training","Description","This client is for QA Test purposes","Subscription Start Date","Jan 14, 2020","Subscription End Date","Aug 11, 2022","Maximum Load Tests","0","Maximum VoiceWatch Tests","0","Maximum Scenarios","0","Minimum Test Schedule Period (mins)","15"};
		boolean isAllTabsPresent=actAllTabsEngSelected.equals(expAllTabsEngSelected);
		//Assert.assertEquals(expClientInfo, actClientInfo);
		Assert.assertTrue(isAllTabsPresent, "All tabs are not displyed properly if English selected");
		Log.info("All tabs are accessible properly if English is selected");
		Map<String, Boolean> actAllTabsJapaneseSelected= homePage.verifyAllTabsIfJapaneseSelected();
		
		boolean isOverallPerfJapTxtPresent=actAllTabsJapaneseSelected.get("isOverallPerfJapTxtPresent");
		boolean iSshowAllErrorsJapTxtPresent=actAllTabsJapaneseSelected.get("iSshowAllErrorsJapTxtPresent");
		boolean isTestsJapTxtPresent=actAllTabsJapaneseSelected.get("isTestsJapTxtPresent");
		boolean isVariablesJapTxtPresent=actAllTabsJapaneseSelected.get("isVariablesJapTxtPresent");
		boolean isNotificationsJapTxtPresent=actAllTabsJapaneseSelected.get("isNotificationsJapTxtPresent");
		
		Assert.assertTrue(isOverallPerfJapTxtPresent &&iSshowAllErrorsJapTxtPresent&& isTestsJapTxtPresent&&isVariablesJapTxtPresent&&isNotificationsJapTxtPresent, "Some fields are missing in the selected fields");
		Log.info("All tabs are accessible properly if Japanese is selected");
		
	}
	
	

	@AfterMethod 
	public void tearDown() {

		//driver.close();
		driver.quit();
	}
	 

}
