import java.util.ArrayList;

public class Plyta {

	private String tytulPlyty;
	private int czasTrwaniaPlyty;
	private int nrPlyty;
	ArrayList<String> listaWykonawcowPlyty = new ArrayList<String>();
	ArrayList<Utwor> listaUtworowNaPlycie = new ArrayList<Utwor>();

	
	/* KONSTRUKTORY */
	
	public Plyta() {
		// konstruktor bezargumentowy. Ustawia wszystkie warto�ci na domy�lne.
		this.tytulPlyty = "Unknown";
		this.czasTrwaniaPlyty = 0;
		this.nrPlyty = 0;
		this.listaUtworowNaPlycie = null;
		this.listaWykonawcowPlyty = null;
	}

	public Plyta(String tytul, int numer) {
		// konstruktor ustawiaj�cy tytu� p�yty oraz jej numwer w ewidencji
		this.tytulPlyty = tytul;
		this.nrPlyty = numer;
		this.czasTrwaniaPlyty = 0;
		
	}
	
	

	/* Gettery i settery */
	
	
	public String getTytulPlyty() {
		return tytulPlyty;
	}

	public void setTytulPlyty(String tytulPlyty) {
		this.tytulPlyty = tytulPlyty;
	}

	public int getCzasTrwaniaPlyty() {
		return czasTrwaniaPlyty;
	}

	public void setCzasTrwaniaPlyty(int czasTrwaniaPlyty) {
		this.czasTrwaniaPlyty = czasTrwaniaPlyty;
	}

	public int getNrPlyty() {
		return nrPlyty;
	}

	public void setNrPlyty(int nrPlyty) {
		this.nrPlyty = nrPlyty;
	}
	
	
	/* Metody */
	
	void dodajUtwor(Utwor u) {
		//metoda dodaje utw�r do p�yty
		//powi�ksza ca�kowity czas trwania p�yty o czas trwania danego utworu
		//przepisuje list� wykonawc�w danego utworu na koniec listy wykonawc�w na p�ycie
		listaUtworowNaPlycie.add(u);
		czasTrwaniaPlyty += u.getCzasTrwaniaUtworu();
		listaWykonawcowPlyty.addAll(u.listaWykonawcow);
	}
	
	void showArtist() {
		//metoda wy�wietla wszystkich wykonawc�w na p�ycie
		System.out.println("Wykonawcy wyst�puj�cy na p�ycie to: ");
		for(String x: listaWykonawcowPlyty) {
			System.out.println("\t"+x);
		}
		System.out.println();
	}
	
	void showSongs() {
		//metoda wy�wietla wszystkie utwory na p�ycie wraz z ich numerami i czasem trwania
		System.out.println("Utwory na p�ycie to: ");
		for(Utwor x: listaUtworowNaPlycie) {
			System.out.println("\t"+x.getNumerNaPlycie()+". "+x.getTytulUtworu()+
					" ("+x.getCzasTrwaniaUtworu()+ " sek.)");
		}
		System.out.println();
	}
	
	void showInfo() {
		//metoda wy�wietlaj�ca wszytkie szczeg�owe informacje na temat danej p�yty
		System.out.println("Tutu� p�yty - \""+tytulPlyty+"\"\nNumer p�yty w ewidencji to: "
				+nrPlyty+"\nCzas trwania ca�ej p�yty: "+czasTrwaniaPlyty+
				" sek.\n");
		showSongs();
		showArtist();
	}
	
	
}
