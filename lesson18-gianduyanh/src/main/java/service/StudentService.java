package service;

import java.util.List;

import bean.Student;
import bean.StudentGroupDTO;
import dao.StudentDao;

public interface StudentService {

	
		List<Student> getAll();
		List<Student> sortGrade();

	
	
	
	

}
