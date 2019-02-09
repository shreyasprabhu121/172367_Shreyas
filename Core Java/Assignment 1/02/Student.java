package com.cg.stu;

public class Student {
    private String name;
    private String address;
    //private int numCourses = 0;
    private String[] courses = new String[30];
    private int[] grades = new int[30];

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void addCourseGrade(String course, int grade)
    {
        for(int i=0;i<courses.length;i++){
            if(courses[i]==null){
                grades[i]=grade;
                courses[i] = course;
                break;
            }
            else {
               i++;
            }

    }

    }

    public void printGrades()
    {
        for(int i=0;i<courses.length;i++){
            if(courses[i]!=null) {
                System.out.println("course: " + courses[i] + " grade: " + grades[i]);
            }

        }
    }
    public double getAverageGrade()
    {
        int n=0;
        int sum=0;
        for(int i=0;i< courses.length;i++){
            if (courses[i]!=null){
                sum=sum+grades[i];
                n++;
            }


        }
        return sum/n;
    }

}