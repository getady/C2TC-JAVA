
package com.lambdaexpression;

import java.util.LinkedList;

public class LambdaForEach {

	public static void main(String[] args) 
	{
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("ammar");
	ll.add("adil");
	ll.add("akash");
	ll.add("vikas");
	ll.forEach((n)->{System.out.println(n);});
	

	}

}


