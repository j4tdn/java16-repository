package service;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persistence.Student;

public class StudentServiceImpl implements StudentService {
	private static final StudentDao sDao;
	static {
		sDao = new HibernateStudentDao();
	}

	@Override
	public List<Student> get(int classId) {
		// TODO Auto-generated method stub
		return sDao.get(classId);
	}

	@Override
	public List<Student> getGoodStudents() {
		// TODO Auto-generated method stub
		return sDao.getGoodStudents();
	}
	
}
