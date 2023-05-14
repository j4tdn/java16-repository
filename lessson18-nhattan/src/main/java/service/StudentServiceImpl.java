package service;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persistence.Student;
import persistence.StudentAVGScoreDto;

public class StudentServiceImpl implements StudentService{
	
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao = new HibernateStudentDao();
	}
	
	@Override
	public List<Student> getAll() {
		return studentDao.getAll();
	}
	
	@Override
	public List<StudentAVGScoreDto> haveAvgScoreGreat() {
		return studentDao.haveAvgScoreGreat();
	}
}
