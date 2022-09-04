package view;

import java.util.Scanner;

import bean.Students;

public class Ex01 {
	public static void main(String[] args) {
		Students sv1 = new Students(1,"kha",9,10);
		Students sv2 = new Students(2,"vinh",8,9);
		Students sv3 = new Students();
		inputSV(sv3);
		
		Students[] listSV = {sv1, sv2, sv3};
		findSvWhereMedianPointUpThanN(listSV, (float)8.7);
		findSvWhereTheoryPointHigher(listSV);
		
	}
	
	public static void findSvWhereTheoryPointHigher(Students[] listSV) {
		for (Students students : listSV) {
			if(students.getTheoryPoint() >= students.getPracPoint()) {
				System.out.println(students.toString());
			}
		}
	}
	
	
	public static void findSvWhereMedianPointUpThanN(Students[] listSV, float n) {
		for (Students students : listSV) {
			if(students.getMedian() >=  n) {
				System.out.println(students.toString());
			}
		}
	}
	
	
	public static void inputSV(Students sv3) {
		int id = 0;
		String name = "";
		float theoryPoint = 0;
		float pracPoint = 0;
		Scanner sc = new Scanner(System.in);
		String idAsText = "";
		do {
			System.out.print("Nhập ID : ");
			idAsText = sc.nextLine();
		}while(!idAsText.matches("\\d+"));
		id = Integer.parseInt(idAsText);
		System.out.print("Nhập tên : ");
		name = sc.nextLine();
		System.out.print("Nhập Điểm Lý Thuyết : ");
		theoryPoint = Float.parseFloat(sc.nextLine());
		System.out.print("Nhập Điểm Thực Hành : ");
		pracPoint = Float.parseFloat(sc.nextLine());
		sv3.setStudentID(id);
		sv3.setPracPoint(pracPoint);
		sv3.setStudentName(name);
		sv3.setTheoryPoint(theoryPoint);
	}
}
