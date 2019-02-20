package com.assignmentLambdaExp.Assignment4;

import java.awt.List;
import java.util.ArrayList;

public class ListCondition {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("kokoko");
		list.add("kikik");
		list.add("lailah");
		list.add("laila");
		list.add("lailar");
		System.out.println("List before removing odd length names");
		list.forEach(System.out::println);
		System.out.println();
		System.out.println("List after removing odd length names");
		list.removeIf(name ->(name.length()%2!=0));
		list.forEach(System.out::println);
		
		
	}

}
