
package test;
abstract class Base { 
    static void fun() {
    	System.out.println("Derived static fun() called"); 
    	} 
} 
   
class Derived extends Base {} 
   
class Training { 
    public static void main(String args[]) {  
       Base b = new Derived(); 
       Base.fun(); 
    } 
}  
