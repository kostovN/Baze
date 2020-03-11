package domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PREDAVANJE")
public class Predavanje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "PREDMET_ID",referencedColumnName = "ID")
	private Predmet predmet;

	@ManyToOne
	@JoinColumn(name = "PROFESOR_ID",referencedColumnName = "ID")
	private Profesor profesor;
	
	@OneToMany(mappedBy = "predavanje", orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<Ispit> ispiti;

	public Predavanje() {
		super();
		ispiti = new HashSet<Ispit>();
	}

	public Predavanje(Predmet predmet, Profesor profesor) {
		super();
		this.predmet = predmet;
		this.profesor = profesor;
		ispiti = new HashSet<Ispit>();
	}

	public Predavanje(Long id, Predmet predmet, Profesor profesor) {
		super();
		this.id = id;
		this.predmet = predmet;
		this.profesor = profesor;
		ispiti = new HashSet<Ispit>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Set<Ispit> getIspiti() {
		return ispiti;
	}

	public void setIspiti(Set<Ispit> ispiti) {
		this.ispiti = ispiti;
	}

	@Override
	public String toString() {
		return "Predavanje [id=" + id + ", predmet=" + predmet + ", profesor=" + profesor + ", ispiti=" + ispiti + "]";
	}
	
	
	
	
	
	

}
