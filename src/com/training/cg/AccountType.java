package com.training.cg;

public class AccountType implements Account {
	
	 double INTIALBALANCE;
	double totalBalance=INTIALBALANCE;
	double rateOfInterest=3;
	
	
	public void deposit(double amount) {
		totalBalance+=amount;
	}
	
	public void withdraw(double amount) {
		if(totalBalance>amount) {
		totalBalance-=amount;
		}
		else {
			System.out.println("Insufficient Funds");
		}
		
	}
	
	public double checkBalance() {
		return totalBalance;
		
	}
	
	public double getInterest(int timePeriod) {
		return (totalBalance*timePeriod*rateOfInterest)/100;
	}

}
