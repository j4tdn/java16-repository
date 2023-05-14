package dao;

import java.util.List;

import persistence.Student;

public interface StudentDao {
	List<Student> getAllStudentByClassId(int classId);

	List<Student> getStudentsByAvgScore(double avgScore);

}
