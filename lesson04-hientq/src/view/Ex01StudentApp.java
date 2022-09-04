package view;

import bean.Student;
import utils.StudentHelper;

public class Ex01StudentApp {
    public static void main(String[] args){
        // Create 3 instances of Student
        Student s1 = new Student(0x1,"Tran Quan Hien", 1.5f, 2.0f);
        Student s2 = new Student(0xFA, "Nguyen Van A", 8.3f, 9.4f);
        Student s3 = new Student();
        StudentHelper.setDataFromStdin(s3);

        Student[] students = {s1, s2, s3};
        Student[] studentsHaveAverageMarkOver = StudentHelper.findStudentsHaveAverageOver(students, 8.5f);
        System.out.println("Students have average mark over " + 8.5+":");
        if(studentsHaveAverageMarkOver == null){
            System.out.println("There is no student has average over " + 8.5);
        } else {
            for(Student s : studentsHaveAverageMarkOver){
                if(s == null){
                    break;
                }
                System.out.println(s);
            }
        }

        Student[] studentsHaveTheoryOverPractice = StudentHelper.findStudentsHaveTheoryOverPractice(students);
        System.out.println("Students have theory over practice:");
        if(studentsHaveTheoryOverPractice == null){
            System.out.println("There is no student has theory over practice");
        } else{
            for(Student s : studentsHaveTheoryOverPractice){
                if(s == null){
                    break;
                }
                System.out.println(s);
            }
        }

    }
}
