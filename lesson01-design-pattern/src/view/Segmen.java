package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Segmen {
	  private static final Map<Integer, Integer> encodings =
		        new HashMap<Integer, Integer>();

		    static {
		        encodings.put(0, 0x7E);
		        encodings.put(1, 0x30);
		        encodings.put(2, 0x6D);
		        encodings.put(3, 0x79);
		        encodings.put(4, 0x33);
		        encodings.put(5, 0x5B);
		        encodings.put(6, 0x5F);
		        encodings.put(7, 0x70);
		        encodings.put(8, 0x7F);
		        encodings.put(9, 0x7B);
		    }

		    public static void main(String[] args) throws Exception {
		        Scanner sc = new Scanner(System.in);
		        System.out.println();
		        int i = sc.nextInt();
		            printDigit(i);
		        }
		    

		    public static void printDigit(int digit) {
		        int code = encode(digit);
		        char[] bits =
		            String.format("%7s", Integer.toBinaryString(code))
		                .replace(' ', '0').toCharArray();

		        lightSegment(bits[0] == '1', " *** \n", "   \n");  
		        if(bits[5] == '1' && bits[1] == '1') {
		        	printLeftRight();
		        }
		        else if(bits[5] == '1') {
		        	printOneLeft();
		        }
		        else printOneRight();

		        lightSegment(bits[6] == '1', " *** \n", "     \n");
		        
		        if(bits[4] == '1' && bits[2] == '1') {
		        	printLeftRight();
		        }
		        else if(bits[4] == '1') {
		        	printOneLeft();
		        }
		        else printOneRight();
		        lightSegment(bits[3] == '1', " *** \n", "     \n");
		    }  
			static void printOneLeft() {
				System.out.print("*\n*\n*\n");
			}
			static void printOneRight() {
				System.out.print("    *\n    *\n    *\n");
			}
			static void printLeftRight() {
				System.out.print("*   *\n*   *\n*   *\n");
			
		    }

		    private static void lightSegment(boolean on, String onValue, String offValue) {
		        System.out.print(on ? onValue : offValue);
		        try {
		            Thread.sleep(100);
		        }
		        catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		    }

		    private static int encode(int digit) {
		        return encodings.containsKey(digit) ? encodings.get(digit) : 0x00;
		    }
}
