package com.gcher.forever.ex;

import com.gcher.forever.domian.Account;

public class SavingAccount extends Account{
    //利率
	@SuppressWarnings("unused")
	private double interestRate;
	
	public SavingAccount(double init_balance,double interestRate){
		super(init_balance);
		this.interestRate=interestRate;
	}
	
}  
