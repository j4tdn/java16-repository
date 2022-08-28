package bean;

public class Rectangle {

	// atributes giốnng biến 
		private int width;
		private int height;
		
		public Rectangle() {
			
		}
		// 
		public Rectangle(int width, int height) {
			 this.width = width;
			 this.height = height;
			 // this.width là this trên public int width
			 
		}
		// getter setter
		
		public int getWidth() {
			return width;
		}
		
		// 
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return this.width+", " + height;
		}
}
