package menjacnica;

import java.util.LinkedList;

public class Valuta {
	
	private String naziv;
	private String sifra;
	private LinkedList<Kurs> kursevi;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((sifra == null) ? 0 : sifra.hashCode());
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
		Valuta other = (Valuta) obj;
		if (kursevi == null) {
			if (other.kursevi != null)
				return false;
		} else if (!kursevi.equals(other.kursevi))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (sifra == null) {
			if (other.sifra != null)
				return false;
		} else if (!sifra.equals(other.sifra))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Valuta - naziv:" + naziv + ", sifra:" + sifra + ", kursevi:" + kursevi;
	}
	
	

}
