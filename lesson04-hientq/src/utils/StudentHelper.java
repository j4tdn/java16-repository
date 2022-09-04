package utils;

import bean.Student;

import java.util.Arrays;
import java.util.Scanner;
public class StudentHelper {


    public static void setDataFromStdin(Student student){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        student.setId(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter name: ");
        student.setName(sc.nextLine().trim());
        System.out.print("Enter theory mark: ");
        student.setTheoryMark(Float.parseFloat(sc.nextLine()));
        System.out.print("Enter practice mark: ");
        student.setPracticeMark(Float.parseFloat(sc.nextLine()));
    }

    public static Student[] findStudentsHaveAverageOver(Student[] students, float average){
        // Counting how many student has average mark over giving average
        Student[] studentsHaveAverageOver = new Student[students.length];
        int index = 0;
        for(Student s : students){
            if(s.getAverageMark() > average){
                studentsHaveAverageOver[index] = s;
                index++;
            }
        }
        if(index == 0){
            return null;
        }
        return studentsHaveAverageOver;
    }

    public static Student[] findStudentsHaveTheoryOverPractice(Student[] students){
        Student[] studentsHaveTheoryOverPractice = new Student[students.length];
        int index = 0;
        for(Student s : students){
            if(s.getTheoryMark() > s.getPracticeMark()){
                studentsHaveTheoryOverPractice[index] = s;
                index++;
            }
        }

        if(index == 0){
            return null;
        }

        return studentsHaveTheoryOverPractice;
    }
}
