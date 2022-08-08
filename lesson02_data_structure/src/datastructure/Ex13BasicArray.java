package datastructure;

import javax.sound.midi.Sequence;

public class Ex13BasicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mảng là kiểu dữ liệu đối tượng
		// 5 là độ dài length của mảng
		//tạo 1 ô nhớ ở vùng nhớ heap lưu 5 giá trị mặc định của kiểu int
		int [] digits = new int[5];
		System.out.println("degits[0]="+digits[0]);
		System.out.println("degits[2]="+digits[0]);
		
		
		//giá giá trị
		digits[1] =99;
		System.out.println("digits[1]="+digits[1]);
		
		//khởi tạo ô nhớ và giá trị cho mảng
		String[] sequences = {"a","b","c","d"};
		System.out.println("length:"+sequences.length);
		
		
		for(int i=0;i<sequences.length;i++) {
			System.out.println("value:"+sequences[i]);
		}
		//for each -->lấy giá trị không quan tâm chỉ số 
		System.out.println("=========");
		for(String each:sequences) {
			System.out.println("each:"+each);
		}
		//Từ khóa break,continue trong vồng lặp.
	}

}
