package view;

import java.util.Stack;

public class Ex04ValidParthener {
	public static void main(String[] args) {
		Finonaci();

	}

	public static void Finonaci() {
		// 0,1,1,2,3,5,8,..........
		int num0 = 0;
		int num1 = 1;
		int sumFb = 1;

		String s = num0 + "," + num1 + ",";

		while (num1 < 1000) {
			int temp = num1;
			num1 += num0;
			num0 = temp;

			if (num1 < 1000) {
				s = s + num1 + ",";
				sumFb += num1;

			}
		}

		String b = s.replaceAll("^,|,$", "");
		System.out.println("Day Fibonaci :" + b);
		System.out.println("Tong cua day :" + sumFb);
		
	}
	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Đẩy dấu mở ngoặc vào stack
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // Không có dấu mở ngoặc tương ứng trong stack
                }
                char top = stack.pop(); // Lấy dấu mở ngoặc cuối cùng từ stack
                
                if ((c == ')' && top != '(')
                        || (c == '}' && top != '{')
                        || (c == ']' && top != '[')) {
                    return false; // Dấu đóng ngoặc không tương ứng với dấu mở ngoặc
                }
            }
        }
        
        return stack.isEmpty(); // Stack phải rỗng sau khi kiểm tra xong biểu thức
    }
	
}
