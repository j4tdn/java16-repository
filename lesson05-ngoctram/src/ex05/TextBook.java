package ex05;

public class TextBook extends Book{
	private boolean state;
	// true-new, false-secondhand
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}
	
	public TextBook(boolean state) {
		super();
		this.state = state;
	}
	
	public TextBook(String id, int price, String publisher, boolean state) {
		super(id, price, publisher);
		this.state = state;
	}
	
	public boolean getState() {
		return state;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "TextBook [state=" + state + "]";
	}
}
