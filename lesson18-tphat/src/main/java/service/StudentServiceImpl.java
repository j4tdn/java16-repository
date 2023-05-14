package service;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persitence.Student;

public class StudentServiceImpl implements StudentService{
	
private static StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao = new HibernateStudentDao();
	}

	public List<Student> getAllById(int id) {
		// TODO Auto-generated method stub
		return studentDao.getAllById(id);
	}

}
