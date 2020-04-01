package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.testng.Assert;

import static Base.BasePage.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Base.TestBase;

public class HomePage extends TestBase {
	

	@FindBy(xpath= "//a[starts-with(text(), 'QA_traininguser25')]")
	public WebElement userText;
	
	@FindBy(xpath= "//a[@href='/dashboard' and text()='Dashboard']")
	public WebElement dashboardLink;
	@FindBy(xpath= "//a[@href='/alerts' and text()='Alerts']")
	public WebElement alertsLink;
	@FindBy(xpath= "//a[@href='/tests' and text()='Tests']")
	public WebElement testsLink;
	@FindBy(xpath= "//a[@href='/variables' and text()='Variables']")
	public WebElement variablesLink;
	@FindBy(xpath= "//a[@href='/notifi' and text()='Notifications']")
	public WebElement notificationsLink;
	
	@FindBy(xpath= "//a[@href='/dashboard' and text()='ダッシュボード']")
	public WebElement dashboardJapaneseLink;
	@FindBy(xpath= "//a[@href='/alerts' and text()='アラート']")
	public WebElement alertsJapaneseLink;
	@FindBy(xpath= "//a[@href='/tests' and text()='テスト']")
	public WebElement testsJapaneseLink;
	@FindBy(xpath= "//a[@href='/variables' and text()='変数']")
	public WebElement variablesJapaneseLink;
	@FindBy(xpath= "//a[@href='/notifi' and text()='通知']")
	public WebElement notificationsJapaneseLink;
	
	
	@FindBy(xpath= "//a[text()='Japanese']")
	public WebElement japaneseLink;
	
	@FindBy(xpath= "//a[text()='English']")
	public WebElement EnglishLink;
	
	@FindBy(xpath= "//a[@href='/client']")
	public WebElement clientTab;
	
	@FindBy(xpath= "//div[@class='panel-heading']/h3")
	public WebElement clientDetailsTxt;

	@FindBy(xpath= "//div[@class='row']/label")
	public WebElement clientDetailsElemList;
	

	@FindBy(xpath= "//h1[text()='Overall Performance']")
	public WebElement overallPerfTxt;
	
	@FindBy(xpath= "//span[text()=' Show All Errors']")
	public WebElement showAllErrorsTxt;
	
	@FindBy(xpath= "//span[text()='Tests']")
	public WebElement testsTxt;
	
	@FindBy(xpath= "//span[text()='Variables']")
	public WebElement variablesTxt;
	
	@FindBy(xpath= "//span[text()='Notifications']")
	public WebElement notificationsTxt;
	
	//Japanese
	
	@FindBy(xpath= "//h1[text()='総合成績']")
	public WebElement overallPerfJapTxt;
	
	@FindBy(xpath= "//span[text()='すべてのエラーを表示']")
	public WebElement showAllErrorsJapTxt;
	
	@FindBy(xpath= "//span[text()='テスト']")
	public WebElement testsJapTxt;
	
	@FindBy(xpath= "//span[text()='変数']")
	public WebElement variablesJapTxt;
	
	@FindBy(xpath= "//span[text()='通知']")
	public WebElement notificationsJapTxt;
	
	//@FindBy(xpath= "//span[text()='Tests']")
	//public WebElement testsTxt;
	
	


	

	
	
	

