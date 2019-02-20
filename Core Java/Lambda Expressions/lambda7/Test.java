package com.capgemini.lambada7;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("venky","nellore");
		map.put("surya","telanga");
		map.put("krish","bangalore");
		map.put("akshay","mumbai");
		
		StringBuilder sb=new StringBuilder();
		Set<Map.Entry<String, String>> s=map.entrySet();
	
		
		for(Map.Entry<String,String> x:s) {
			sb=sb.append(x.getKey()+""+x.getValue());
		}
		
		System.out.println(sb);
		
		

	}
}
