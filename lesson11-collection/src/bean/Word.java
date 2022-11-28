package bean;

public class Word {
	private String wordEn;
	private String wordVi;
	private String wordType;
	private String text;
	public String getWordEn() {
		return wordEn;
	}
	public void WordEn(String wordEn) {
		this.wordEn = wordEn;
	}
	public String getWordVi() {
		return wordVi;
	}
	public void setWordVi(String wordVi) {
		this.wordVi = wordVi;
	}
	public String getWordType() {
		return wordType;
	}
	public void setWordType(String wordType) {
		this.wordType = wordType;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Word(String wordEn, String wordVi, String wordType, String text) {
		super();
		this.wordEn = wordEn;
		this.wordVi = wordVi;
		this.wordType = wordType;
		this.text = text;
	}
	@Override
	public String toString() {
		return "Word [wordEn=" + wordEn + ", wordVi=" + wordVi + ", wordType=" + wordType + ", text=" + text + "]" + "\n";
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
        if(! (o instanceof CD)) return false;
        Word that = (Word)o;
        return this.getWordEn() == that.getWordEn();
	}
	
	
	

}
