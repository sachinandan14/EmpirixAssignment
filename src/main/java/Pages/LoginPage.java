package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Base.BasePage.*;

import Base.BasePage;
import Base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath= "//input[@name='callback_0']")
	public WebElement username;
	
	@FindBy(xpath= "//input[@name='callback_1']")
	public WebElement password;
	@FindBy(xpath= "//input[@name='callback_2']")
	public WebElement signInBtn;
	
	//BasePage base=new BasePage();
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}

	
	
	public void login(String user,String pwd) throws InterruptedException  {
		refreshPage();
		waitForElem(20000);
		waitForElem(username);
		
		boolean isDisplayed=username.isDisplayed();
		try {
		if (isDisplayed) {
		waitForElem(username);
		enterText(username,user);
	    enterText(password,pwd);
		click(signInBtn);
		waitForElem(40000);
	}else {
		refreshPage();
		waitForElem(username);
		enterText(username,user);
	    enterText(password,pwd);
		click(signInBtn);
		
	}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
