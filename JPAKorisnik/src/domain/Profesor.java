package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PROFESOR")
public class Profesor extends Korisnik{
	@Enumerated(EnumType.STRING)
	private Zvanje zvanje;
	@OneToOne
	@JoinColumn(name = "DEPARTMENT_ID",referencedColumnName = "ID")
	private Department department;
	@OneToMany(mappedBy = "profesor", orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<Predavanje> predavanja;
	public Profesor() {
		super();
		predavanja = new HashSet<Predavanje>();
	}
	public Profesor(Zvanje zvanje, Department department) {
		super();
		this.zvanje = zvanje;
		this.department = department;
		predavanja = new HashSet<Predavanje>();
	}
	public Zvanje getZvanje() {
		return zvanje;
	}
	public void setZvanje(Zvanje zvanje) {
		this.zvanje = zvanje;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Set<Predavanje> getPredavanja() {
		return predavanja;
	}
	public void setPredavanja(Set<Predavanje> predavanja) {
		this.predavanja = predavanja;
	}
	@Override
	public String toString() {
		return "Profesor [zvanje=" + zvanje + ", department=" + department + ", predavanja=" + predavanja + "]";
	}
	
	
	
	

}
