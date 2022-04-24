
package com.tnsif.Application;

import com.tnsif.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(float accBal)
	{
		System.out.println("Dear current user,your account balance is "+accBal+" with credit Limit "+creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal="
				+ accBal + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	public void getcreditLimit() {
		// TODO Auto-generated method stub
		
	}
}



