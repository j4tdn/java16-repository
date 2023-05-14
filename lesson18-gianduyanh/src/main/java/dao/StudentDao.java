package dao;

import java.util.List;

import bean.Student;
import bean.StudentGroupDTO;

public interface StudentDao {
	List<Student> getAll();
	List<Student> sortGrate();
}
