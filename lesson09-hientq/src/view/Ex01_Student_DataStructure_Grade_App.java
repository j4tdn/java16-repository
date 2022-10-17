package view;

import bean.Grade;
import bean.Student;
import utils.StudentHelper;

public class Ex01_Student_DataStructure_Grade_App {
    public static void main(String[] args){
        // List of Students

        Student[] students = {
                new Student("102", "Nam", Grade.C),
                new Student("103", "Bảo", Grade.F),
                new Student("104", "Hoàng", Grade.D),
                new Student("105", "Nguyên", Grade.B),
                new Student("107", "Vũ", Grade.F),
                new Student("109", "Lan", Grade.A),
                new Student("202", "Đạt", Grade.C),
                new Student("103", "Bảo", Grade.F),
                new Student("107", "Vũ", Grade.C),
                new Student("104", "Hoàng", Grade.B)
        };

        // Get students with grade A
        Student[] stdsGradeA = StudentHelper.getStudents(students, Grade.A);
        System.out.println("Students with grade A");
        for(Student x : stdsGradeA){
            System.out.println(x.getName());
        }
        System.out.println("===============================================");
        // Get students with grade F
        Student[] stdsGradeF = StudentHelper.getStudents(students, Grade.F);
        System.out.println("Students with grade F");
        for(Student x : stdsGradeF){
            System.out.println(x.getName());
        }
    }
}
