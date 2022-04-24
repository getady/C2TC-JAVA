
package com.tnsif.Application;

import com.tnsif.Framework.BankFactory;

public class MMBankFactory implements BankFactory
{
	public MMSavingAcc getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalary)
	{
		MMSavingAcc mmsaving=new MMSavingAcc(accNo, accNm, accBal, isSalary);
		return mmsaving;
	}

	
		public MMCurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal,float creditLimit)
		{
			MMCurrentAcc mmcurrent=new MMCurrentAcc(accNo, accNm, creditLimit, creditLimit);
			return mmcurrent;
		}

}




