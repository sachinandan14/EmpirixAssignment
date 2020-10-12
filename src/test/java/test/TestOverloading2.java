package test;

class Adder{  
static int add(int a, int b){return a+b;}  
static  double add(double a, double b){
 //System.out.println("hi");
	return a+b;
	//return false;
	
}  
}  
public class TestOverloading2{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11)); 
System.out.println(Adder.add(12.3,15.2));

System.out.println(Adder.add(12.3,12.6)); 
 
}}  
