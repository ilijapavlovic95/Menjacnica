package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{
	
	LinkedList<Valuta> valute;

	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(LinkedList<Valuta> valute) {
		if(valute == null)
			throw new RuntimeException("Greska pri unosu.");
		this.valute = valute;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valute == null) ? 0 : valute.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menjacnica other = (Menjacnica) obj;
		if (valute == null) {
			if (other.valute != null)
				return false;
		} else if (!valute.equals(other.valute))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Menjacnica - valute:" + valute;
	}

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
