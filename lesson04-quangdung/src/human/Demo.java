package human;

public class Demo {

	public static void main(String[] args) {
		President pr = new President("Dung", "30/07/2001", 1, 1);
		Manager mn = new Manager("Phat", "10/09/2001", 1, 1);
		Employee em = new Employee("Duy", "11/12/2001",1 , "CNTT");
		Employee em1 = new Employee("Nhan", "09/01/2001",2 , "KHMT");
		
		System.out.println(pr + " " + (long)pr.calSalary());
		System.out.println(mn + " " + (long)mn.calSalary());
		System.out.println(em + " " + (long)em.calSalary());
		System.out.println(em1 + " " + (long)em1.calSalary());
	}

}
