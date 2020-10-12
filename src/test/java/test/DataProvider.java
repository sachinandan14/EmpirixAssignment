package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProvider {
	
	
	   @BeforeClass
	   public void beforeClass() 
	   {
	      System.out.println("Before class executed");
	   }
	   
	   @org.testng.annotations.DataProvider
	   public Object[][] message()
	   {
	      return new Object [][]{{"Mayank" , new Integer (321)}, {"Dileep", new Integer (282)}};
	   }
	   @Test (dataProvider="message")
	   public void PrintMsg(String name, Integer id)
	   {
	      System.out.println("Names are: "+name+" "+id);
	   }
	}


