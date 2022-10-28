package declaration;

public class Ex02Loop {
	public static void main(String[] args) {
		String[] devices = { "Glass", "Table", "Laptop" };

		System.out.println("length: " + devices.length);
		devices[2] = "PC";

		for (int i = 0; i < devices.length; i++) {
			System.out.println("devices[" + i + "] = " + devices[i]);
		}
		// for-each
		for (String device : devices) {
			System.out.print(device + " ");
		}
	}
}
