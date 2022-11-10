package edunova;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RadSDatumima {
	
	public static Date kreirajDatum(
			int godina, int mjesec, int dan) {
		
		Date datum = new Date();
		// prekriženo znači depricated, NE KORISTITI
		datum.setDate(dan);
		
		
		datum = new Date();
		// vrijeme (i datum) je prema 
		
		GregorianCalendar gregorianCalendar 
		= (GregorianCalendar) Calendar.getInstance();
		gregorianCalendar.set(Calendar.YEAR, godina);
		gregorianCalendar.set(Calendar.MONTH, mjesec-1);
		gregorianCalendar.set(Calendar.DAY_OF_MONTH, dan);
		return gregorianCalendar.getTime();
	}

}
