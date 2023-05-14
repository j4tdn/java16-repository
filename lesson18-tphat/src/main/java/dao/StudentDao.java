package dao;

import java.util.List;

import persitence.Student;

public interface StudentDao {
	List<Student> getAllById(int id);
}
