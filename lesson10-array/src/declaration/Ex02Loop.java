package declaration;

public class Ex02Loop {
	public static void main(String[] args) {

		String[] deveces = {"Glass", "Laptop", "Table"};
		System.out.println("Length: " + deveces.length);
		System.out.println("-----------------------");
		
		deveces[1] = "PC";
		
		//for - index
		for(int i = 0 ;i<deveces.length;i++)
		{
			System.out.println("devices[" + i+"] = " + deveces[i]);
		}
		System.out.println("-----------------------");
		//for-each
		for(String devece: deveces)
		{
			System.out.print(devece + " ");
		}
		
	}
}
