package interfejs;

import artikli.Artikal;

public interface MagacinInterfejs {
	public void dodajArtikal(Artikal artikal);

	public void izbrisiArtikal(Artikal artikal);

	public Artikal pronadjiArtikal(int sifra);
}
