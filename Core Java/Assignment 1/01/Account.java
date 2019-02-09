package com.cg.hw;

public class Account {
private String ID;
private String name;
private int balance=0;

public Account(String iD, String name) {
	super();
	this.ID = iD;
	this.name = name;
	
}

public String getID() {
	return this.ID;
}

public void setID(String iD) {
	this.ID = iD;
}

public String getName() {
	return this.name;
}

public void setName(String name) {
	this.name = name;
}

public int getBalance() {
	return this.balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

public void credit(int amount) {
	
	this.balance=this.balance+amount;
	System.out.println("Amount is credited, present amount is "+this.balance);
}
public  void debit(int amount) {
	if(amount<this.balance) {
		this.balance=this.balance-amount;
		System.out.println("Amount successfully withdrawn");
	
	}
	else
		System.out.println("Insufficient balance, balance is "+this.balance);
}

public  void transferTo(int amount) {
	if(amount<this.balance) {
		this.balance=this.balance-amount;
		System.out.println("Amount successfully transferred");
		System.out.println("balance is "+this.balance);
	
	}
	else
		System.out.println("Insufficient balance to transfer, balance is "+this.balance);
}

@Override
public String toString() {
	return "Account [ID=" + this.ID + ", name=" + this.name + ", balance=" + this.balance + "]";
}




		
		

	

}
