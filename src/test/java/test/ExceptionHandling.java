package test;

import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.Test;


	
	
	//@Test
	
	class Parent1{  
		  void msg()throws SQLException {
			  System.out.println("parent");
			  }  
		  }
		  
		  
		class TestExceptionChild2 extends Parent1{  
		  void msg()  {
			  
			  System.out.println("child");
			  }}  
		  public class ExceptionHandling {
		  public static void main(String args[]){  
		   Parent1 p=new TestExceptionChild2();  
		   try{  
		   p.msg();  
		   }catch(Exception e){}  
		  }  
		}  

