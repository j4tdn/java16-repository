package service;

import java.util.List;

import persistence.Class;
import persistence.ClassTotalAmountStudentDto;

public interface ClassService {
	List<Class> getAll();
	
	List<ClassTotalAmountStudentDto> totalAmountStudent();
}
