package service;

import java.util.List;

import dto.StudentOfClassDto;

public interface ClassService {
	List<StudentOfClassDto> statisticStudentPerClass();

	List<StudentOfClassDto> getNumberofStudentInClassWithCondition(double mathScore, double literatureScore);
}
