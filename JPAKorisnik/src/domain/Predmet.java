package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PREDMET")
public class Predmet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique =  true)
	private String naziv;
	private int espb;
	@OneToMany(mappedBy = "predmet", orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<Predavanje> predavanja;
	@ManyToMany(mappedBy = "predmeti")
	private Set<StudijskiProgram> studijskiProgrami;
	public Predmet() {
		super();
		predavanja = new HashSet<Predavanje>();
		studijskiProgrami = new HashSet<StudijskiProgram>(); 
	}
	public Predmet(String naziv, int espb) {
		super();
		this.naziv = naziv;
		this.espb = espb;
		predavanja = new HashSet<Predavanje>();
		studijskiProgrami = new HashSet<StudijskiProgram>();
	}
	public Predmet(Long id, String naziv, int espb) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.espb = espb;
		predavanja = new HashSet<Predavanje>();
		studijskiProgrami = new HashSet<StudijskiProgram>();
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
	public int getEspb() {
		return espb;
	}
	public void setEspb(int espb) {
		this.espb = espb;
	}
	public Set<Predavanje> getPredavanja() {
		return predavanja;
	}
	public void setPredavanja(Set<Predavanje> predavanja) {
		this.predavanja = predavanja;
	}
	public Set<StudijskiProgram> getStudijskiProgrami() {
		return studijskiProgrami;
	}
	public void setStudijskiProgrami(Set<StudijskiProgram> studijskiProgrami) {
		this.studijskiProgrami = studijskiProgrami;
	}
	@Override
	public String toString() {
		return "Predmet [id=" + id + ", naziv=" + naziv + ", espb=" + espb + ", predavanja=" + predavanja
				+ ", studijskiProgrami=" + studijskiProgrami + "]";
	}
	
	
	
	
	
	
	

}
