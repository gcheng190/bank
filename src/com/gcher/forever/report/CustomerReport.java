package com.gcher.forever.report;

import java.util.Iterator;

import com.gcher.forever.domian.Account;
import com.gcher.forever.domian.Bank;
import com.gcher.forever.domian.Customer;
import com.gcher.forever.ex.CheckingAccount;
import com.gcher.forever.ex.SavingAccount;

public class CustomerReport {
     public void generateReport(){
    	 Bank bank=Bank.getbBank();
    	 Customer customer=null;
    	 
    	 System.out.println("\t\t\tCUSTOMERS REPORT");
 		 System.out.println("\t\t\t================");
 		 
 		 Iterator<Customer> customers=bank.getCustomers();
 		 
 		 while(customers.hasNext()){
// 			for (int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++) {
// 			customer = bank.getCustomer(cust_idx);
 			 
 			 customer=customers.next();
 			 System.out.println();
			System.out.println("Customer: " + customer.getLastName() + ", "
					+ customer.getFirstName());
			
			Iterator<Account> accounts=customer.getAccounts();
			while(accounts.hasNext()){
				Account account=accounts.next();
				
				String account_tyle="";
				
				// Determine the account type
				/***
				 * Step 1: Use the instanceof operator to test what type of
				 * account we have and set account_type to an appropriate value,
				 * such as "Savings Account" or "Checking Account".
				 ***/
				if(account instanceof SavingAccount){
					account_tyle="Savings Account";
				}else if(account instanceof CheckingAccount){
					account_tyle="Checking Account";
				}
				
				// Print the current balance of the account
				/***
				 * Step 2: Print out the type of account and the balance. Feel
				 * free to use the currency_format formatter to generate a
				 * "currency string" for the balance.
				 ***/
				System.out.println(account_tyle + ": current balance is ￥"
						+ account.getBalance());
				
			}
 		 }
     }
}
