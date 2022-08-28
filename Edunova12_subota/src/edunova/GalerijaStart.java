package edunova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edunova.model.Galerija;
import edunova.model.GalerijaSlika;
import edunova.model.Mjesto;
import edunova.model.Slika;

public class GalerijaStart {

	private List<Galerija> galerije;
	private List<Slika> slike;

	public GalerijaStart() {
		galerije = new ArrayList<>();
		slike = new ArrayList<>();
		napuniPodatke();
		ispis();
	}

	private void ispis() {
		for (Galerija g : galerije) {
			System.out.println(g.getNaziv() + " broj mjesta: " + g.getMjesta().size());
			// https://www.bezkoder.com/java-sort-arraylist-of-objects/
			Collections.sort(g.getSlike(), Comparator.comparing(GalerijaSlika::getRedniBroj));
			for (GalerijaSlika gs : g.getSlike()) {
				System.out.println("    " + gs.getRedniBroj() + ". " + gs.getSlika().getPutanja().replace(".png", ""));
			}

		}

	}

	private void napuniPodatke() {

		napuniSlike();
		Galerija galerija = new Galerija();
		galerija.setNaziv("Prva");
		dodajUGaleriju(galerija, 4, 2);
		dodajUGaleriju(galerija, 1, 3);
		dodajUGaleriju(galerija, 2, 1);
		galerija.getMjesta().add(new Mjesto("Osijek"));
		galerija.getMjesta().add(new Mjesto("Zagreb"));
		// System.out.println(galerija.getSlike().size());
		galerije.add(galerija);

		galerija = new Galerija();
		galerija.setNaziv("Druga");
		dodajUGaleriju(galerija, 1, 1);
		dodajUGaleriju(galerija, 2, 2);
		// System.out.println(galerija.getSlike().size());
		galerije.add(galerija);

	}

	private void dodajUGaleriju(Galerija galerija, int indexSlika, int redniBroj) {
		GalerijaSlika galerijaSlika = new GalerijaSlika();
		galerijaSlika.setGalerija(galerija);
		galerijaSlika.setSlika(slike.get(indexSlika));
		galerijaSlika.setRedniBroj(redniBroj);
		galerija.getSlike().add(galerijaSlika);

	}

	private void napuniSlike() {
		slike.add(new Slika("osijek.png"));
		slike.add(new Slika("zagreb.png"));
		slike.add(new Slika("split.png"));
		slike.add(new Slika("rijeka.png"));
		slike.add(new Slika("dubrovnik.png"));
	}

	public static void main(String[] args) {
		new GalerijaStart();
	}
}