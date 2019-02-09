package com.cg.bp;

public class DiscountRate
{
	double serviceDiscountPremium=0.2;
	double serviceDiscountGold=0.15;
	double serviceDiscountSilver=0.1;
	double productDiscountPremium=0.1;
	double productDiscountGold=0.1;
	double productDiscountSilver=0.1;
	double discount;
	double discount1;
	
	public void memberDec() {
		
		System.out.println("As you are "+Customer.getMemberType()+" member");
	}
	
	public void serviceDiscountRate()
	{
		if (Customer.getMemberType() == "Premium")
		{
			discount=  Visit.getServiceExpense() - (Visit.getServiceExpense()*serviceDiscountPremium);
			
			
			System.out.println("You have a service discount of  "+discount);
		}
		
		else if (Customer.getMemberType() == "Gold")
		{
			discount=  Visit.getServiceExpense() - (Visit.getServiceExpense()*serviceDiscountGold);
			
			
			System.out.println("You have a service discount of  "+discount);
		}
		
		else if (Customer.getMemberType() == "Silver")
		{
			discount=  Visit.getServiceExpense() - (Visit.getServiceExpense()*serviceDiscountSilver);
			
			
			System.out.println("You have a service discount of  "+discount);
		}
		else 
		{
			System.out.println("Sorry..... You are not Authorized to this");
		}
		
	}
	public void productDiscountRate()
	{
		if (Customer.getMemberType() == "Premium")
		{
			discount1=  Visit.getProductExpense() - (Visit.getProductExpense()*productDiscountPremium);
			
			
			System.out.println("You have a product discount of  "+discount1);
		}
		
		else if (Customer.getMemberType() == "Gold")
		{
			discount1=  Visit.getProductExpense() - (Visit.getProductExpense()*productDiscountGold);
			
			
			System.out.println("You have a product discount of  "+discount1);
		}
		
		else
		{
			discount1=  Visit.getProductExpense() - (Visit.getProductExpense()*productDiscountSilver);
			
			
			System.out.println("You have a product discount of  "+discount1);
		}
		
	}
	public void totalexp() {
		
		double total=discount+discount1;
	    System.out.println("Your discounted price is "+total);
	}
	
	
	
	
	
	
}
