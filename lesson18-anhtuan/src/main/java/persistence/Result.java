package persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "result")
public class Result {
	
	@Id
	@Column(name = "student_id")
	private int student_id;
	@Id
	@Column(name = "subject")
	private String subject;
	@Column(name = "score")
	private Double score;
	
	public Result() {
		// TODO Auto-generated constructor stub
	}

	public Result(int student_id, String subject, Double score) {
		super();
		this.student_id = student_id;
		this.subject = subject;
		this.score = score;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Result [student_id=" + student_id + ", subject=" + subject + ", score=" + score + "]";
	}
	

}
