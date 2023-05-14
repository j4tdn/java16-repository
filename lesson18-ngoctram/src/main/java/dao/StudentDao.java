package dao;

import java.util.List;

import persistence.Student;

public interface StudentDao {
	List<Student> get(int classId);
	
	List<Student> getGoodStudents();
}
