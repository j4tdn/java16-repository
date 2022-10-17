
public class Ex01 {
	public static void main(String[] args) {
		String s = "ký tự tiếng việt có dấu";
		// Mỗi kí tự trên một dòng
		String s1 = s.replaceAll("\\s+", "");
		for (int i = 0; i < s1.length(); i++) {
			System.out.println("s" + i + ": " + s1.charAt(i));
		}
		System.out.println("===============");
		// Mỗi từ trên mỗi dòng
		String[] s2 = s.split("\\s", s.length());
		for (int i = 0; i < s2.length; i++) {
			System.out.println("s2[" + (i + 1) + "] word: " + s2[i]);
		}
		System.out.println("===============");
		// Chuỗi đảo ngược theo kí tự
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.println("s" + i + ": " + s1.charAt(i));
		}
		System.out.println("===============");
		// Chuỗi đảo ngược theo từ
		for (int i = s2.length -1; i >=0; i--) {
			System.out.println("s2[" + (i + 1) + "] word: " + s2[i]);
		}

	}
}
