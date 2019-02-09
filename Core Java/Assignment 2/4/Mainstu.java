package com.cg.fifth;

public class Mainstu {

	public static void main(String[] args) {
		
			Person p = new Person("kaav","46587");
			Student s=new Student(p.getName(),p.getAddress());
			Teacher t=new Teacher(p.getName(),p.getAddress());

			s.addCourseGrade("java", 78);
			s.addCourseGrade("javaEE", 88);
			s.addCourseGrade("c", 56);
			s.addCourseGrade("asp.net", 98);
			
			s.printGrades();
			System.out.println("Average of all grade is "+s.getAverageGrade());
	}

}
