package example;

public class MouseAppDemo {

	public static void main(String[] args) {
		MouseEvent e = new MouseClickEvent() {
			
			@Override
			public void onMouseClick() {
				System.out.println("Open Popup Menu");
			}
		};
		button(e);
			
			
	}
	
	private static void button(MouseEvent e) {
		e.onMouseClick();
	}

}
