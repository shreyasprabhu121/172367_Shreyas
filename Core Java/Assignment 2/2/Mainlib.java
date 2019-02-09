package com.cg.main;

public class Mainlib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a = new Author("Jim","hgjm", 'F');
		System.out.println(a.getEmail());
		Book b = new Book("Jane",a,455,2);
		System.out.println(b.getAuthor());
		System.out.println(b.toString());
		
	};

}
