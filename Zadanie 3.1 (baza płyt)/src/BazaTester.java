
public class BazaTester {

	public static void main(String[] args) {
		
		Baza nowaBaza = new Baza("Moja pierwsza baza p³yt");  // tworzymy now¹ bazê p³yt
		
		// poni¿ej tworzymy trzy utwory i ustawiamy ich w³aœciwoœci w konstruktorach
		Utwor cichaNoc = new Utwor("Cicha noc", 345, "Jurand ze Spychowa", "Opera Ba³tycka", 1);
		Utwor dzisiajWBet = new Utwor("Dzisiaj w Betlejem", 405, "Krzysztof Penderecki", "Patrycja Markowska", 2);
		Utwor wsrodNocnej = new Utwor("Wœród nocnej ciszy", 395, "Œw. Miko³aj", "Budka Suflera", 3);
		
		Plyta koledy = new Plyta("Œwi¹teczna sk³adanka przebojów", 1); //tworzymy now¹ p³ytê
		nowaBaza.dodajPlyte(koledy); // dodajemy now¹ p³ytê do bazy p³yt
		
		// dodajemy trzy stworzone wczeœniej utwory do p³yty "koleda", za pomoc¹ metody dodajUtwor()
		koledy.dodajUtwor(cichaNoc);
		koledy.dodajUtwor(dzisiajWBet);
		koledy.dodajUtwor(wsrodNocnej);
		
		//poni¿ej dziej¹ siê analogiczne rzeczy, tyle ¿e z drug¹ p³yt¹
		Utwor money = new Utwor("Money", 420, "D. Gilmour", "Pink Floyd", 1);
		Utwor pullMe = new Utwor("Pull me under", 398, "John Petrucci", "Dream Theater", 2);
		Utwor jungle = new Utwor("Welcome to the jungle", 250, "Axl Rose", "Guns'n'Roses", 3);
		
		Plyta rokowizna = new Plyta("Sk³adanka rocka", 2);
		nowaBaza.dodajPlyte(rokowizna);
		rokowizna.dodajUtwor(money);
		rokowizna.dodajUtwor(pullMe);
		rokowizna.dodajUtwor(jungle);
		
		
		/* Metody wymagane w poleceniu */
		
		nowaBaza.wyswietlPlyty();   // metoda wyœwietla wszystkie p³yty w bazie
		
		koledy.showInfo();     // metody wyœwietlaj¹ce wszystkie 
		rokowizna.showInfo();  // szczegó³owe informacje na temat danej p³yty
		
		koledy.showArtist();	//wyswietlenie wykonawców z obu p³yt
		rokowizna.showArtist();
		
		cichaNoc.showInfo();   // wyswietlenie szczegó³owej informacji na temat danego utworu
		
		
	}

}
