package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.testng.Assert;

import static Base.BasePage.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Base.TestBase;

public class HomePage extends TestBase {
	

	@FindBy(xpath="//*[@id='searchboxinput']")
	public WebElement searchBox;
	@FindBy(xpath="//*[@id='searchbox-searchbutton']")
	public WebElement search;
	
	@FindBy(xpath="//*[@id=\"pane\"]/div/div[1]/div/div/div[5]/div[1]/div/button/img")
	public WebElement direction;
	
	@FindBy(xpath="//*[@id='sb_ifc51']/input")
	public WebElement to;
	
	@FindBy(xpath="//*[@id='omnibox-directions']/div/div[2]/div/div/div[1]/div[2]/button/img")
	public WebElement carIcon;
	
	@FindBy(xpath="//div[@class='section-layout']/div")
	public WebElement routeList;
	
	
	
	
	
	
	
	
	
	
	
	
	


	

	
	
	

	public HomePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyHomePageTitle() {
		
		return driver.getTitle();
	}
	
public void verifyUser() throws InterruptedException {
	waitForElem(searchBox);
	
	//Thread.sleep(5000);
		enterText(searchBox,"San Francisco, California, USA");
		Thread.sleep(5000);
		click(search);
		Thread.sleep(5000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String arr[]=url.split("@");
		//System.out.println(arr[1]);
		String cordinate[]=arr[1].split(",12z");
		System.out.println(cordinate[0]);
		Assert.assertEquals(cordinate[0],"37.7576793,-122.5076402");
		/*
		 * if(userTxt.equalsIgnoreCase(expText)) {
		 * System.out.println("User is logged in successfully"); }else {
		 * System.out.println("User is not logged in successfully");
		 * 
		 * }
		 */
	}



public void searchLocation() throws InterruptedException {
	waitForElem(direction);
	click(direction);
	enterText(to, "Chico, California");
	to.sendKeys(Keys.ENTER);
	waitForElem(carIcon);
	click(carIcon);
	
	
	}

public void verifyRouteListAndPrint() throws InterruptedException, IOException {
	waitForElem(routeList);
	List<WebElement> elems=getElemList("//div[@class='section-layout']/div");
	createFile();
	for(int i=0;i<elems.size();i++) {
		String s=elems.get(i).getText();
		System.out.println(s);
		//WriteToFile(s);
		//FileWriter myWriter = new FileWriter("route.txt");
	     // myWriter.write(s);
	     // myWriter.close();
		
		appendStrToFile("route.txt", s);
	}
	
	
	}



}
	

