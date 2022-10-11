package immutable;

public class Ex03Manipulation {
	public static void main(String[] args) {
		String s = "hello all, hope you enjoy";
		// Kiem tra chuoi s1 co phai la chuoi bat dau, ket thuc trong chuoi s khong
		String s1 = "hello";
		System.out.println("is a starts with s1 ? " + s.startsWith(s1));
		System.out.println("is a ends with s1 ? " + s.endsWith(s1));
		
		// Thay the chuoi s1 = s2 trong chuoi s
		String s2 = "hi";
		System.out.println("replace: " + s.replace(s1, s2));
		
		// Loai bo cac khoang trang cua s3
		// Cho nao co nhieu space, that the bang 1 space
		s = "     hello     all, hope   you enjoy";
		s = s.trim().replaceAll("\\s+", " ");
		System.out.println("remove redundant space: " + s);
		
		// Tao chuoi s4 tu s bat dau tu vi tri so 2
		// subString(startInclisive, endExclusive) 
		System.out.println("substring: " +s.substring(2));
		
		// Xac dinh chuoi s2 co ton tai trong chuoi s1 khong
		System.out.println("contains:" + s.contains("you2"));
	}
}
