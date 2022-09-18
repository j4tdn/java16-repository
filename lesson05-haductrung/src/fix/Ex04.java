package fix;

import java.util.Arrays;

import bean.NbStas;

//trả về mảng đối tượng
//mỗi phần tử(đối tượng) có 2 thuộc tính là giá trị và số lượng

public class Ex04 {
	public static void main(String[] args) {
		int[] numbers = { 3, 15, 21, 0, 15, 17, 21 };
		int[] result = printf(numbers);
		Arrays.sort(result);// sort ascending
		System.out.println(Arrays.toString(result));

	}

	private static int[] printf(int[] numbers) {
		int[] validNumbers = new int[numbers.length];
		int k = 0;
		NbStas[] nbStases = groupBy(numbers);
		for (NbStas nbStas : nbStases) {
			if (nbStas.getCount() == 1) {
				validNumbers[k++] = nbStas.getNumber();
			}
		}
		return Arrays.copyOfRange(validNumbers, 0, k);

	}

	// class:Nbstars: number,count
	// NbStars[numbers.length]: (3,1),(15,1)
	// Loop element in numbers
	// trả về 1 mảng NbStas
	private static NbStas[] groupBy(int[] numbers) {
		NbStas[] nbstars = new NbStas[numbers.length];
		int k = 0;// số lượng phần tử khác null
		for (int number : numbers) {
			int indexOf = indexOf(nbstars, number, k);
			if (indexOf == -1) {// nếu giá trị number đã tồn tại trong mảng nbstars thì cho cộng 1 lên
				nbstars[k++] = new NbStas(number, 1);
				// count ++
			} else {// chưa tồn tại thì add vô và cho count=1
					// add, count =1
				nbstars[indexOf].plusCount();// setCount(nbstars[indexOf].getCount() + 1);// set lại giá trị =count hiện
												// tại +1
			} // nbstars của indexOf là đối tượng nbstars .setCount=nbstars.getCount+1
		}
		return Arrays.copyOfRange(nbstars, 0, k);// in ra mảng từ phần tử 0 tới k copy[0,k)

	}

	// i>=0--> số tồn tại trong nbstars
	// i=-1--> 0 tồn tại
	// indexOf: tìm vị trí xuất hiện đầu tiên của số đề cho trong mảng
	// có thì trả về số, không xuất hiện thì trả về -1
	private static int indexOf(NbStas[] nbstars, int number, int nonNullElement) {
		for (int i = 0; i < nonNullElement; i++) {
			if (nbstars[i].getNumber() == number) {// nếu nbstars[ thứ i]==number truyền vào thì trả về true
				return i;
			}

		}
		return -1;// number không tồn tại trong nbstars
	}

}
