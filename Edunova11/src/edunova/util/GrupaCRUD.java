package edunova.util;

import java.util.List;

import edunova.model.Grupa;
import edunova.model.Polaznik;
import edunova.model.Predavac;
import edunova.model.Smjer;

public class GrupaCRUD {

	public static Grupa unosNove(
			List<Smjer> smjerovi,
			List<Predavac> predavaci,
			List<Polaznik> polaznici
			) {
		Grupa g = new Grupa();
		//šifra DZ
		g.setNaziv(Pomocno.ucitajString("Unesi naziv grupe"));
		System.out.println("Popis smjerova u aplikaciji");
		SmjerCRUD.ispis(smjerovi);
		g.setSmjer(smjerovi.get(
				Pomocno.ucitajInt("Odaberi smjer", 1, 
						smjerovi.size())-1
				));
		// DZ postaviti predavaèa, datum poèetka i maksimalno polaznika
		
		return g;
	}
	
	public static void ispis(List<Grupa> grupe) {
		int rb = 1;
		System.out.println("");
		System.out.println("Grupe u aplikaciji");
		for (Grupa g : grupe) {
			System.out.println(rb++ + ". " + g.getNaziv() + " (" + g.getSmjer().getNaziv() + ")");
		}
		System.out.println("----------");
	}
}