package service;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persistence.Student;

public class StudentServiceImpl implements StudentService{
	private static StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao = new HibernateStudentDao();
	}
	
	public List<Student> getAllStudentByClassId(int class_id) {
		return studentDao.getAllStudentByClassId(class_id);
	}
}
