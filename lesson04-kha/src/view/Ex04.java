package view;

import bean.Director;
import bean.Employee;
import bean.Leader;
import bean.People;

public class Ex04 {
	public static void main(String[] args) {
		String tmp[] = Ex04.class.getName().split("[.]", 0);
		System.out.println(tmp[1]);
		
		
		People gd1 = new Director();
		People ld1 = new Leader();
		People empl1 = new Employee();
		People empl2 = new Employee();
		
		gd1.input();
		ld1.input();
		empl1.input();
		empl2.input();
		
		People[] allMember = {gd1, ld1, empl1, empl2};
		
		for (People people : allMember) {
			System.out.println(people.toString());
		}
		
		System.out.println("SALARY");
		
		
		for (People people : allMember) {
			System.out.printf("%s | %.2f \n",people.getName(),  people.getSalary());
			
		}
		
	}
}
