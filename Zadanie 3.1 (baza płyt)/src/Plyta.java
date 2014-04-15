import java.util.ArrayList;

public class Plyta {

	private String tytulPlyty;
	private int czasTrwaniaPlyty;
	private int nrPlyty;
	ArrayList<String> listaWykonawcowPlyty = new ArrayList<String>();
	ArrayList<Utwor> listaUtworowNaPlycie = new ArrayList<Utwor>();

	
	/* KONSTRUKTORY */
	
	public Plyta() {
		// konstruktor bezargumentowy. Ustawia wszystkie wartoœci na domyœlne.
		this.tytulPlyty = "Unknown";
		this.czasTrwaniaPlyty = 0;
		this.nrPlyty = 0;
		this.listaUtworowNaPlycie = null;
		this.listaWykonawcowPlyty = null;
	}

	public Plyta(String tytul, int numer) {
		// konstruktor ustawiaj¹cy tytu³ p³yty oraz jej numwer w ewidencji
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
		//metoda dodaje utwór do p³yty
		//powiêksza ca³kowity czas trwania p³yty o czas trwania danego utworu
		//przepisuje listê wykonawców danego utworu na koniec listy wykonawców na p³ycie
		listaUtworowNaPlycie.add(u);
		czasTrwaniaPlyty += u.getCzasTrwaniaUtworu();
		listaWykonawcowPlyty.addAll(u.listaWykonawcow);
	}
	
	void showArtist() {
		//metoda wyœwietla wszystkich wykonawców na p³ycie
		System.out.println("Wykonawcy wystêpuj¹cy na p³ycie to: ");
		for(String x: listaWykonawcowPlyty) {
			System.out.println("\t"+x);
		}
		System.out.println();
	}
	
	void showSongs() {
		//metoda wyœwietla wszystkie utwory na p³ycie wraz z ich numerami i czasem trwania
		System.out.println("Utwory na p³ycie to: ");
		for(Utwor x: listaUtworowNaPlycie) {
			System.out.println("\t"+x.getNumerNaPlycie()+". "+x.getTytulUtworu()+
					" ("+x.getCzasTrwaniaUtworu()+ " sek.)");
		}
		System.out.println();
	}
	
	void showInfo() {
		//metoda wyœwietlaj¹ca wszytkie szczegó³owe informacje na temat danej p³yty
		System.out.println("Tutu³ p³yty - \""+tytulPlyty+"\"\nNumer p³yty w ewidencji to: "
				+nrPlyty+"\nCzas trwania ca³ej p³yty: "+czasTrwaniaPlyty+
				" sek.\n");
		showSongs();
		showArtist();
	}
	
	
}
