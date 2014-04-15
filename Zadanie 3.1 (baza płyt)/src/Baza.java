import java.util.ArrayList;


public class Baza {

	private String nazwaBazy;
	ArrayList<Plyta> bazaPlyt = new ArrayList<Plyta>();
	
	
	/* KONSTRUKTORY */
	public Baza() {
		this.nazwaBazy = "Default";
	}
	
	public Baza(String nazwa){
		this.nazwaBazy = nazwa;
	}


	/*GETTERY I SETTERY*/
	void setNazwaBazy(String nazwa) {
		this.nazwaBazy = nazwa;
	}
	
	String getNazwaBazy(){
		return this.nazwaBazy;
	}
	
	/*Metody*/

	
	void dodajPlyte(Plyta p) {
		// metoda dodaje p�yt� do bazy. W zasadzie mo�na to zrobi� r�wnie� w mainie
		// za pomoc� metody .add(), ale na wszelki wypadek jakbym chcia� doda� jak�� kolejn� w�a�ciwo��
		// zaimplementowa�em niezale�n� metod� dodajPlyte
		bazaPlyt.add(p);
	}
	
	void wyswietlPlyty(){
		// wy�wietla p�yty znajduj�ce si� w bie��cej bazie
		System.out.println("P�yty znajduj�ce si� w bazie to: ");
		for(Plyta x: bazaPlyt) {
			System.out.println("\t"+x.getNrPlyty()+". "+x.getTytulPlyty());
		}
		System.out.println();
	}
	
	
}

