package com.cg.stu;

public class MainStu {
    public static void main(String[] args) {
        Student stu=new Student("Jack","beml");
        
        System.out.println("Name of the student is "+stu.getName());
        System.out.println("Address of the student is "+stu.getAddress());
        System.out.println(stu.toString());
        stu.addCourseGrade("img101",62);
        stu.addCourseGrade("img102",92);
        stu.addCourseGrade("img103",42);
        stu.addCourseGrade("img104",32); 

        stu.printGrades();
        System.out.println("Average of the grades is "+stu.getAverageGrade());
    }
}
 