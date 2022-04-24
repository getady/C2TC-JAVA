
package com.tnsif.Framework;

public class CurrentAcc extends BankAcc
{
	public final float creditLimit;

	public CurrentAcc(int accNo,String accNm,float accBal,float creditLimit) {
		super();
		this.creditLimit = creditLimit;
	}
	
	public void withdraw(float deposite)
	{
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
	



