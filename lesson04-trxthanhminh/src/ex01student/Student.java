package ex01student;

public class Student {
	int id;
	String name;
	float theoryPoint;
	float practicePiont;
	
	
public Student() {
}


public Student(int id, String name, float theoryPoint, float practicePiont) {
	this.id = id;
	this.name = name;
	this.theoryPoint = theoryPoint;
	this.practicePiont = practicePiont;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public float getTheoryPoint() {
	return theoryPoint;
}


public void setTheoryPoint(float theoryPoint) {
	this.theoryPoint = theoryPoint;
}


public float getPracticePiont() {
	return practicePiont;
}


public void setPracticePiont(float practicePiont) {
	this.practicePiont = practicePiont;
}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", theoryPoint=" + theoryPoint + ", practicePiont=" + practicePiont
			+ "]";
}

public float gpa() {
	return(this.theoryPoint + this.practicePiont)/2;
}




}

