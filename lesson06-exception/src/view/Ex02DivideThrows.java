package view;

/*
 * khi 1 hàm bị ngoại lệ, có 2 cách xử lý
 * 1, Bắt lỗi tại hàm đó
 * 2, Ném (throw/throws) ngoại lệ để nơi gọi bắt, xử lý lỗi đó 
 */
public class Ex02DivideThrows {
	public static void main(String[] args) {
		System.out.println("R1 --> " + divide (4,2));
		System.out.println("R2 --> " + divide (5,0));
		System.out.println ( " Finished ... " ) ;

	}
	// Ném tại vị trí khai báo hàm 
	// throws runtime(unchecked) exception -- ) chỗ gọi không bắt buộc xử lý
	// throws compile(checked) exception -- ) chỗ gọi bắt buộc xử lý
		private static int divide ( int a, int b) {
			return a/b;
		}
		
	}


