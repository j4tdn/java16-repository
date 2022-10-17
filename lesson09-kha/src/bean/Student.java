package bean;

public class Student {
	private int ID;
	private String Name;
	private Rank rank;
	
	public Student(int id, String name, Rank rank){
		this.ID = id;
		this.Name = name;
		this.rank = rank;
	}
	
	public Rank getRank() {return this.rank;}

	@Override
	public String toString() {
		return "Student : ID=" + ID + ", Name=" + Name;
	}
	
	
}
