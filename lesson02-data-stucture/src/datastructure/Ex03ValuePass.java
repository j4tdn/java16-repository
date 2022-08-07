package datastructure; 

public class Ex03ValuePass {
	

		public static void main(String[]args) {
			int age =23;
			int salary = 10;
			
			//làm 1 năm
			salary = age;
			age = 24;
			System.out.println("age :"+ age);//24
			System.out.println("salary: " + salary);//23  
			modify (salary);
			System.out.println("salary after reviview:"+ salary);
			//java pass by value
			//review lương hằng năm 
			//int salary --> danh sánh tham số truyền vào
			//nhận giá trị từ bên ngoài
			//salary =30
		}
			private static void modify(int salary) {
				salary = 30;
				
			}
			
				
			
		}
	
	
	
		

