package declaration;

public class Ex02Loop {
	public static void main(String[] args) {
		String[] devices = { "Glass", "Computer", "Desk" };

		System.out.println("devices: " + devices.length);
		devices[1] = "PC";

		// for-index
		for (int i = 0; i < devices.length; i++) {
			System.out.println("devices[" + i + "] = " + devices[i]);
		}
		
		System.out.println("========================");
		
		// for-each
		for(String device: devices) {
			System.out.println(device + "");
		}
	}
}
