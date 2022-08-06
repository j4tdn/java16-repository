package bean;

public class Number {
   public int number;//HEAP
   
   public Number(int pValue)//nhận giá trị bên ngoài và gán cho value ở heap
   
   {
	   this.number = pValue;
   }
   
   public String toString()
   {
	   return "" + number;
   }
}
