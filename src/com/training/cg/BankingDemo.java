package com.training.cg;

public class BankingDemo {

	public static void main(String args[]) {
		SavingAccount sa1=new SavingAccount(2000);
		sa1.deposit(3000);
		System.out.println(sa1.checkBalance());
		sa1.withdraw(1000);
		System.out.println(sa1.checkBalance());
		
		CurrentAccount ca1=new CurrentAccount(1000);
		ca1.deposit(1000);
		System.out.println(ca1.checkBalance());
		ca1.withdraw(500);
		System.out.println(ca1.checkBalance());
		System.out.println(sa1.getInterest(3));
	}
}
