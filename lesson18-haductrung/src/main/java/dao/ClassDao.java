package dao;

import java.util.List;

import persistence.StudentOfClassDto;

public interface ClassDao {
	List<StudentOfClassDto> statisticStudentPerClass();

}
