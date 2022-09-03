package encapsulation.outside;

import encapsulation.inside.Company;

public class ExternalCompany {
	public String name;
	private String policy;
	
	public static void main(String[] args) {
		Company company = new Company();//muốn gọi đc thông tin trong company non static-->new ra 1 đối tượng
		System.out.println(company.name);//truy cập đc thuộc tính name
	}//subclass: lớp con
}
