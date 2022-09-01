package example;

public class MouseAppDemo {

	public static void main(String[] args) {
		MouseEvent event = new MouseEvent() {
			
			@Override
			public void onMouseRelease() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onMousePress() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onMouseEnter() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onMouseClick() {
				// TODO Auto-generated method stub
				
			}
		};
		button(event);
	}
	
	private static void button(MouseEvent event) {
		event.onMousePress();
	}

}
