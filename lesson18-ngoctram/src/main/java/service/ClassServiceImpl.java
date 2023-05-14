package service;

import java.util.List;

import dao.ClassDao;
import dao.HibernateClassDao;
import persistence.ClassDto;

public class ClassServiceImpl implements ClassService {
	private static final ClassDao cDao;
	
	static {
		cDao = new HibernateClassDao();
	}

	@Override
	public List<ClassDto> countAmount() {
		return cDao.countAmount();
	}

}
