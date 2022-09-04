package bean;

public class Student {
    private int id;
    private String name;
    private float theoryMark, practiceMark;

    public Student(){

    }

    public Student(int id, String name, float theoryMark, float practiceMark) {
        this.id = id;
        this.name = name;
        this.theoryMark = theoryMark;
        this.practiceMark = practiceMark;
    }

    public int getId() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public float getTheoryMark() {
        return theoryMark;
    }

    public Student setTheoryMark(float theoryMark) {
        this.theoryMark = theoryMark;
        return this;
    }

    public float getPracticeMark() {
        return practiceMark;
    }

    public Student setPracticeMark(float practiceMark) {
        this.practiceMark = practiceMark;
        return this;
    }

    public float getAverageMark(){
        return (this.getPracticeMark() + this.getTheoryMark()) / 2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theoryMark=" + theoryMark +
                ", practiceMark=" + practiceMark + ", average= " + this.getAverageMark()+"}";
    }

}
