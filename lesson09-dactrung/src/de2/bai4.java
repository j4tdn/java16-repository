package de2;

public class bai4 {
	
	public static void main(String[] args) throws Exception {
		String str = "xyz";
		StringBuffer strBuf = new StringBuffer(str);
		System.out.println("Output: ");
		perm(strBuf, str.length());
	}

	private static void perm(StringBuffer str, int index) {
		if (index <= 0)
			System.out.println(str);
		else {
			perm(str, index - 1);
			int currPos = str.length() - index;
			for (int i = currPos + 1; i < str.length(); i++) {
				swap(str, currPos, i);
				perm(str, index - 1);
				swap(str, i, currPos);
			}
		}
	}

	private static void swap(StringBuffer str, int pos1, int pos2) {
		char t1 = str.charAt(pos1);
		str.setCharAt(pos1, str.charAt(pos2));
		str.setCharAt(pos2, t1);
	}
}
