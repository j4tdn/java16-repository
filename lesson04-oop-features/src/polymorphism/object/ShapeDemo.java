package polymorphism.object;

/*
 * đa hình
 */

public class ShapeDemo {
      public static void main(String[] args) {
    	  System.out.println("===Shape===");
    	  Shape shape = new Shape();
    	  shape.draw();
    	  shape.calS();
    	  
    	  System.out.println("===Rectange===");
    	  Rectangle rectangle =new Rectangle();
    	  rectangle.draw();
    	  rectangle.calS();
    	  
    	  System.out.println("===Square===");
    	  Square square = new Square();
    	  square.draw();
    	  square.calS();
    	  
    	  System.out.println("******************");
    	  
    	  //compile: S1-->Shape
    	  //runtime: S1--> rectangle
    	  Shape s1 = new Rectangle();
    	  s1.draw();
    	  s1.calS();
    	  
    	  //compile: S1-->Shape
    	  //runtime: S1--> rectangle
    	  Shape s2 =new Square();
    	  s2.draw();
    	  s2.calS();
    	  
    	  s1=s2;
    	  
    	  //TH1: giúp tạo ra 1 mảng tập hợp các kiểu dữ liệu cha, con vào 1 tập hợp dễ dàng
    	  //đỡ phải tạo riêng nhiều mảng nếu không có kế thừa từ class Shape
    	  Shape[] shapes = {s1, s2, shape, rectangle, square};
    	  for(Shape shapeItem: shapes) {
    		  shapeItem.draw();
    		  shapeItem.calS();
    		  
    		//if (shapeItem instenceof Square) kiểm tra 1 biến lúc runtime xem có phải là 1 class nào không
    		  if(shapeItem != null && shapeItem.getClass()==Square.class) {
    			  Square runtimeShape =(Square)shapeItem;
    			  runtimeShape.clear();
    		  }
    	  }
    	  //TH2: dễ dàng chuyển đổi(trong phạm vi các class con) KDL lúc runtime
    	  s1 =s2;
    	  s2=s1;
	
  }
}
