package com.LambdaExp.Assignment2;

public class OrderMain {

	public static void main(String[] args) {
	Order or=(a,b)->{
		if(a>10000 && b=="ACCEPTED") {
			System.out.println("Price is above "+a+" and status is "+b);
			}
		};
		
	or.Perform(11000, "ACCEPTED");
	or.Perform(5000, "DECLINED");
	or.Perform(9000, "ACCEPTED");
	or.Perform(15000, "DECLINED");
	}

}
