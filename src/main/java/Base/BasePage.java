package Base;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

//import Tests.Login;

import static Base.TestBase.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {

	//public static WebDriver driver;

	/*
	 * public BasePage(WebDriver driver) {
	 * 
	 * this.driver=driver; }
	 */
	//TestBase base=new TestBase();
	public static Logger Log = Logger.getLogger(BasePage.class.getName());
	//static WebDriver driver=TestBase.getDriver();

	public static void enterText(WebElement elem,String text) {

		WebDriverWait wait=new WebDriverWait(TestBase.getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOf(elem)).click();
		wait.until(ExpectedConditions.visibilityOf(elem)).clear();
		wait.until(ExpectedConditions.visibilityOf(elem)).sendKeys(text);


	}

	public static void click(WebElement elem) {

		WebDriverWait wait=new WebDriverWait(TestBase.getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(elem)).click();
        Log.info("Clicked on "+elem);

	}

	public static void acceptAlert() {
		TestBase.getDriver().switchTo().alert().accept();


	}
	
	public static boolean isElementPresent(WebElement elem) {
		  try {
		  if( elem.isEnabled()) {
		    return true;
		  }}
		catch (org.openqa.selenium.NoSuchElementException e) {
		    return false;
		  }
		return false;
		}
	
	public static void createFile() {
		  
		    try {
		      File myObj = new File("route.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	
	public static void WriteToFile(String str) {
		    try {
		      FileWriter myWriter = new FileWriter("route.txt");
		      myWriter.write(str);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	
	
	public static void appendStrToFile(String fileName, 
			String str) 
	{ 
		try { 

			// Open given file in append mode. 
			BufferedWriter out = new BufferedWriter( 
					new FileWriter(fileName, true)); 
			out.write(str); 
			out.close(); 
		} 
		catch (IOException e) { 
			System.out.println("exception occoured" + e); 
		} 
	} 
		
	public static void refreshPage() {

		TestBase.getDriver().navigate().refresh();


	}

	public  static void waitForElem(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}


	public static void waitForElem(WebElement elem) {

		WebDriverWait wait=new WebDriverWait(TestBase.getDriver(), 60);
		wait.until(ExpectedConditions.visibilityOf(elem));



	}
	
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
            .withTimeout(10, TimeUnit.SECONDS)
            //.pollingEvery(500, TimeUnit.MILLISECONDS)
            .ignoring(NoSuchElementException.class);
	

	public static String getText(WebElement elem) {

		WebDriverWait wait=new WebDriverWait(TestBase.getDriver(), 20);
		return wait.until(ExpectedConditions.visibilityOf(elem)).getText();



	}
	
	public static List<WebElement> getElemList(String xpath) {

	List<WebElement> elems=	TestBase.getDriver().findElements(By.xpath(xpath));
	
	return elems;



	}
	
	


}
