package Pages;

import org.openqa.selenium.Alert;
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


	@FindBy(xpath="//*[@id='searchboxinput']") public WebElement searchBox;

	@FindBy(xpath="//*[@id='searchbox-searchbutton']") public WebElement search;

	@FindBy(xpath="//*[@id=\"pane\"]/div/div[1]/div/div/div[5]/div[1]/div/button/img") public
	WebElement direction;

	@FindBy(xpath="//*[@id='sb_ifc51']/input") public WebElement to;

	@FindBy(xpath=
			"//*[@id='omnibox-directions']/div/div[2]/div/div/div[1]/div[2]/button/img")
	public WebElement carIcon;

	@FindBy(xpath="//div[@class='section-layout']/div") 
	public WebElement routeList;

	@FindBy(xpath="//*[@id='contcont']/div/div[1]/div/a")
	public WebElement prodCategory;
	

	@FindBy(xpath="//*[@id='itemc'][2]")
	public WebElement laptop;
	

	@FindBy(xpath="//*[@id='tbodyid']/div[1]/div/div/h4/a")
	public WebElement laptopi5;
	
	@FindBy(xpath="//*[@id='tbodyid']/div[2]/div/div/h4/a")
	public WebElement laptopi7;
	
	@FindBy(xpath="//a[text()='Add to cart']")
	public WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id='cartur']")
	public WebElement cart;
	

	@FindBy(xpath="(//a[text()='Delete'])[2]")
	public WebElement delete;
	
	@FindBy(xpath="//button[text()='Place Order']")
	public WebElement placeOrder;
	
	@FindBy(xpath="//*[@id='name']")
	public WebElement name;
	@FindBy(xpath="//*[@id='country']")
	public WebElement country;
	@FindBy(xpath="//*[@id='city']")
	public WebElement city;
	@FindBy(xpath="	//*[@id='card']")
	public WebElement card;
	@FindBy(xpath="	//*[@id='month']")
	public WebElement month;
	@FindBy(xpath="//*[@id='year']")
	public WebElement year;
	@FindBy(xpath="	//button[text()='Purchase']")
	public WebElement purchase;
	
	@FindBy(xpath="//h2[text()='Thank you for your purchase!']")
	public WebElement msg;	
	
	@FindBy(xpath="//button[text()='OK']")
	public WebElement okBtn;	
	
	

	

	
	
	


	

	
	

	
	
	










	public HomePage() {

		PageFactory.initElements(driver, this);

	}

	public String verifyHomePageTitle() {

		return driver.getTitle();
	}

	/*
	 * public void verifyUser() throws InterruptedException {
	 * waitForElem(searchBox);
	 * 
	 * //Thread.sleep(5000); enterText(searchBox,"San Francisco, California, USA");
	 * Thread.sleep(5000); click(search); Thread.sleep(5000); String
	 * url=driver.getCurrentUrl(); System.out.println(url); String
	 * arr[]=url.split("@"); //System.out.println(arr[1]); String
	 * cordinate[]=arr[1].split(",12z"); System.out.println(cordinate[0]);
	 * Assert.assertEquals(cordinate[0],"37.7576793,-122.5076402");
	 * 
	 * if(userTxt.equalsIgnoreCase(expText)) {
	 * System.out.println("User is logged in successfully"); }else {
	 * System.out.println("User is not logged in successfully");
	 * 
	 * }
	 * 
	 * }
	 */

	/*
	 * public void searchLocation() throws InterruptedException {
	 * waitForElem(direction); click(direction); enterText(to, "Chico, California");
	 * to.sendKeys(Keys.ENTER); waitForElem(carIcon); click(carIcon);
	 * 
	 * 
	 * }
	 */

	/*
	 * public void verifyRouteListAndPrint() throws InterruptedException,
	 * IOException { //waitForElem(routeList); List<WebElement>
	 * elems=getElemList("//div[@class='section-layout']/div"); createFile();
	 * for(int i=0;i<elems.size();i++) { String s=elems.get(i).getText();
	 * System.out.println(s); //WriteToFile(s); //FileWriter myWriter = new
	 * FileWriter("route.txt"); // myWriter.write(s); // myWriter.close();
	 * 
	 * appendStrToFile("route.txt", s); }
	 * 
	 * 
	 * }
	 */

	public void verifyProductCategory() throws InterruptedException {
       ArrayList<String> list=new ArrayList<String>();
       String expCat[]= {"CATEGORIES","Phone","Laptop","Monitors"};
		List<WebElement> elems=getElemList("//*[@id='contcont']/div/div[1]/div/a");
		for(WebElement ele:elems) {
			
			String cat=ele.getText();
			System.out.println(cat);
			list.add(cat);
		}
		System.out.println(list);
       // Assert.assertEquals(expCat, list);

	}
	public void addRemovePlaceOrder() throws InterruptedException {
		try {

			click(laptop);
			click(laptopi5);
			waitForElem(addToCartBtn);
			click(addToCartBtn);
			driver.switchTo().alert().accept();
			driver.navigate().back();
			driver.navigate().back();
			click(laptop);
			click(laptopi7);
			click(addToCartBtn);
			driver.switchTo().alert().accept();
			waitForElem(cart);
			click(cart);
			waitForElem(delete);
			click(delete);
			waitForElem(placeOrder);
			click(placeOrder);
		}
          catch(Exception e) {
        	  
          }
		}



	public void fillupFormAndPurchase() throws InterruptedException {
		try {

			enterText(name, "sachin");
			enterText(country, "India");
			enterText(city, "Kolkata");
			enterText(card, "1234567891011123");
			enterText(month, "02");
			enterText(year, "2020");
			click(purchase);
			String message=getText(msg);
			Assert.assertEquals(message, "Thank you for your purchase!");
			click(okBtn);
		}
          catch(Exception e) {
        	  
          }
		}


}
