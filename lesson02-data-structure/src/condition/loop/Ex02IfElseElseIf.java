package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {
 public static void main ( String[] args ) {
	 Random rd = new Random();
	  int seconRandom = rd.nextInt(10);
	  System.out.println(" Diem " + seconRandom);
	  if(seconRandom<5) {
		  System.out.println(" hoc luc yeu");
	  }else if( seconRandom >5 && seconRandom <8){
		  System.out.println(" Hoc luc kha");
	  }
	  else{
		  System.out.println(" Hoc luc gioi");
	  }
  }

}
