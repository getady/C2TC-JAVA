
package com.tnsif.Framework;

public class SavingAcc extends BankAcc
{
	
	 private  boolean isSalaried;

	public SavingAcc(int accNo,String accNm,float accBal,boolean isSalaried) {
		super();
		this.isSalaried = isSalaried;
	}
	public void withdraw(float accBal)
	{
		
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalaried + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}







