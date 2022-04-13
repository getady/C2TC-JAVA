
package com.lambdaexpression;
interface MultiStmt
{
	String say (String message);
}

public class MultiString {

	public static void main(String[] args)
	{
	     MultiStmt ms=(message)-> {String str1="Hello welcome M12 ";
                                     String str2=str1+message;
	                                 return str2;};
	                                 System.out.println(ms.say("Happy weekend."));
	}

}


