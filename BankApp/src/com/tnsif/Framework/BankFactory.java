
package com.tnsif.Framework;

public interface BankFactory 
{
	
	public abstract CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal,float creditLimit);
    public abstract SavingAcc getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalaried);
    
}


