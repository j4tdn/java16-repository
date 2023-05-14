package persistence;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "result")
public class Result {
	@EmbeddedId
	private Id id;
	
	@Column(name="score")
	private Integer score;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false)
	private Student student;
	
	public Result() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Result(Id id, Integer score, Student student) {
		super();
		this.id = id;
		this.score = score;
		this.student = student;
	}


	public Id getId() {
		return id;
	}


	public void setId(Id id) {
		this.id = id;
	}


	public Integer getScore() {
		return score;
	}


	public void setScore(Integer score) {
		this.score = score;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Embeddable
	public static class Id implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		@Column(name="student_id")
		private String studentId;
		@Column(name="subject")
		private String subject;
		
		public Id() {
			// TODO Auto-generated constructor stub
		}
		
		public Id(String studentId, String subject, Integer score) {
			super();
			this.studentId = studentId;
			this.subject = subject;
		}

		public String getStudentId() {
			return studentId;
		}

		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}
		
	}
}
