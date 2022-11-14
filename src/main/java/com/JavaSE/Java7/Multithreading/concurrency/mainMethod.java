package com.JavaSE.Java7.Multithreading.concurrency;

  public class mainMethod {
  
	public static void main(String args[]) {
	BankAcount account = new BankAcount(1000, "212170002");
	Thread thread1 = new Thread(new Runnable() {
		@Override
		public void run() {
			account.deposit(50);
			account.withdraw(300);
		}
	});
	
	Thread thread2 = new Thread(new Runnable() {
		@Override
		public void run() {
			account.deposit(100);
			account.withdraw(400);
		}
	});
    thread1.start();
    thread2.start();
  }
}