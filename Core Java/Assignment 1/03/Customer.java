package com.cg.bp;

public class Customer 
{
	private static String name; 
	private static String memberType;
	private boolean member = false;
	
	


	

	public Customer(String name) 
	{
		super();
		Customer.name = name;
	}

	
	public static String getName() {
		return name;
	}
	
	
	public static String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	
	public void setMember(boolean member) {
		this.member = member;
	}
	
	public boolean isMember(boolean member)
	{
		
		if (member == false)
		{
			System.out.println("Please take a membership.");
			System.out.println("Sorry..No discount");
		}
	
		
		
		
		return member;
	}
	@Override
	public String toString() 
	{
		return "Customer [name=" + name + ", memberType=" + memberType + ", member=" + member + "]";
	}
	
}