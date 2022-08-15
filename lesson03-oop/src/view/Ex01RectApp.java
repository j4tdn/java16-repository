package view;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		Rectangle ob = new Rectangle(10, 5);
		
		System.out.println("ob: " + ob);

		Rectangle ob1 = new Rectangle(11, 12);
		
		System.out.println("ob1 : " + ob1.getHeight() + "," + ob1.getWidth());

		System.out.println("ob1.tosting: " + ob1);
		ob1.setWidth(10);
		ob1.setHeight(20);
		System.out.println("ob1:" + ob1);

		Rectangle ob2 = new Rectangle(30, 12);

		System.out.println("ob2: " + ob2);
		ob2.setHeight(35);
		System.out.println("ob2: " + ob2);
		
		//nhung~ thuoc tinh non static attributes thuoc pham vi cua doi tuong ( ben ngoai class k xai` duoc)
	    // ==> doi tuong(bien) de goi nhung thuoc tinh non-static
		// ==> lop(class) khong goi duoc
		

	}

}
