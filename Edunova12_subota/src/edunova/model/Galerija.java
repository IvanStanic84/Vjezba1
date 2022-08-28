package edunova.model;

import java.util.ArrayList;
import java.util.List;

public class Galerija {

	private String naziv;
	private List<GalerijaSlika> slike = new ArrayList<>();

	private List<Mjesto> mjesta = new ArrayList<>();

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<GalerijaSlika> getSlike() {
		return slike;
	}

	public void setSlike(List<GalerijaSlika> slike) {
		this.slike = slike;
	}

	public List<Mjesto> getMjesta() {
		return mjesta;
	}

	public void setMjesta(List<Mjesto> mjesta) {
		this.mjesta = mjesta;
	}

}