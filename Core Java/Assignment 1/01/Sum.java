package com.cg.hw;

public class Sum {

	public static void main(String[] args) {
		Account acc=new Account("101","jack");
		
		System.out.println("ID is "+acc.getID());
		System.out.println("name is "+acc.getName());
		System.out.println("Balance is "+acc.getBalance());
		
		acc.credit(3000);
		acc.debit(10000);
		acc.transferTo(1000);
		acc.toString();
	System.out.println(acc.toString());
		
		

	}

}
