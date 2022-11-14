package com.JavaSE.Java7.Multithreading.concurrency;

public class BankAcount {
  private Double balance;
  private String accounteNumber;
public BankAcount(double balance, String accounteNumber) {
	super();
	this.balance = balance;
	this.accounteNumber = accounteNumber;
}
  public void deposit(double amount) {
	  synchronized (this) {
		  balance = balance + amount ;
	  }
	  System.out.println("balance is after deposit "  + balance);
  }
  public void withdraw(double amount) {
	  synchronized (this) {
		  balance = balance - amount;
	  }
	  System.out.println("balance is after withDraw "  + balance);
  }
}
