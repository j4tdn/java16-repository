package declaration;

import java.util.Arrays;

public class Ex02Loop {
	public static void main(String[] args) {
		String[] devices = {"Glass ", "Laptop" , "Table" };
		System.out.println("length : " + devices.length);
		devices[1] = "PC";
		
		for(int i = 0 ; i < devices.length; i ++) {
			System.out.println("devices [" + i + "] = " + devices[i]);
		}
		
		for (String device : devices) {
			System.out.println(device + " ");
		}
		System.out.println("================");
		Arrays.asList(devices).forEach(o -> System.out.println(o));
	}

}
