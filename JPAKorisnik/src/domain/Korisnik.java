package domain;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public abstract class Korisnik {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String ime;
	private String prezime;
	@Enumerated(EnumType.STRING)
	private Korisnicka_uloga uloga;
	@OneToOne
	@JoinColumn(name = "NALOG_ID")
	private Nalog nalog;
	public Korisnik() {
		super();
	}
	public Korisnik(Long id, String ime, String prezime, Korisnicka_uloga uloga, Nalog nalog) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.uloga = uloga;
		this.nalog = nalog;
	}
	public Korisnik(String ime, String prezime, Korisnicka_uloga uloga, Nalog nalog) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.uloga = uloga;
		this.nalog = nalog;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public Korisnicka_uloga getUloga() {
		return uloga;
	}
	public void setUloga(Korisnicka_uloga uloga) {
		this.uloga = uloga;
	}
	public Nalog getNalog() {
		return nalog;
	}
	public void setNalog(Nalog nalog) {
		this.nalog = nalog;
	}
	@Override
	public String toString() {
		return "Korisnik [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", uloga=" + uloga + ", nalog=" + nalog
				+ "]";
	}
	
	

}
