package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ISPIT")
public class Ispit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date datum;
	private int ocena;
	@ManyToOne
	@JoinColumn(name = "PREDAVANJE_ID",referencedColumnName = "ID")
	private Predavanje predavanje;
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID",referencedColumnName = "ID")
	private Student student;
	public Ispit() {
		super();
	}
	public Ispit(Date datum, int ocena, Predavanje predavanje, Student student) {
		super();
		this.datum = datum;
		this.ocena = ocena;
		this.predavanje = predavanje;
		this.student = student;
	}
	public Ispit(Long id, Date datum, int ocena, Predavanje predavanje, Student student) {
		super();
		this.id = id;
		this.datum = datum;
		this.ocena = ocena;
		this.predavanje = predavanje;
		this.student = student;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public Predavanje getPredavanje() {
		return predavanje;
	}
	public void setPredavanje(Predavanje predavanje) {
		this.predavanje = predavanje;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Ispit [id=" + id + ", datum=" + datum + ", ocena=" + ocena + ", predavanje=" + predavanje + ", student="
				+ student + "]";
	}
	
	

}
