package example;

public class MouseAppdemo {

	public static void main(String[] args) {
		MouseEvent ev = new MouseClickEvent() {
			
			@Override
			public void onMousePress() {
				System.out.println("press");
				
			}
		};
		button(ev);
		
	}
	private static void button(MouseEvent event) {
		event.onMousePress();
		
	}
}
