package com.tnsif.Application;

import com.tnsif.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc
{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges)
	{
		System.out.println("Dear normal User, Your product chareges are "+charges+" with delivery charges "+deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()="
				+ getCharges() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void getDeliverycharges() {
		// TODO Auto-generated method stub
		
	}
	
	
}




