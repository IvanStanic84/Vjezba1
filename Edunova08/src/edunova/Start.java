package edunova;

import edunova.Osoba;
import edunova.OsobaImplementacija;
import edunova.Polaznik;
import edunova.Pravokutnik;
import edunova.Predavac;
import util.Pomocno;

public class Start {

	public static void main(String[] args) {

		// deklaracija
		Pravokutnik p;
		// instanciranje - pozivanje posebne metode konstruktor
		p = new Pravokutnik(20, 10);
		// p.setSirina(20);
		// p.setVisina(10);

		// ovo se ne radi
		System.out.println(p.getVisina() * p.getSirina());

		System.out.println(p.povrsina());

		/*
		 * Osoba o = new Osoba(); //prazan konstruktor o.setIme("Pero");
		 * o.setPrezime("Peri�");
		 * 
		 * o = new Osoba("Maja","Maji�"); // puni konstruktor
		 */
		Polaznik polaznik = new Polaznik();

		Predavac predavac = new Predavac();
		// predavac.set

		// tekstualni reprezentat objekta

		p = new Pravokutnik(5, 5);

		System.out.println(p);
		// edunova.klase.Pravokutnik@49e4cb85 dilazi iz metode Object.toString

		Pravokutnik drugi = new Pravokutnik(5, 5);

		System.out.println(p.equals(drugi));
		System.out.println(p.hashCode());
		System.out.println(drugi.hashCode());

		polaznik = new Polaznik("Pero", "Peri�", "2022/12");
		predavac = new Predavac("Maja", "Maji�", "HR263263");

		System.out.println(polaznik);
		System.out.println(predavac);

		predavac.setIme(Pomocno.ucitajString("Daj ime"));

		// Osoba je apstraktna
		// Osoba osoba = new Osoba();

		OsobaImplementacija o = new OsobaImplementacija();
		o.setIme("Ime");
	}
}
