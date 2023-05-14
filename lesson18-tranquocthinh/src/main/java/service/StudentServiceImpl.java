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
	
	

	@Override
	public List<Student> getAllStudentByClassId(int classId) {
		return studentDao.getAllStudentByClassId(classId);
	}
	
	@Override
	public List<Student> getStudentsByAvgScore(double avgScore) {
		return studentDao.getStudentsByAvgScore(avgScore);
	}
}
