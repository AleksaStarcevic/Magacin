package artikli;

import java.util.Objects;

public class Artikal {
	private int sifra;
	private	String naziv;
	private String opis;
	private int kol;
	
	public int getSifra() {
		return sifra;
	}
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public int getKol() {
		return kol;
	}

	public void setKol(int kol) {
		this.kol = kol;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	@Override
	public int hashCode() {
		return Objects.hash(kol, naziv, opis, sifra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return kol == other.kol && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& sifra == other.sifra;
	}

	@Override
	public String toString() {
		return "Artikal [sifra=" + sifra + ", naziv=" + naziv + ", opis=" + opis + ", kol=" + kol + "]";
	}
	
	

	

	
}
