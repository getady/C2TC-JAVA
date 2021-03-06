package com.tns.client;

import com.tnsif.Application.GSNormalAcc;
import com.tnsif.Application.GSPrimeAcc;
import com.tnsif.Application.GSShopFactory;

public class Client 
{
	public static void main(String[] args) 
	{
		
		//step-a 
		GSShopFactory gssfactory=new GSShopFactory();
		gssfactory.getNewPrimeAccount(101, "ammar", 1000, true);
		gssfactory.getNewNormalAccount(102, "ateef", 1500, 50);
	
		//step-b
		GSPrimeAcc gsprime=new GSPrimeAcc(101, "ammar", 1000, true);
		gsprime.getAccNo();
		gsprime.getAccNm();
		gsprime.getCharges();
		
		//step-d
		gsprime.bookProduct(1000);
		//step-e
		gsprime.toString();
		
		//step-c
		GSNormalAcc gsnormal=new GSNormalAcc(102, "ateef", 1500, 50);
		gsnormal.getAccNo();
		gsnormal.getAccNm();
		gsnormal.getCharges();
		gsnormal.getDeliverycharges();
		
		//step-d
		gsnormal.bookProduct(1500);
		//step-e 
		gsnormal.toString();
		
	
	}
	
}

