package com.tnsif.Framework;

public interface ShopFactory 
{

	public abstract PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);
	public abstract NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges);
	
}


