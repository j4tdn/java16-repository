package ex04_humanresourcemanagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HumanamResourceManagement {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		President pre=new President("Nguyễn Văn A", new Date(2001,7,28), 4.9, 3.4);
		Manager man = new Manager("Nguyễn Văn B", new Date(2001,6,12), 4.9, 20);
		Employee ee1 = new Employee("Nguyễn Văn C", new Date(2000,6,12), 4.9, "Kế toán");
		Employee ee2 = new Employee("Nguyễn Văn D", new Date(2000,6,12), 4.9, "Nhân sự");
		list.add(pre);
		list.add(man);
		list.add(ee1);
		list.add(ee2);
		for(Person n : list) {
			System.out.println(n.toString());
			System.out.println("-----------------------------------------");
		}
		

		
		
		
	}

}
