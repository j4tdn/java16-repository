package immutable;

//biến final: STACK có thể cập nhật ô nhớ hở heap
//class final: ở heap, không thể cập nhật ô nhớ ở heap(immutable class)
//1 calss cho final thì không thể thừa kế từ nó

public class Ex05Comparsion {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 ="welcome";//-15--> từ h tới w là 15 ký tự
		
		//true if equals
		//false if not equals
		System.out.println("equals: " + s1.equals(s2));//so sánh bằng
		
		//negative: s1<s2
		//zero: s1=s2
		//positive: s1>s2
		System.out.println("COmpareTo: " +s1.compareTo(s2));
	}

}
