package service;

import java.util.List;

import persitence.Student;

public interface StudentService {
	List<Student> getAllById(int id);
}
