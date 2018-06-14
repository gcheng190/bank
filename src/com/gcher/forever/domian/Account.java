package com.gcher.forever.domian;

import com.gcher.forever.exception.OverdraftException;
/**
 *  账户
 * @author cheng
 *
 */
public class Account {
     protected double balance;
     
     public Account(double init_balance){
    	 this.balance=init_balance;
     }
     
     public double getBalance(){
    	 return balance;
     }
     
     /**
 	 * 存钱方法
 	 * @param amt: 存款的钱数
 	 * @return: 返回存款是否成功
 	 */
     public  boolean deposit(double amt){
    	  this.balance+=amt;
    	  return true;
     }
     
     /**
 	 * 
 	 * @param amt 消费的金额
 	 * @throws OverdraftException: 当余额不足时，抛出该异常. 
 	 */
     public void withdraw(double amt){
    	 if(amt>balance){
    		 throw new OverdraftException("余额不足", amt-balance);
    	 }
    	  this.balance-=amt;
     }
}
