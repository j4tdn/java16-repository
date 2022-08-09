package datastructure;

public class Ex10ObjectTypeDiff {

	public static void main(String[] args) {
		String a1 = "hello";
		String a2 = "welcome";
		String a3 = "hello";
		System.out.println("a1 hesh:" + System.identityHashCode(a1));
		System.out.println("a2 hesh:" + System.identityHashCode(a2));
		System.out.println("a3 hesh:" + System.identityHashCode(a3));
		a3 = "welcome";
		System.out.println("a3 hesh:" + System.identityHashCode(a3));
		System.out.println("==============================");
		String b1 = new String("hello");
		String b2 = new String("welcome");
		String b3 = new String("hello");
		System.out.println("b1 hesh:" + System.identityHashCode(b1));
		System.out.println("b2 hesh:" + System.identityHashCode(b2));
		System.out.println("b3 hesh:" + System.identityHashCode(b3));
		
	}

}
