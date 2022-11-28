package work;

import java.util.ArrayList;
import java.util.List;

import bean.CD;
import bean.Word;

public class TranslateDemo {

	public static void main(String[] args) {
		
		List<Word> words = getWords();
		Word word1 = new Word("Hi", "Xin Chao", "xx", "cau xin chao12323"); 
		add(words, word1);
		System.out.println(words);
		System.out.println("===================");
		searchforEnglish(words, "Hello");
	}
	private static void searchforEnglish(List<Word> list , String s) {
		list.stream().filter(o -> s.contains(o.getWordEn())).forEach(o -> System.out.println(o));
	}
	private static void add(List<Word> list, Word word) {
		 if(word.equals(list) == false) {
		    	System.out.println("data already available");
		    }
		    else {
		    	list.add(word);
			}
	}
	private static List<Word> getWords() {
		List<Word> words = new ArrayList<>();
		words.add(new Word("Hello", "Xin Chao", "xx", "cau xin chao"));
		words.add(new Word("Bad", "Te", "xx", "Che"));
		words.add(new Word("Good", "Tot", "xxx", "Khen"));
		words.add(new Word("France", "Phap", "xx", "Doi tuyen quoc gia"));
		words.add(new Word("translate", "dich", "xx", "dich"));
		words.add(new Word("baby", "em be", "xx", "kkkkkk"));
		return words;
		
	}
}


