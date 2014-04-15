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
		// metoda dodaje p³ytê do bazy. W zasadzie mo¿na to zrobiæ równie¿ w mainie
		// za pomoc¹ metody .add(), ale na wszelki wypadek jakbym chcia³ dodaæ jak¹œ kolejn¹ w³aœciwoœæ
		// zaimplementowa³em niezale¿n¹ metodê dodajPlyte
		bazaPlyt.add(p);
	}
	
	void wyswietlPlyty(){
		// wyœwietla p³yty znajduj¹ce siê w bie¿¹cej bazie
		System.out.println("P³yty znajduj¹ce siê w bazie to: ");
		for(Plyta x: bazaPlyt) {
			System.out.println("\t"+x.getNrPlyty()+". "+x.getTytulPlyty());
		}
		System.out.println();
	}
	
	
}

