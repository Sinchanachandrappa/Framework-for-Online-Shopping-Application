package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopAcc;
import com.tns.framework.ShopFactory;


public class Sinchana 
{
	public static void main(String[] args) 
	{
		// Step 1 - Step a
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAccount(256, "Sinchana", 2000, true);
		gssfactory.getNewNormalAccount(156, "Harshitha", 2000, 50);
		
		
		// Step 2
		GSPrimeAcc gsprime = new GSPrimeAcc();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharges();
		// Step 4 / Step d.
		gsprime.bookProduct(1000);
		
		// Step 5 / Step e.
		gsprime.toString();
		
		// Step 3
		GSNormalAcc gsnormal = new GSNormalAcc(); 
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharge();
		
		// Step 4 / Step d.
		gsnormal.bookProduct(1000);
		// Step 5 / Step e.
		gsnormal.toString();
	
		

	}

}
