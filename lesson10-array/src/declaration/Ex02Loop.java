package declaration;

public class Ex02Loop {
	public static void main(String[] args) {
		String[] devices = { "Glass", "Laptop", "Table" };
		System.out.println("length: " + devices.length);
		devices[1] = "PC";

		// FOR-INDEX
		for (int i = 0; i < devices.length; i++) {
			System.out.println("devices[" + i + "] = " + devices[i]);
		}
		
		System.out.println("===========================");

		// FOR-EACH
		for (String device : devices) {
			System.out.print(device + " ");
		}
	}
}
