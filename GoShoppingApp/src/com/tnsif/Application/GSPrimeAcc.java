package com.tnsif.Application;

import com.tnsif.Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	
	protected static final float charges=0;
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
	{
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	
	
	public void bookProduct(float charges)
	{
		System.out.println("Dear prime User, Your product chareges are "+charges);
	}



	@Override
	public String toString() {
		return "GSPrimeAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()="
				+ getCharges() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}

