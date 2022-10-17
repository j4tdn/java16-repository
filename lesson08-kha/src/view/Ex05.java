package view;

public class Ex05 {
	public static void main(String[] args) {
		String S1 = "ABCDDEASDAFSFDSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSDSADASDAFDSFASDSAFSGDAAFGDFSFGFSDFFGKDFSJGDHJKJSJAKFDKSFHSJKDFJKSDLKFHDSJKFSDFJKSDFHSJKDFSDFDSLAKSDLFIUEUGIJDKVNFIIKFHASJKDLIASJFUIIYAEIKFASJVXVJCXBCD";
		String S2 = "ABCDDCABCDDJJSHFKFJERIEJSDMBCXGHRUEWOSLRDFJSADJKFFFFFFFFFFFWWWWWWWWWWWWWWWWWWWWWWWWEISAOSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSFHJDSKLFJSDFUSG";
		System.out.println(S1.length());
		System.out.println(S1.length() > S2.length() ? listChild(S1, S2) : listChild(S2, S1));
	}
	
	private static String listChild(String s, String s2) {
		for (int i = s.length()-1; i >= 0; i--) {
			for (int j = 0; j < s.length(); j++) {
				if( (i+j) > s.length() - 1 ) 
					break;
				String child = s.substring(j, j+i+1);
				if(s2.contains(child)) {
					return child;
				}
				
			}
		}
		return "";
	}
}
