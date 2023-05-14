package dao;

import java.util.List;

import persistence.Student;
import persistence.StudentAVGScoreDto;

public interface StudentDao {
	List<Student> getAll();
	
	List<StudentAVGScoreDto> haveAvgScoreGreat();
}
