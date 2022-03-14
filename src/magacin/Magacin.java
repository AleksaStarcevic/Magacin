package magacin;

import java.util.ArrayList;
import java.util.List;

import artikli.Artikal;

public class Magacin {
	List<Artikal> artikli;

	public Magacin(ArrayList<Artikal> artikli) {
		this.artikli = artikli;
	}

	public List<Artikal> getArtikli() {
		return artikli;
	}

	public void setArtikli(List<Artikal> artikli) {
		this.artikli = artikli;
	}
}
