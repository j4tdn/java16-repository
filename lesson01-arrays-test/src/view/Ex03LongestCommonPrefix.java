package view;

public class Ex03LongestCommonPrefix {
public static void main(String[] args) {
	String[] a = {"xlower","flow","floght"};
	//System.out.println(longestCommonPrefix(a));
	System.out.println(strStr("sadbutsad", "sad"));
}
public static String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
        return "";
    }
    
    String prefix = strs[0];
    
    for (int i = 1; i < strs.length; i++) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            
            if (prefix.isEmpty()) {
                return "";
            }
        }
    }
    
    return prefix;
}

public static int strStr(String haystack, String needle) {
    return haystack.indexOf(needle);
}
}
