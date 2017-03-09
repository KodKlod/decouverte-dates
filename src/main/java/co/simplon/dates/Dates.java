package co.simplon.dates;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Dates {

	public Dates() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		//4 mani�res d'obtenir le point dans le temps
		//Ici on affiche le long correspondant
		System.out.println("4 moyens d'obtenir le point dans le temps");
		System.out.println(System.currentTimeMillis());
		System.out.println(new java.util.Date().getTime());
		System.out.println(Calendar.getInstance().getTimeInMillis() );
		System.out.println(Calendar.getInstance().getTime().getTime ());
		
		//travail sur le mois de la date courante(point dans le temps)
		System.out.println("--------");
		System.out.println("Mois courant avec Calendar");
		Calendar calendar = Calendar.getInstance();
		if ( calendar.get( Calendar.MONTH )==Calendar.JANUARY ) {
		System.out.println("la date courante est en mars");
		}else{
			int moisCourant = calendar.get(Calendar.MONTH)+1;
			System.out.println("Le mois courant est : "+ moisCourant);
			System.out.println("-----");
	}
		
		//Manipulation des diff�rents formats de sortie de la date
		System.out.println("Dates avec Date");
		Date aujourdhui = new Date();
		DateFormat shortDateFormat = DateFormat.getDateTimeInstance(
		DateFormat.SHORT,DateFormat.SHORT);
		DateFormat shortDateFormatEN = DateFormat.getDateTimeInstance(
		DateFormat.SHORT,
		DateFormat.SHORT, new Locale("EN","en"));
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
		DateFormat.MEDIUM,
		DateFormat.MEDIUM);
		DateFormat mediumDateFormatEN = DateFormat.getDateTimeInstance(
		DateFormat.MEDIUM,
		DateFormat.MEDIUM, new Locale("EN","en"));
		DateFormat longDateFormat = DateFormat.getDateTimeInstance(
		DateFormat.LONG,
		DateFormat.LONG);
		DateFormat longDateFormatEN = DateFormat.getDateTimeInstance(
		DateFormat.LONG,
		DateFormat.LONG, new Locale("EN","en"));
		DateFormat fullDateFormat = DateFormat.getDateTimeInstance(
		DateFormat.FULL,DateFormat.FULL);
		DateFormat fullDateFormatEN = DateFormat.getDateTimeInstance(
		DateFormat.FULL,
		DateFormat.FULL, new Locale("EN","en"));
		System.out.println(shortDateFormat.format(aujourdhui));
		System.out.println(mediumDateFormat.format(aujourdhui));
		System.out.println(longDateFormat.format(aujourdhui));
		System.out.println(fullDateFormat.format(aujourdhui));
		System.out.println("");
		System.out.println(shortDateFormatEN.format(aujourdhui));
		System.out.println(mediumDateFormatEN.format(aujourdhui));
		System.out.println(longDateFormatEN.format(aujourdhui));
		System.out.println(fullDateFormatEN.format(aujourdhui));
		System.out.println("-------");
		
		//joujou avec Calendar
		System.out.println("Date avec Calendar");
		Calendar cNow = Calendar.getInstance();
		cNow.set(2017, 2,28);//2 pour mars, sinon Calendar.MARCH
		Date dateDecNow = cNow.getTime();
		System.out.println(dateDecNow);
		
		//Cr�er des formats de restitution personnalis�s
		SimpleDateFormat formater = null;
		Date ceJour = new Date();
		System.out.println("-----");
		System.out.println("Formats personnalis�s avec .SimpleDateFormat");
		formater = new SimpleDateFormat("dd-MM-yy");
		System.out.println(formater.format(ceJour));
		formater = new SimpleDateFormat("ddMMyy");
		System.out.println(formater.format(ceJour));
		formater = new SimpleDateFormat("yyMMdd");
		System.out.println(formater.format(ceJour));
		formater = new SimpleDateFormat("h:mm a");
		System.out.println(formater.format(ceJour));
		formater = new SimpleDateFormat("K:mm a, z");
		System.out.println(formater.format(ceJour));
		formater = new SimpleDateFormat("hh:mm a, zzzz");
		System.out.println(formater.format(ceJour));
		formater = new SimpleDateFormat("EEEE, d MMM yyyy");
		System.out.println(formater.format(ceJour));
		formater = new SimpleDateFormat("'le' dd/MM/yyyy '�' hh:mm:ss");
		System.out.println(formater.format(ceJour));
		formater = new SimpleDateFormat("'le' dd MMMM yyyy '�' hh:mm:ss");
		System.out.println(formater.format(ceJour));
		formater = new SimpleDateFormat("dd MMMMM yyyy GGG, hh:mm aaa");
		System.out.println(formater.format(ceJour));
		formater = new SimpleDateFormat("yyyyMMddHHmmss");
		System.out.println(formater.format(ceJour));
		
		//les formats de date en fran�ais
		System.out.println("------");
		System.out.println("Les �l�ments de date en fran�ais avec DFS et Locale");
		DateFormatSymbols dfsFR = new DateFormatSymbols(Locale.FRENCH);
		String[] joursSemaineFR = dfsFR.getWeekdays();
		StringBuffer texteFR = new StringBuffer("Jours FR ");
		for (int i = 1; i < joursSemaineFR.length; i++) {
			texteFR.append(" : ");
			texteFR.append(joursSemaineFR[i]);
		}
		System.out.println(texteFR);
		texteFR = new StringBuffer("Mois courts FR ");
		String[] moisCourtsFR = dfsFR.getShortMonths();
		
		for (int i = 0; i < moisCourtsFR.length - 1; i++) {
			texteFR.append(" : ");
			texteFR.append(moisCourtsFR[i]);
			}
			System.out.println(texteFR);
		
			texteFR = new StringBuffer("Mois FR ");
			String[] moisFR = dfsFR.getMonths();
			for (int i = 0; i < moisFR.length - 1; i++) {
			texteFR.append(" : ");
			texteFR.append(moisFR[i]);
			}
			System.out.println(texteFR);
		
		
		
		
		
		
		
	}

}
