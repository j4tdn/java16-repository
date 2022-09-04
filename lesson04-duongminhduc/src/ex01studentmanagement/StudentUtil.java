package ex01studentmanagement;

public class StudentUtil {

	public static float gradePointAverage(Student student)
	{
		return (student.getPointTheory() + student.getPointPractice())/2;
	}
	public static void findStudent(Student[] students)
	{
		System.out.println("list of students with GPA higher than 8.5 :");
		for(Student student : students)
		{
			if(gradePointAverage(student) > 8.5)
			{
				System.out.println(student);
			}
		}
	}
	public static void findStudentTheoryHigherThanPractice(Student[] students)
	{
		System.out.println("list of students with theory higher than practice: ");
		for(Student student : students)
		{
			if(student.getPointTheory() > student.getPointPractice())
			{
				System.out.println(student);
			}
		}
	}
}
