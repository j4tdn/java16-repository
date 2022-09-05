package library;

public class LibraryApp extends Company {
	public static void main(String[] args) {
		Company sgk1 = new TextBook("SGK01", 120, "KIMDONG","CU");
		Company sgk2 = new TextBook("SGK02", 250, "KIMDONG","MOI");
		Company sgk3 = new TextBook("SGK03", 20, "KIMDONG","MOI");
		
		Company stk1 = new ReferenceBooks("STK01", 10, "DUYANH", 5);
		Company stk2 = new ReferenceBooks("STK02", 150, "KIMDONG", 10);
		Company arr[] = {sgk1, sgk2, sgk3, stk1, stk2};
		Company arr1[] = {sgk1, sgk2, sgk3};
		System.out.println(sgk1.toString());
		
		for(int i = 0 ; i < arr.length ; i ++)
		{
			arr[i].getAllCompany();
			
		}
		for(int i = 0 ; i < arr.length ; i ++)
		{
			arr[i].getAllBookLessThan50();
			
			
		}
		for(int i = 0 ; i < arr1.length ; i ++)
		{
			arr1[i].textBooksPrice100To200();
			
			
		}
		
		
		
		
		
		
		
		
	}

	

}
