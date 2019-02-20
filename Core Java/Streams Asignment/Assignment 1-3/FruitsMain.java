package com.stream.Assignment123;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FruitsMain {

	public static void main(String[] args) {
		List<Fruit> list=new ArrayList<>();
		list.add(new Fruit("Mango",150,100,"Yelow"));
		list.add(new Fruit("Banana",40,30,"Yellow"));
		list.add(new Fruit("Apple",70,50,"Red"));
		list.add(new Fruit("Watermelon",200,80,"Green"));
		list.add(new Fruit("Guava",120,70,"Green"));
		list.add(new Fruit("Lithchi",30,100,"Red"));
		list.add(new Fruit("Strwaberry",10,70,"Red"));
		System.out.println("Assignment 1---------------------------------");
		List<String> names=list.stream()
				.filter(p->p.getCalories()<100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed())
				.map(Fruit::getName)
				.collect(Collectors.toList());
		names.forEach(System.out::println);
		
		System.out.println("Assignment 2---------------------------------");
		List<Fruit> names3=list.stream()
				.sorted(Comparator.comparing(Fruit::getColor))
				.collect(Collectors.toList());
		names3.forEach(e->System.out.println("Fruit is: "+e.getName()+" with color: "+e.getColor()));
		
		System.out.println("Assignment 3---------------------------------");
		List<String> names2=list.stream()
				.filter(p->p.getColor()=="Red")
				.sorted(Comparator.comparing(Fruit::getPrice))
				.map(Fruit::getName)
				.collect(Collectors.toList());
		names2.forEach(System.out::println);
		
		
}
}
