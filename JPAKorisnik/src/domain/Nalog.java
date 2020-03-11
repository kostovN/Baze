package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NALOG")
public class Nalog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ime;
	private String sifra;
	public Nalog(String ime, String sifra) {
		super();
		this.ime = ime;
		this.sifra = sifra;
	}
	public Nalog(Long id, String ime, String sifra) {
		super();
		this.id = id;
		this.ime = ime;
		this.sifra = sifra;
	}


	public Nalog() {
		super();
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	@Override
	public String toString() {
		return "Nalog [ime=" + ime + ", sifra=" + sifra + "]";
	}
	
	
}
