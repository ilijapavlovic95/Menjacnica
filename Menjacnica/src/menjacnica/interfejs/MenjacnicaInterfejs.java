package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(String sifraValute, double prodajni, double kupovni, double srednji, GregorianCalendar datum);
	
	public void obrisiKurs(String sifraValute, GregorianCalendar datum);
	
	public Kurs pronadjiKurs(String sifraValute, GregorianCalendar datum);

}
