package mutable;

public class Ex01StringMutable {
	public static void main(String[] args) {
		//Mutable
		StringBuilder sb = new StringBuilder("Layout ");
		hash("sb1",sb);
		
		sb = sb.append("Manager");//builder pattern
		hash("sb2",sb);
		
		System.out.println("value: " + sb);

		System. out. println("\n======================\n");
		//Imuatable
		String i= "Box";
		hash("i1",i);
		
		i+="Layout";
		hash ("i2",i);
		
	}
	
	private static void hash(String text, Object object) {
		
		
	}

}
