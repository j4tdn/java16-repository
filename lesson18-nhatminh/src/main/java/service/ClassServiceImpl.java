package service;

import java.util.List;

import dao.ClassDao;
import dao.HibernateClassDao;
import dto.StudentOfClassDto;

public class ClassServiceImpl implements ClassService {

	private static ClassDao classDao;

	public ClassServiceImpl() {
		classDao = new HibernateClassDao();
	}

	public List<StudentOfClassDto> statisticStudentPerClass() {
		return classDao.statisticStudentPerClass();
	}

	public List<StudentOfClassDto> getNumberofStudentInClassWithCondition(double mathScore, double literatureScore) {
		return classDao.getNumberofStudentInClassWithCondition(mathScore, literatureScore);
	}
}
