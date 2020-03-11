package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "STUDIJSKI_PROGRAM")
public class StudijskiProgram {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String naziv;
	@ManyToMany
	@JoinTable(name = "STUDPROG_PREDMET", joinColumns = {
			@JoinColumn(name = "SMER_ID", referencedColumnName = "ID") }, inverseJoinColumns = {
					@JoinColumn(name = "PREDMET_ID", referencedColumnName = "ID") })
	private Set<Predmet> predmeti;
	public StudijskiProgram() {
		super();
		predmeti = new HashSet<Predmet>();
	}
	public StudijskiProgram(Long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
		predmeti = new HashSet<Predmet>();

	}
	public StudijskiProgram(String naziv) {
		super();
		this.naziv = naziv;
		predmeti = new HashSet<Predmet>();

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Set<Predmet> getPredmeti() {
		return predmeti;
	}
	public void setPredmeti(Set<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
	@Override
	public String toString() {
		return "StudijskiProgram [id=" + id + ", naziv=" + naziv + ", predmeti=" + predmeti + "]";
	}
	
	
	
	
	
	
	
	

}
