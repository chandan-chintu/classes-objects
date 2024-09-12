package sample;

public class Student {
    // Student is entity class
    // attributes or fields of class student
    public int studentId;
    public String name;
    public String dob;
    public int age;
    public String gender;
    public String yearOfAdmission;
    public String grade;

    public static String email="default@gamil.com";

    public Student() {
    }

    public Student(int studentId, String name, String dob, int age, String gender, String yearOfAdmission, String grade) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.gender = gender;
        this.yearOfAdmission = yearOfAdmission;
        this.grade = grade;
    }



    // it prints the object along with its fields
   // @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", yearOfAdmission='" + yearOfAdmission + '\'' +
                ", grade='" + grade + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
