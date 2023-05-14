package service;

import java.util.List;

import persistence.Student;
import persistence.StudentAVGScoreDto;

public interface StudentService {
	List<Student> getAll();
	
	List<StudentAVGScoreDto> haveAvgScoreGreat();
}	
