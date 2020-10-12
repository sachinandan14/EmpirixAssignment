package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HidingConcepts {


	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();


		driver.switchTo().activeElement();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println("Frame");

	}

}




