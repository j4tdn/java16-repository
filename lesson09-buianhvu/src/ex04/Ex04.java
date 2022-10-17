package ex04;

public class Ex04 {
	
		 
	    public static void main(String[] args) {
	        String str = "xyz";
	        StringBuffer strBuf = new StringBuffer(str);
	        permute(strBuf,str.length());
	    }
	 
	    private static void permute(StringBuffer str, int length){
	 
	        if(length <= 0)
	            System.out.println(str);            
	        else { 
	        	permute(str, length-1);
	            int currPos = str.length()-length;
	            for (int i = currPos+1; i < str.length(); i++) {
	                swap(str,currPos, i);
	                permute(str, length-1);
	                swap(str,i, currPos);
	            }
	        }
	    }
	 
	    private  static void swap(StringBuffer str, int pos1, int pos2){
	        char t1 = str.charAt(pos1);
	        str.setCharAt(pos1, str.charAt(pos2));
	        str.setCharAt(pos2, t1);
	    }
	}   
