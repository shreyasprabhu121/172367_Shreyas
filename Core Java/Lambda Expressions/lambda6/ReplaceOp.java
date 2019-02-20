package com.LambdaExp.Assignment6;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class ReplaceOp {

	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("kokoko");
		list.add("kikik");
		list.add("lailah");
		list.add("laila");
		list.add("lailar");
		System.out.println("List before conversion");
		list.forEach(System.out::println);
		list.replaceAll(e -> e.toUpperCase());
		System.out.println();
		System.out.println("List after conversion");
		list.forEach((e)->System.out.println(e));
		
	}

}
