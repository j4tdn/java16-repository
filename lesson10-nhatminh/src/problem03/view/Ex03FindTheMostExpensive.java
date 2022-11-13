package problem03.view;

import java.util.Arrays;
import java.util.Comparator;

import problem03.dto.Product;

public class Ex03FindTheMostExpensive {
	public static void main(String[] args) {
		Product[] productList = getProductList();
		Product[] result = getTheMostExpensivePerStore(productList);
		System.out.println(Arrays.toString(result));
	}

	private static Product[] getProductList() {
		return new Product[] { new Product(1, "A", 25, 101), new Product(2, "B", 90, 102), new Product(3, "C", 88, 102),
				new Product(4, "D", 40, 101), new Product(5, "E", 60, 102), new Product(6, "F", 19, 101) };
	}

	private static Product[] getTheMostExpensivePerStore(Product[] productList) {
		if (productList.length == 0 || productList.length == 1)
			return getCloneList(productList);
		Product[] cloneList = getCloneList(productList);
		Product[] result = new Product[productList.length];
		Arrays.sort(cloneList, Comparator.comparing(Product::getStoreId).thenComparing(Product::getSalesPrice));
		int k = 0;
		for (int i = 0; i < cloneList.length - 1; i++)
			if (cloneList[i].getStoreId() != cloneList[i + 1].getStoreId())
				result[k++] = cloneList[i];
		result[k++] = cloneList[cloneList.length - 1];
		return Arrays.copyOfRange(result, 0, k);
	}

	private static Product[] getCloneList(Product[] productList) {
		Product[] result = new Product[productList.length];
		int i = 0;
		for (Product p : productList)
			result[i++] = p;
		return result;
	}
}
