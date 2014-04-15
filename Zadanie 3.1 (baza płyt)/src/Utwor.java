import java.util.ArrayList;

public class Utwor {

	private String tytulUtworu;
	private int czasTrwaniaUtworu;
	private String komp;
	private int numerNaPlycie;
	ArrayList<String> listaWykonawcow = new ArrayList<String>();
	
	/* Konstruktory */
	
	public Utwor() {
		this.tytulUtworu = "Unknown";
		this.czasTrwaniaUtworu = 0;
		this.komp = "Unknown";
		this.numerNaPlycie = 0;
		this.listaWykonawcow = null;
	}

	public Utwor(String tytul, int czasTrwania, String komp, String wykon, int nrNaPlycie) {

		this.tytulUtworu = tytul;
		this.czasTrwaniaUtworu = czasTrwania;
		this.komp = komp;
		this.listaWykonawcow.add(wykon);
		this.numerNaPlycie = nrNaPlycie;
	}

	
	/* Gettery i settery */
	
	public String getTytulUtworu() {
		return tytulUtworu;
	}

	public void setTytulUtworu(String tytulUtworu) {
		this.tytulUtworu = tytulUtworu;
	}

	public int getCzasTrwaniaUtworu() {
		return czasTrwaniaUtworu;
	}

	public void setCzasTrwaniaUtworu(int czasTrwaniaUtworu) {
		this.czasTrwaniaUtworu = czasTrwaniaUtworu;
	}

	public String getKomp() {
		return komp;
	}

	public void setKomp(String komp) {
		this.komp = komp;
	}

	public int getNumerNaPlycie() {
		return numerNaPlycie;
	}

	public void setNumerNaPlycie(int numerNaPlycie) {
		this.numerNaPlycie = numerNaPlycie;
	}
	
	
	
	/* Metody */
	
	void showInfo() {
		//metoda wyœwietlaj¹ca wszystkie szczegó³owe informacje na temat danego utworu
		System.out.println("Utwór: \""+this.tytulUtworu+"\"\nCzas trwania: "+this.czasTrwaniaUtworu+" sek."
				+"\nKompozytor: "+this.komp+"\nNumer utworu na p³ycie: "+numerNaPlycie);
		showArtist();
	}
	
	void showArtist() {
		//oddzielna metoda wyœwietlaj¹ca tylko wykonawców danego utworu
		System.out.println("Wykonawca(y) to: ");
		for(String x: listaWykonawcow) {
			System.out.println("\t"+x);
		}
		System.out.println();
	}
	
	}
