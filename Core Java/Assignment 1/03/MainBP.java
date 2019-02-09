package com.cg.bp;

public class MainBP {

	public static void main(String[] args) {
		Customer c=new Customer("jack");
		c.setMember(true);
		c.setMemberType("Premium");
		Visit v=new Visit(null);
		v.setProductExpense(5600);
		v.setServiceExpense(7000);
		System.out.println("Your service expense is "+v.getServiceExpense());
		System.out.println("Your product expense is "+v.getProductExpense());
		v.getTotalExpense();
		
		DiscountRate d=new DiscountRate();
		d.memberDec();
		d.serviceDiscountRate();
		d.productDiscountRate();
		d.totalexp();
		
	}

}
