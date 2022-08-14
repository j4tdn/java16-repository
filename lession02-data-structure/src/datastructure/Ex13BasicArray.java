package datastructure;

public class Ex13BasicArray {
	public static void main(String[] arges) {
		//Mảng là kiểu dữ liệu đối tượng
		//5 là độ dài cuat nảng
		//tạo 1 ô nhớ ở vùng nhớ HEAP lưu 5 giá trị mặc định của kiểu int	
		int[] digist =new int[5];
		
		System.out.println("digist[0] = " +digist[0]);
		System.out.println("digist[2] = " +digist[0]);
		
		//gán giá trị
		digist[1] = 99;
		System.out.println("digist[1] " + digist[1]);
		
		//khởi tạo ô nhớ và giá trị cho mảng
		String[] sequences = {"a" ,"b","c","d"};
		System.out.println("length: " +sequences.length);
	    //for-index[0-length]
		for(int i = 0; i< sequences.length; i++) {
			System.out.println("value: " + sequences[i]);
			
		}
	System.out.println("==============");
	//for-each(element) --> lấy giá trị không quan tâm của chỉ số
	//each tên biến
	for(String each: sequences) {
		System.out.println("each: " + each);
	}
	}
	

}
