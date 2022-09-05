package ex05;

public class Util {
	public static void PublishKIMDONG(Textbook... textbook) {
		for(Textbook in: textbook) {
			if(in.getPublish()=="NHIDONG") {
				System.out.println(in.toString());
			}
		}
	}
	public static void PublishKIMDONG2(ReferenceBook ...referenceBooks) {
		for(ReferenceBook in: referenceBooks) {
			if(in.getPublish()=="NHIDONG") {
				System.out.println(in.toString());
			}
		}
	}
	


}
