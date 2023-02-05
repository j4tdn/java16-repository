package model;

import java.util.Arrays;
import java.util.List;

public class DataModel {

    public static List<Student> getStudent(){
        List<Student> studentList = Arrays.asList(
         new Student(1,"Le Na",7.4f,"Nu"),
         new Student(2,"Nam",8.2f,"Nam"),
         new Student(3,"cuong",8.4f,"Nam"),
         new Student(4,"cuong",6.1f,"Nam"),
         new Student(5,"Nu",9.1f,"Nu"),
         new Student(6 ,"Nhung",8.4f,"Nu"));
        return studentList;
    }
}
