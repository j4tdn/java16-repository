package utils;

import bean.Grade;
import bean.Student;

import java.util.ArrayList;

public class StudentHelper {
    public static Student[] getStudents(Student[] students, Grade grade){
        ArrayList<Student> temp = new ArrayList<>();
        for(Student x : students){
            if(x.getGrade() == grade){
                temp.add(x);
            }
        }

        Student[] result = temp.toArray(new Student[0]);
        return result;
    }
}
