package service;

import java.util.List;

import dao.ClassDao;
import dao.HibernateClassDao;
import persistence.Class;
import persistence.ClassTotalAmountStudentDto;

public class ClassServiceImpl implements ClassService{
	
	private ClassDao classDao;
	
	public ClassServiceImpl() {
		classDao = new HibernateClassDao();
	}
	
	@Override
	public List<Class> getAll() {
		return classDao.getAll();
	}
	
	@Override
	public List<ClassTotalAmountStudentDto> totalAmountStudent() {
		return classDao.totalAmountStudent();
	}
}
