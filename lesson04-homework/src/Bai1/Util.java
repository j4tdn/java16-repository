package Bai1;

public class Util {
	public static float score(Students Impor) {
		return (float) ((Impor.getMarksTheory() + Impor.getMarksPractice())/2);
	}

	public static void averageOverEight(Students[] Imports) {
		for (Students Impor : Imports) {
			if (score(Impor) > 8.5)
				System.out.println(Impor);
		}
	}

	public static void practiceThanTheory(Students[] Imports) {
		for (Students Impor : Imports) {
			if (Impor.getMarksTheory() < Impor.getMarksPractice())
				System.out.println(Impor);
		}
	}
}
