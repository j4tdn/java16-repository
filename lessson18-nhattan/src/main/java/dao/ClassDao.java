package dao;

import java.util.List;
import persistence.Class;
import persistence.ClassTotalAmountStudentDto;

public interface ClassDao {
	List<Class> getAll();
	
	List<ClassTotalAmountStudentDto> totalAmountStudent();
}
