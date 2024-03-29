package edunova.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Grupa extends Entitet {

	private String naziv;
	private Smjer smjer;
	private Date datumPocetka;
	private Integer maksimalnoPolaznika;
	private Predavac predavac;
	
	private List<Clan> clanovi = new ArrayList<>();
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Smjer getSmjer() {
		return smjer;
	}
	public void setSmjer(Smjer smjer) {
		this.smjer = smjer;
	}
	public Date getDatumPocetka() {
		return datumPocetka;
	}
	public void setDatumPocetka(Date datumPocetka) {
		this.datumPocetka = datumPocetka;
	}
	public Integer getMaksimalnoPolaznika() {
		return maksimalnoPolaznika;
	}
	public void setMaksimalnoPolaznika(Integer maksimalnoPolaznika) {
		this.maksimalnoPolaznika = maksimalnoPolaznika;
	}
	public Predavac getPredavac() {
		return predavac;
	}
	public void setPredavac(Predavac predavac) {
		this.predavac = predavac;
	}
	public List<Clan> getClanovi() {
		return clanovi;
	}
	public void setClanovi(List<Clan> clanovi) {
		this.clanovi = clanovi;
	}
	
	
	
	
}
