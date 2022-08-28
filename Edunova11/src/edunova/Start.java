package edunova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edunova.model.Grupa;
import edunova.model.Polaznik;
import edunova.model.Predavac;
import edunova.model.Smjer;
import edunova.util.GrupaCRUD;
import edunova.util.Pomocno;
import edunova.util.SmjerCRUD;

public class Start {

	private List<Smjer> smjerovi;
	private List<Polaznik> polaznici;
	private List<Predavac> predavaci;
	private List<Grupa> grupe; 
	

	public Start() {
		smjerovi = new ArrayList<>();
		polaznici = new ArrayList<>();
		predavaci = new ArrayList<>();
		grupe = new ArrayList<>();
		inicijalniPodaci();
		Pomocno.ulaz = new Scanner(System.in);
		System.out.println("***** Edunova konzolna aplikacija V1 *****");
		izbornik();
		Pomocno.ulaz.close();
	}

	private void inicijalniPodaci() {
		Smjer s = new Smjer();
		s.setSifra(1);
		s.setNaziv("Java");
		smjerovi.add(s);
		s=new Smjer();
		s.setSifra(2);
		s.setNaziv("PHP");
		smjerovi.add(s);
		
		polaznici.add(new Polaznik(1,"Ana","Zimska","","",""));
		polaznici.add(new Polaznik(2,"Marko","Tot","","",""));
		polaznici.add(new Polaznik(3,"Marija","Sven","","",""));

		Predavac p = new Predavac();
		p.setSifra(1);
		p.setIme("Karlo");
		p.setPrezime("Èeè");
		predavaci.add(p);
	}

	private void pokreniProgram() {
		switch (Pomocno.ucitajInt("Odaberi program", 1, 5)) {
		case 1:
			smjerovi();
			break;
		case 2:
			grupe();
			break;
		case 3:
			polaznici();
			break;
		case 4:
			predavaci();
			break;
		case 5:
			System.out.println("Doviðenja");
		}
	}

	private void predavaci() {
		System.out.println("Domaæa zadaæa");
		// za sada
		izbornik();
	}

	private void polaznici() {
		System.out.println("Domaæa zadaæa");
		// za sada
		izbornik();
	}

	private void grupe() {
		System.out.println("Program grupe");
		izbornikProgram();
		pokreniGrupaAkcija();
	}

	private void pokreniGrupaAkcija() {
		switch (Pomocno.ucitajInt("Odaberite akciju", 1, 5)) {
		case 1:
			grupe.add(GrupaCRUD.unosNove(smjerovi,predavaci,polaznici));
			grupe();
			break;
		case 2:
			GrupaCRUD.ispis(grupe);
			grupe();
			break;
		case 3:

			grupe();
			break;
		case 4:

			grupe();
			break;
		case 5:
			izbornik();
		}
	}

	private void smjerovi() {
		System.out.println("Program smjerovi");
		izbornikProgram();
		pokreniSmjerAkciju();
	}

	private void izbornikProgram() {
		System.out.println("1. Unos");
		System.out.println("2. Pregled");
		System.out.println("3. Promjena");
		System.out.println("4. Brisanje");
		System.out.println("5. povratak na glavni izbornik");
	}

	private void pokreniSmjerAkciju() {
		switch (Pomocno.ucitajInt("Odaberite akciju", 1, 5)) {
		case 1:
			smjerovi.add(SmjerCRUD.unosNovog());
			smjerovi();
			break;
		case 2:
			SmjerCRUD.ispis(smjerovi);
			smjerovi();
			break;
		case 3:
			SmjerCRUD.ispis(smjerovi);
			SmjerCRUD.promjena(smjerovi.get(
					Pomocno.ucitajInt("Odaberi smjer", 
							1, smjerovi.size())-1
					));
			smjerovi();
			break;
		case 4:
			SmjerCRUD.ispis(smjerovi);
			smjerovi.remove(Pomocno.ucitajInt("Odaberi smjer", 
							1, smjerovi.size())-1
					);
			smjerovi();
			break;
		case 5:
			izbornik();
		}

	}

	private void izbornik() {

		System.out.println("");
		System.out.println("Glavni izbornik");
		System.out.println("1. Smjerovi");
		System.out.println("2. Grupe");
		System.out.println("3. Polaznici");
		System.out.println("4. Predavaèi");
		System.out.println("5. Izlaz");
		System.out.println("");
		pokreniProgram();

	}

	public static void main(String[] args) {
		new Start();
	}

}