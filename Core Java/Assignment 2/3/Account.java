package com.cg.third;

public class Account {
private int id;
private Customer customer;
private double balance = 0.0;
public Account(int id, Customer customer, double balance) {
	super();
	this.id = id;
	this.customer = customer;
	this.balance = balance;
}
public Account(int id, Customer customer) {
	super();
	this.id = id;
	this.customer = customer;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public int getId() {
	return id;
}
public Customer getCustomer() {
	return customer;
}

@Override
public String toString() {
	return "Account [id=" + id + ", customer=" + customer + ", balance=" + balance + "]";
}
public void Deposit(double amount) {
	this.balance +=amount; 
}
public void Withdraw(double amount) {
	if(amount<this.balance) {
	this.balance -=amount; 
	}
	else
		System.out.println("Insufficient balance to withdraw");
}
}
