package datastructure;

public class Ex13BasicArray {
	public static void main(String[] args) {
		//Mang la kieu du lieu doi tuong
		//5 chinh la do dai` cua mang
		//Tao 1 o nho' o vun`g nho' HEAP luu 5 gia tri mac dinh cua kieu int
		int[] digits = new int[5];
		System.out.println("digist[0] " + digits[0]);
		System.out.println("digist[2] " + digits[2]);
		System.out.println("digist[3] " + digits[3]);
		digits[1] = 99;
		System.out.println("digist[1] " + digits[1]);
		
		//khởi tạo ô nhớ và giá trị cho mảng
		String[] sequences = {"a" , "b" , "c" , "d"};
		System.out.println(sequences.length);
		System.out.println(sequences[0]);
		for (String i : sequences) {
			System.out.println(i);
			
		}
		System.out.println("=======");
		for(int i = 0 ; i < sequences.length ; i ++)
		{
			System.out.println(sequences[i]);
		}
	}

}
