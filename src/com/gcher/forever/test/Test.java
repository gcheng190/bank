package com.gcher.forever.test;

import com.gcher.forever.domian.Bank;
import com.gcher.forever.domian.Customer;
import com.gcher.forever.ex.CheckingAccount;
import com.gcher.forever.ex.SavingAccount;
import com.gcher.forever.report.CustomerReport;

public class Test {
    public static void main(String[] args) {
		 Bank bank=Bank.getbBank();
		 Customer customer;
		 CustomerReport report=new CustomerReport();
		 
		 // Create several customers and their accounts
		 bank.addCustomer("aaa","bbb");
		 customer=bank.getCustomer(0);
		 customer.addAccount(new SavingAccount(500.00,0.05));
		 customer.addAccount(new CheckingAccount(200.00,400.00));
		 
		 bank.addCustomer("ccc","ddd");
		 customer=bank.getCustomer(1);
		 customer.addAccount(new CheckingAccount(200.00));
		 
		 bank.addCustomer("eee","fff");
		 customer=bank.getCustomer(2);
		 customer.addAccount(new SavingAccount(1500.00,0.05));
		 customer.addAccount(new CheckingAccount(200.00));
		 
		 bank.addCustomer("ggg","hhh");
		 customer=bank.getCustomer(3);
		 customer.addAccount(bank.getCustomer(2).getAccount(1));
		 customer.addAccount(new SavingAccount(150.00,0.05));
		 
		 report.generateReport();
	}
}

