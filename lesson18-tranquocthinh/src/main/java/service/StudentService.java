package service;

import java.util.List;

import persistence.Student;

public interface StudentService {
	List<Student> getAllStudentByClassId(int classId);
	
	List<Student> getStudentsByAvgScore(double avgScore);

}
