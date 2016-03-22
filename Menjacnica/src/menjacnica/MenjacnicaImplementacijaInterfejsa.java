package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class MenjacnicaImplementacijaInterfejsa implements MenjacnicaInterfejs{

	@Override
	public void dodajKurs(String sifraValute, double prodajni, double kupovni, double srednji,
			GregorianCalendar datum) {
		
	}

	@Override
	public void obrisiKurs(String sifraValute, GregorianCalendar datum) {
		
	}

	@Override
	public Kurs pronadjiKurs(String sifraValute, GregorianCalendar datum) {
		return null;
	}
	
}
