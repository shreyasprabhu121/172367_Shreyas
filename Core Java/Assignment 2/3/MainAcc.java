package com.cg.third;

public class MainAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stuba.
		Customer c=new Customer(101,"kavya",'f');
		Account a=new Account(655,c);
		System.out.println(a.toString());
		System.out.println("Your balance is "+a.getBalance());
		a.Deposit(30000);
		System.out.println("Your balance is "+a.getBalance());
		a.Withdraw(10000);
		System.out.println("Your balance is "+a.getBalance());
		a.Withdraw(40000);
	}

}
