package com.cg.bp;

//import java.util.Date;

public class Visit extends Customer
{
	
	public Visit(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private static double serviceExpense; 
	private static double productExpense; 
	//private Date date;
	
	
	
	
	
	public static double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public static double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}

	public double getTotalExpense() {
		double totalExpense = serviceExpense + productExpense;
		System.out.println("Total Expenses= "+totalExpense);
		return totalExpense;
	}
	
	
	
}
