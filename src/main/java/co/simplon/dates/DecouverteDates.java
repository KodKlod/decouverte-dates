package co.simplon.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DecouverteDates {

	public DecouverteDates() {
		super();
	}

	public boolean estInferieurDateCourante(Date date) throws ParseException {
		Date dateCourante = new Date();
		long diffDates = dateCourante.getTime()-date.getTime();
		if (diffDates>0){
			return true;
		}
		return false;
	}

	public Date construireDate(String chaineFournie) throws ParseException {
		chaineFournie = chaineFournie + " 00:00";
		SimpleDateFormat formater = 
				new SimpleDateFormat("dd/MM/yyyy HH:mm");
		formater.setLenient(false);
		Date dateConstruite = formater.parse(chaineFournie);
		return dateConstruite;
	}

	public Date augmenterDate(Date dateInitiale, int nombreJours,
			int nombreHeures, int nombreMinutes) {		
		Calendar modifierDate = Calendar.getInstance();
		modifierDate.setTime(dateInitiale);
		modifierDate.add(Calendar.DAY_OF_MONTH, nombreJours);
		modifierDate.add(Calendar.HOUR, nombreHeures);
		modifierDate.add(Calendar.MINUTE, nombreMinutes);
		return modifierDate.getTime();
	}

	public String formaterUneDate(Date date) {
		SimpleDateFormat formaterDate =
				new SimpleDateFormat("dd_MM_YYYY");
		return formaterDate.format(date);
	}

	public String formaterUneHeure(Date time) {
		SimpleDateFormat formaterHeure = 
				new SimpleDateFormat("kk'h'mm'min'ss'sec'");
		return formaterHeure.format(time);
	}
	
	public String formaterDateEnFrancais(Date date) {
		SimpleDateFormat formaterDateFr = 
				new SimpleDateFormat("EEEE dd MMMM yyyy",Locale.FRENCH);
		return formaterDateFr.format(date);
	}
}
