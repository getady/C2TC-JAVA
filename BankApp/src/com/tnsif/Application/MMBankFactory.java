
package com.tnsif.Application;

import com.tnsif.Framework.BankFactory;

public class MMBankFactory implements BankFactory
{
	public MMSavingAcc getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalaried)
	{
		MMSavingAcc mmsaving=new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return mmsaving;
	}

	
		public MMCurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal,float creditLimit)
		{
			MMCurrentAcc mmcurrent=new MMCurrentAcc(accNo, accNm, creditLimit, creditLimit);
			return mmcurrent;
		}

}




