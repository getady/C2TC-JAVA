
package com.tns.client;

import com.tnsif.Application.MMBankFactory;
import com.tnsif.Application.MMCurrentAcc;
import com.tnsif.Application.MMSavingAcc;

public class Client 
{
	public static void main(String[] args)
	{
		//step-a
		MMBankFactory mmbfactory=new MMBankFactory();
		mmbfactory.getNewSavingAccount(885588559, "habibi", 2000, true);
		mmbfactory.getNewCurrentAccount(775588559, "aleef", 500, 10000);
		
		//step-b
		MMSavingAcc mmsaving=new MMSavingAcc(885588559, "habibi", 2000, true);
		mmsaving.getAccNo();
		mmsaving.getAccNm();
		mmsaving.getAccBal();
		
		//step-d
		mmsaving.withdraw(2000);
		//step-e
		mmsaving.toString();
		
		//step-c
		MMCurrentAcc mmcurrent=new MMCurrentAcc(775588559, "aleef", 500, 10000);
		mmcurrent.getAccNo();
		mmcurrent.getAccNm();
		mmcurrent.getAccBal();
		
		//step-d
		mmcurrent.withdraw(500);
		//step-e
		mmcurrent.toString();


	}

}




