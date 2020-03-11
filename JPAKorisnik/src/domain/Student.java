package domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student extends Korisnik{
	@Column(unique =  true)
	private String indeks;
	private Date datum_rodj;
	@OneToOne
	@JoinColumn(name = "STUD_PROG_ID")
	private StudijskiProgram studijskiProgram;
	@OneToMany(mappedBy = "student", orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<Ispit> ispiti;
	public Student(String indeks, Date datum_rodj, StudijskiProgram studijskiProgram) {
		super();
		this.indeks = indeks;
		this.datum_rodj = datum_rodj;
		this.studijskiProgram = studijskiProgram;
		ispiti = new HashSet<Ispit>();
	}
	public Student() {
		super();
		ispiti = new HashSet<Ispit>();
	}
	public String getIndeks() {
		return indeks;
	}
	public void setIndeks(String indeks) {
		this.indeks = indeks;
	}
	public Date getDatum_rodj() {
		return datum_rodj;
	}
	public void setDatum_rodj(Date datum_rodj) {
		this.datum_rodj = datum_rodj;
	}
	public StudijskiProgram getStudijskiProgram() {
		return studijskiProgram;
	}
	public void setStudijskiProgram(StudijskiProgram studijskiProgram) {
		this.studijskiProgram = studijskiProgram;
	}
	public Set<Ispit> getIspiti() {
		return ispiti;
	}
	public void setIspiti(Set<Ispit> ispiti) {
		this.ispiti = ispiti;
	}
	@Override
	public String toString() {
		return "Student [indeks=" + indeks + ", datum_rodj=" + datum_rodj + ", studijskiProgram=" + studijskiProgram
				+ ", ispiti=" + ispiti + "]";
	}
	
	
	
	
	

}
