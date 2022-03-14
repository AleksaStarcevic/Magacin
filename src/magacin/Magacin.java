package magacin;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import artikli.Artikal;
import interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {
	List<Artikal> artikli;

	public Magacin(ArrayList<Artikal> artikli) {
		this.artikli = artikli;
	}

	public List<Artikal> getArtikli() {
		return artikli;
	}

	public void setArtikli(List<Artikal> artikli) {
		if (artikli == null) {
			throw new NullPointerException("Lista artikla ne sme biti null");
		}
		this.artikli = artikli;
	}

	@Override
	public int hashCode() {
		return Objects.hash(artikli);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Magacin other = (Magacin) obj;
		return Objects.equals(artikli, other.artikli);
	}

	@Override
	public String toString() {
		return "Magacin [artikli=" + artikli + "]";
	}

	@Override
	public void dodajArtikal(Artikal artikal) {

		if (artikal != null) {
			artikli.add(artikal);
		}

	}

	@Override
	public void izbrisiArtikal(Artikal artikal) {
		if(artikal == null) {
			throw new NullPointerException("Artikal ne sme biti null");
		}
		for (Artikal arti : artikli) {
			if (arti.equals(artikal)) {
				arti.setKol(arti.getKol() - 1);
			}
		}

	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		if(sifra < 0) {
			throw new IllegalArgumentException("Sifra ne sme biti manja od 0");
		}
		for (Artikal artikal : artikli) {
			if (artikal.getSifra() == sifra) {
				return artikal;
			}
		}
		return new Artikal();
	}

}
