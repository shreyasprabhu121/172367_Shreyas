package com.capgemini.lambada5;
import java.util.ArrayList;
import java.util.List;
public class Test {

	public static void main(String[] args) {
		
		List<String> array = new ArrayList<String>();
		array.add("venky");
		array.add("venkat");
		array.add("venkatesh");
		array.add("surya");
		System.out.println("String is :\n"+array);
		System.out.println("The first words of the Strings are-->");
	
		String stringresult = array.stream().map(surya -> Character.toString(surya.charAt(0))).reduce(" ", (a, b) -> a + b);
		System.out.println(stringresult);
	
	}
	}


