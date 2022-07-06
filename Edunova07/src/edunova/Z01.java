package edunova;

public class Z01 {
	// Kreirati program koji prvo tra�i
	// broj predmeta. Zatim sa svaki predmet
	// unosi naziv i zaklju�enu ocjenu
	// program ispisuje popis svih predmeta s
	// ocjenama i prosjek ocjena

	public static void main(String[] args) {

		Predmet[] predmeti = new Predmet[Pomocno.ucitajInt("Unesi broj predmeta")];
		Predmet predmet;
		Profesor profesor;
		Mjesto mjesto;
		for (int i = 0; i < predmeti.length; i++) {
			predmet = new Predmet();
			predmet.setNaziv(Pomocno.ucitajString("Unesi naziv za " + (i + 1) + ". predmet"));

			// OVO NE RADITI - null pointer exception
			// predmet.getProfesor().setIme("Pero");

			profesor = new Profesor();
			profesor.setIme("Pero");
			profesor.setPrezime("Peri�");

			mjesto = new Mjesto();
			mjesto.setNaziv("Osijek");
			profesor.setMjesto(mjesto);
			predmet.setProfesor(profesor);

			predmet.setOcjena(Pomocno.ucitajInt("Unesi ocjenu za " + (i + 1) + ". predmet"));
			predmeti[i] = predmet;
		}

		int suma = 0;
		for (Predmet p : predmeti) {
			suma += p.getOcjena();
			System.out.println(p.getProfesor().getMjesto().getNaziv() + " " + p.getProfesor().getIme() + ", "
					+ p.getNaziv() + ": " + p.getOcjena());
		}
		float prosjek = suma / (float) predmeti.length;
		System.out.println("Prosjek: " + prosjek);

	}

}
