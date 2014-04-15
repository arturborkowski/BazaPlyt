
public class BazaTester {

	public static void main(String[] args) {
		
		Baza nowaBaza = new Baza("Moja pierwsza baza p�yt");  // tworzymy now� baz� p�yt
		
		// poni�ej tworzymy trzy utwory i ustawiamy ich w�a�ciwo�ci w konstruktorach
		Utwor cichaNoc = new Utwor("Cicha noc", 345, "Jurand ze Spychowa", "Opera Ba�tycka", 1);
		Utwor dzisiajWBet = new Utwor("Dzisiaj w Betlejem", 405, "Krzysztof Penderecki", "Patrycja Markowska", 2);
		Utwor wsrodNocnej = new Utwor("W�r�d nocnej ciszy", 395, "�w. Miko�aj", "Budka Suflera", 3);
		
		Plyta koledy = new Plyta("�wi�teczna sk�adanka przeboj�w", 1); //tworzymy now� p�yt�
		nowaBaza.dodajPlyte(koledy); // dodajemy now� p�yt� do bazy p�yt
		
		// dodajemy trzy stworzone wcze�niej utwory do p�yty "koleda", za pomoc� metody dodajUtwor()
		koledy.dodajUtwor(cichaNoc);
		koledy.dodajUtwor(dzisiajWBet);
		koledy.dodajUtwor(wsrodNocnej);
		
		//poni�ej dziej� si� analogiczne rzeczy, tyle �e z drug� p�yt�
		Utwor money = new Utwor("Money", 420, "D. Gilmour", "Pink Floyd", 1);
		Utwor pullMe = new Utwor("Pull me under", 398, "John Petrucci", "Dream Theater", 2);
		Utwor jungle = new Utwor("Welcome to the jungle", 250, "Axl Rose", "Guns'n'Roses", 3);
		
		Plyta rokowizna = new Plyta("Sk�adanka rocka", 2);
		nowaBaza.dodajPlyte(rokowizna);
		rokowizna.dodajUtwor(money);
		rokowizna.dodajUtwor(pullMe);
		rokowizna.dodajUtwor(jungle);
		
		
		/* Metody wymagane w poleceniu */
		
		nowaBaza.wyswietlPlyty();   // metoda wy�wietla wszystkie p�yty w bazie
		
		koledy.showInfo();     // metody wy�wietlaj�ce wszystkie 
		rokowizna.showInfo();  // szczeg�owe informacje na temat danej p�yty
		
		koledy.showArtist();	//wyswietlenie wykonawc�w z obu p�yt
		rokowizna.showArtist();
		
		cichaNoc.showInfo();   // wyswietlenie szczeg�owej informacji na temat danego utworu
		
		
	}

}
