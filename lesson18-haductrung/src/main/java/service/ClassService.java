package service;

import java.util.List;

import persistence.StudentOfClassDto;

public interface ClassService{
	List<StudentOfClassDto> statisticStudentPerClass();
}