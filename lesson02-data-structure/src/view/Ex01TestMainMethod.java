package view;

  public class Ex01TestMainMethod{
	  
     // data structure:attributes,variables
      // algorithm:functions,methods
      public static void main(String[]args){
          System.out.println("Main method");
         // System.out.println("Fake main method");
          anotherMainMethod();
     }
      // declaration
      private static void anotherMainMethod(){
          System.out.println("Fake main method");
          
     }
  }
  