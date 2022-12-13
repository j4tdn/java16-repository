package nalview;

public class GianDuyAnh_Ex03 {
	public static void main(String[] args) {
		String s   = "the-stealth-warrior";
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.contains("-") || s.contains("_")) {
				s = s.replace("-", "");
			}
		}
		System.out.println(s);
	}

}
