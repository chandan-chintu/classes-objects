package main;


import sample.Student;

public class MainClass {
    public static void main(String[] args) {

        // student object
        Student s1 = new Student();
        System.out.println("Before assigning values to object s1 : "+s1);

        s1.studentId = 101;
        s1.name = "Sanjay";
        s1.dob = "12/12/2007";
        s1.age = 16;
        s1.yearOfAdmission = "12/06/2017";
        s1.gender = "male";
        s1.grade = "10 A";
        s1.email = "sanjay123@gmail.com";


        System.out.println("After assigning values to object s1 : "+s1);

        Student s2 = new Student();
        System.out.println("Before assigning values to object s2 : "+s2);

        //s2=s1;
        s2.studentId = 102;
        s2.name = "Ajay";
        s2.dob = "12/12/2009";
        s2.age = 16;
        s2.yearOfAdmission = "16/06/2017";
        s2.gender = "male";
        s2.grade = "10 A";
        //s2.email ="ajay123@gmail.com";

        System.out.println("After assigning values to object s2 : "+s2);

        Student s3 = new Student(103, "Divya", "12/09/2009",15,"female","12/07.2016","10 A");
        System.out.println("After assigning values to object s3 using parametrized constructor : "+s3);

        Student s4 = new Student();
        s4.studentId = 104;
        s4.name = "Vijay";
        s4.dob = "12/12/2009";
        s4.age = 16;
        s4.yearOfAdmission = "16/06/2017";
        s4.gender = "male";
        s4.grade = "10 A";
        //Student.email = "vijay123@gmail.com";
        System.out.println("After assigning values to object s4 : "+s4);
    }
}
