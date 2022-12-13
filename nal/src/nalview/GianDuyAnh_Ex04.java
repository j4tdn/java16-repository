package nalview;

public class GianDuyAnh_Ex04 {
	public static void main(String[] args) {
		Object a[] = {0,5,6,7,4,6,7,5,3};
		System.out.println(createPhoneNumber(a));
	}
	private static String createPhoneNumber(Object a[] ) {
		String s = "";
		for (int i = 0; i < a.length; i++) {
			s = s.concat((String) a[i]);
		}		
		return s;
	}

}
