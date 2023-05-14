package service;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persistence.Student;

public class StudentServiceIpml implements StudentService{

	private StudentDao studentDao;
	
	public StudentServiceIpml() {
		studentDao = new HibernateStudentDao();
	}
	
	public List<Student> findByClassId(Integer cId) {
		return studentDao.findByClassId(cId);
	}

}
