package view;

import java.util.ArrayList;

public class bt5 {
	public static int sum(int n) {
		if(n==1) return 1;
		return n + (sum(n-1));
	}
 
// Driver program to test above function
    public static void main(String[] args) {
//        String text  = "abcedeabcdklffjgjkasdaasdasddasdasdsdddddddddddddddddddddddddddadadadsadasdasdasdadasdasdadasdasdadsasdasdasdasdasdasdasdasdasdasdsadasdasdsdasdasdasdasdasdasdasasdadasdasdasdasdasdddsdlfasdasdasdasdasdklskgjlsffksdklgskfslkgflkskdgjfljsdg";
//        String text2 = "abcedcbbckasdasffgkdfewprasdasddadasdasdsdsadsadasdasdasdadtiutyasdadasdasdasadasdasdasdasdasdadasdasdadasdasdasdasddasdasdasdasdasdujgkbnkfldgiyuiflkdhjgflk";
//        System.out.println(text.length());
//        System.out.println((text.length()>text2.length())?getChildString(text2,getAllChild(text)):getChildString(text,getAllChild(text2)));
    //create arr with 2 input text
    	String text1  = "sabddc";
    	String text2  = "abbed";
    	int[][] arr = new int[text1.length()][text2.length()];
    	for (int i = 0; i < text1.length(); i++) {
    		for (int j = 0; j < text2.length(); j++) {
    			if(text1.charAt(i) == text2.charAt(j))
    				arr[i][j] = 1;
    			else
    				arr[i][j] = 0;
    		}
		}
    	printArr(arr);
    	check_Arr(arr);
    	
    }
    
    public static void check_Arr(int arr[][]) {
    	int length = -999;
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = 0; j < arr[i].length; j++) {
    			if(arr[i][j]==0) continue;
    			else {
    				int xstart = i;
    				int ystart = j;
    				if(length<getLongIndex(i, j, arr)) {
    					length = getLongIndex(i, j, arr);
    				}
    			}
    		}
		}
    	System.out.println(length);
    }
    
    public static int getLongIndex(int xStart, int yStart, int arr[][]) {
    	int lenght = 1;
    	for (int i = xStart; i < arr.length; i++) {
    		if(yStart + 1 > arr.length) {
    			break;
    		}
		}
    	return lenght;
    }
    
    public static void printArr(int arr[][]) {
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = 0; j < arr[i].length; j++) {
    			System.out.print(arr[i][j] + " ");
    		}
    		System.out.println("");
		}
    } 
    
    public static String getChildString(String text2, ArrayList<String> listChill) {
    	for (int i = listChill.size()-1; i > 0; i--) {
			if (text2.contains(listChill.get(i)) && listChill.get(i).length()>1){
				return listChill.get(i);
			}
		}
    	return "";
    }
    
    public static ArrayList<String> getAllChild(String text){
    	ArrayList<String> listRs = new ArrayList<String>();
        for (int index = 1; index <= text.length(); index++) {
			for (int i = 0; i < text.length(); i++) {
				if((i+index)>text.length()) continue;
				listRs.add(text.substring(i, i+index));
			}
		}
        return listRs;
    }
}
