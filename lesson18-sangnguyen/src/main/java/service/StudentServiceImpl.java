package service;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persistence.Student;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao = new HibernateStudentDao();
	}
	
	public List<Student> getAllStudentByClassId(int class_id) {
		// TODO Auto-generated method stub
		return studentDao.getAllStudentByClassId(class_id);
	}
}