	public HomePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyHomePageTitle() {
		
		return driver.getTitle();
	}
	
public void verifyUser(String expText) {
		waitForElem(userText);
		String userTxt=getText(userText);
		Assert.assertEquals(userTxt, expText,"User is not logged on with correct user");
		if(userTxt.equalsIgnoreCase(expText)) {
			System.out.println("User is logged in successfully");
		}else {
			System.out.println("User is not logged in successfully");
			
		}
		
	}

public ArrayList<String> verifyClientTab() {
	waitForElem(1000);
	waitForElem(userText);
	click(userText);
	waitForElem(clientTab);
	click(clientTab);
	waitForElem(clientDetailsTxt);
	String clientDetails=getText(clientDetailsTxt);
	Assert.assertEquals(clientDetails, "Client Details", "Client Details page is not displayed");
	if(clientDetails.equalsIgnoreCase("Client Details")) {
		System.out.println("Client Details page is displayed");
	}else {
		System.out.println("Client Details page is not displayed");
		
	}
	
	List<WebElement> list=getElemList("//div[@class='row']/label");
	int size=list.size();
	ArrayList<String> arr=new ArrayList<String>();
	if(size==16) {
		for(int i=0;i<size;i++) {
			String txt=list.get(i).getText();
			arr.add(txt);
		}
		
	}
	return arr;
}



public ArrayList<String> verifyAllTabsIfEngSelected() {


	ArrayList<String> listIfEngSelected=new ArrayList<String>();
	try {
		waitForElem(10000);
		waitForElem(dashboardLink);
		Boolean isDashboardDisplayed=dashboardLink.isDisplayed();
		Boolean isAlertsDisplayed=alertsLink.isDisplayed();
		Boolean isTestsDisplayed=testsLink.isDisplayed();
		Boolean isVariablesDisplayed=variablesLink.isDisplayed();
		Boolean isNotificationsDisplayed=notificationsLink.isDisplayed();
		Assert.assertTrue(isDashboardDisplayed &&isAlertsDisplayed&&isTestsDisplayed&&isVariablesDisplayed&&isNotificationsDisplayed);


		waitForElem(5000);
		click(dashboardLink);
		waitForElem(5000);
		click(dashboardLink);
		waitForElem(5000);
		String dashboardHeadertxt=getText(overallPerfTxt);
		click(alertsLink);
		waitForElem(5000);
		String alertsHeadertxt=getText(showAllErrorsTxt);
		click(testsLink);
		waitForElem(5000);
		String testsHeadertxt=getText(testsTxt);
		click(variablesLink);
		waitForElem(5000);
		String variablesHeadertxt=getText(variablesTxt);
		click(notificationsLink);
		waitForElem(5000);
		String notificationsHeadertxt=getText(notificationsTxt);

		listIfEngSelected.add(dashboardHeadertxt);
		listIfEngSelected.add(alertsHeadertxt);
		listIfEngSelected.add(testsHeadertxt);
		listIfEngSelected.add(variablesHeadertxt);
		listIfEngSelected.add(notificationsHeadertxt);





	}
	catch(Exception e) {
		e.printStackTrace();

	}
	return listIfEngSelected;
}



public HashMap<String,Boolean> verifyAllTabsIfJapaneseSelected() {


	HashMap<String,Boolean> listIfJapaneseSelected=new HashMap<String,Boolean>();
	try {
		waitForElem(3000);
		waitForElem(userText);
		click(userText);
		waitForElem(3000);
		waitForElem(japaneseLink);
		click(japaneseLink);
		waitForElem(3000);
		acceptAlert();
		waitForElem(15000);
		waitForElem(dashboardJapaneseLink);
		Boolean isDashboardDisplayed=dashboardJapaneseLink.isDisplayed();
		Boolean isAlertsDisplayed=alertsJapaneseLink.isDisplayed();
		Boolean isTestsDisplayed=testsJapaneseLink.isDisplayed();
		Boolean isVariablesDisplayed=variablesJapaneseLink.isDisplayed();
		Boolean isNotificationsDisplayed=notificationsJapaneseLink.isDisplayed();
		Assert.assertTrue(isDashboardDisplayed &&isAlertsDisplayed&&isTestsDisplayed&&isVariablesDisplayed&&isNotificationsDisplayed);



		click(dashboardJapaneseLink);
		//String dashboardHeadertxt=getText(overallPerfJapTxt);
		waitForElem(5000);
		boolean isOverallPerfJapTxtPresent=overallPerfJapTxt.isDisplayed();
		
		click(alertsJapaneseLink);
		waitForElem(5000);
		//String alertsHeadertxt=getText(showAllErrorsJapTxt);
		boolean iSshowAllErrorsJapTxtPresent=showAllErrorsJapTxt.isDisplayed();
		
		click(testsJapaneseLink);
		waitForElem(5000);
		//String testsHeadertxt=getText(testsJapTxt);
		boolean isTestsJapTxtPresent=testsJapTxt.isDisplayed();
		
		click(variablesJapaneseLink);
		waitForElem(5000);
		//String variablesHeadertxt=getText(variablesJapTxt);
		boolean isVariablesJapTxtPresent=variablesJapTxt.isDisplayed();
		
		click(notificationsJapaneseLink);
		waitForElem(5000);
		//String notificationsHeadertxt=getText(notificationsJapTxt);
		boolean isNotificationsJapTxtPresent=notificationsJapTxt.isDisplayed();

		listIfJapaneseSelected.put("isOverallPerfJapTxtPresent", isOverallPerfJapTxtPresent);
		listIfJapaneseSelected.put("iSshowAllErrorsJapTxtPresent", iSshowAllErrorsJapTxtPresent);
		listIfJapaneseSelected.put("isTestsJapTxtPresent", isTestsJapTxtPresent);
		listIfJapaneseSelected.put("isVariablesJapTxtPresent", isVariablesJapTxtPresent);
		listIfJapaneseSelected.put("isNotificationsJapTxtPresent", isNotificationsJapTxtPresent);

        //Reset to English
		click(userText);
		waitForElem(5000);
		click(EnglishLink);
		waitForElem(4000);
		acceptAlert();
		waitForElem(15000);



	}
	catch(Exception e) {
		e.printStackTrace();

	}
	return listIfJapaneseSelected;
}






	

public HashMap< String, Boolean> switchLanguage() {
	//waitForElem(userText);
	waitForElem(10000);
	click(userText);
	
	HashMap< String, Boolean> hm=new HashMap< String, Boolean>();
	boolean isJapanese=false;
	boolean isEnglish=false;
	waitForElem(japaneseLink);
	click(japaneseLink);
	acceptAlert();
	waitForElem(dashboardJapaneseLink);
	if(isElementPresent(dashboardJapaneseLink)) {
		isJapanese=true;
		//return isJapanese;
	}else {
	//	return isJapanese;
		
	}
	click(userText);
	waitForElem(EnglishLink);
	click(EnglishLink);
	acceptAlert();
	waitForElem(5000);
	if(isElementPresent(dashboardLink)) {
		isEnglish=true;
		//return isEnglish;
	}else {
		//return isEnglish;
		
	}
	hm.put("isEnglish", isEnglish);
	hm.put("isJapanese", isJapanese);
	return hm;
}



}
	

