package com.cg.Clientt;

import com.cg.application.MMBankFactory;
import com.cg.application.MMSavingsAcc;
import com.cg.application.MMcurrentAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingsAcc;

public class Clientt {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingsAcc sa = new MMSavingsAcc(120,"Harshitha",24000,true);
		CurrentAcc ca = new MMcurrentAcc(143,"JK",40000,12000);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
	}

}
