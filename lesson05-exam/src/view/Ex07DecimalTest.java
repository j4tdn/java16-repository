package view;

public class Ex07DecimalTest {
	public static void main(String[] args) {
		// Tìm phân số tối giản được tạo ra từ số thập phân
		// 0.1    1/10
		// 0.2    2/10 1/10
		// 0.25   25/100
		// 0.4    4/10
		// 0.005  5/1000
		// 1.0    10/10 
		// 1.2    12/10     
		// 12.5   125/10

		// B1: Nhập số thập phân --> KDL double, float
		// B2: Chuyển đổi sang String "0.125"
		// B3: String[] sequences = "0.125".split("\\.")
		// B4: sequences[1] + "/" +  Math.pow(10, sequences[1].length) --> 125/1000
		// B5: Rút gọn về phân số tối giản
	}
}
