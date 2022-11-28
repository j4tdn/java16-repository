package declaration;

public class Ex02Loop {
	public static void main(String[] args) {
		String[] devices = {"Glass", "Computer", "Table"};
		
		System.out.println("length"+devices.length);
		devices[1]="PC";
		//for-index
		for(int i=0;i<devices.length;i++) {
			System.out.println("devices"+"["+i+"]"+devices[i]);
		}
		
		//for-each
		for(String device : devices) {
			System.out.print(device+" ");
		}
	}
}
