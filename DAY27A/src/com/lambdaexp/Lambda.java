
package com.lambdaexp;
interface inf
{ 
	public void add (int a, int b);
}

public class Lambda {

	public static void main(String[] args) {
		{
        inf i=(int a,int b )->System.out.println(a+b);
        i.add(20,20);
       
		}

	}
}


