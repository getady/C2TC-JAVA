
package assignment2;

public class swaptwovar {
 
	 public static void main(String[] args) {
	     
	   int a, b;
	   a = 15;
	   b = 27;
	   System.out.println("Before swapping : a, b = "+a+", "+ + b);
	  
	   // The simplest method to swap two variables
	   /*temp = a;
	   a = b;
	   b = temp; */ 
	   
	   
	// Without using third variable
	   a = a + b;
	   b = a - b;
	   a = a - b;
	   
	  System.out.println("After swapping  : a, b = "+a+", "+ + b);  
	 
	 }
}



