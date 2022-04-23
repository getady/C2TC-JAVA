package com.tnsif.Application;

import com.tnsif.Framework.ShopFactory;

public class GSShopFactory implements ShopFactory
{

	public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) 
	{
		GSPrimeAcc gsprime=new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return gsprime;
		
	}
	
	public GSNormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		GSNormalAcc gsnormal=new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return gsnormal;
		
	}
	
	
}



