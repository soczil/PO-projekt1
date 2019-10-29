package optymalnaBudowa;

/**
 * Klasa odpowiada za reprezentację cennika.
 * 
 * @author Karol Soczewica
 * @version 2019.04.26
 */
public class Cennik {
	/**
	 * Atrybut liczbaPrętów przechowuje całkowitą liczbę, która świadczy o liczbie
	 * prętów w tablicy prętów.
	 */
	private int liczbaPrętów;
	/**
	 * Atrybut pręty jest tablicą obiektów klasy Pręt.
	 */
	private Pręt[] pręty;

	/**
	 * Dwuparametrowy konstruktor klasy Cennik. Jako parametry przyjmuje liczbę
	 * prętów oraz tablicę prętów, następnie ustawia atrybuty klasy Cennik zgodnie z
	 * podanymi parametrami.
	 * 
	 * @param liczbaPrętów liczba całkowita reprezentująca liczbę prętów
	 * @param pręty        tablica obiektów klasy Pręt
	 */
	public Cennik(int liczbaPrętów, Pręt[] pręty) {
		this.liczbaPrętów = liczbaPrętów;
		this.pręty = pręty;
	}

	/**
	 * Konstruktor klasy Cennik przyjmujący jeden parametr. Jako parametr przyjmuje
	 * rozmiar tablicy, następnie wywołuje dwuargumentowy konstruktor klasy Cennik,
	 * podając jako argumenty liczbę 0 oraz nowoutworzoną tablicę, obiektów klasy
	 * Pręt, rozmiaru podanego jako parametr.
	 * 
	 * @param rozmiarTablicy liczba całkowita reprezentująca rozmiar tablicy prętów
	 *                       jaki ma mieć obiekt klasy Cennik
	 */
	public Cennik(int rozmiarTablicy) {
		this(0, new Pręt[rozmiarTablicy]);
	}

	/**
	 * Daje w wyniku napisową reprezentacje obiektu klasy Cennik.
	 * 
	 * @return napis reprezentujący atrybuty klasy Cennik w postaci String
	 */
	@Override
	public String toString() {
		String s = "liczba prętów: " + liczbaPrętów + "\n";
		s += "pręty:\n";
		for (int i = 0; i < liczbaPrętów; i++) {
			s += pręty[i].toString() + "\n";
		}
		return s;
	}

	/**
	 * Dodaje pręt do cennika. Jako parametr dostaje obiekt p klasy Pręt, następnie,
	 * jeśli liczbaPrętów jest mniejsza od długości tablicy prętów, dodaje p do
	 * tablicy prętów.
	 * 
	 * @param p obiekt klasy Pręt
	 */
	public void dodajPręt(Pręt p) {
		if (liczbaPrętów < pręty.length) {
			pręty[liczbaPrętów] = p;
			liczbaPrętów += 1;
		}
	}

	/**
	 * Akcesor, daje w wyniku liczbę prętów mieszczących się w tablic prętów.
	 * 
	 * @return wartość atrybutu liczbaPrętów w postaci liczby całkowitej
	 */
	public int liczbaPrętów() {
		return liczbaPrętów;
	}

	/**
	 * Akcesor, daje w wyniku tablicę prętów.
	 * 
	 * @return wartość atrybutu pręty w postaci tablicy obiektów klasy Pręt
	 */
	public Pręt[] pręty() {
		return pręty;
	}

}
