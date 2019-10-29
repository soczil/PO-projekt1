package optymalnaBudowa;

/**
 * Klasa odpowiadająca za reprezentację wyniku programu.
 * 
 * @author Karol Soczewica
 * @version 2019.04.26
 */
public class Wynik {
	/**
	 * Liczba całkowita przechowująca obliczony w programie sumaryczny koszt zakupu
	 * prętów.
	 */
	private int koszt;
	/**
	 * Liczba całkowita przechowująca obliczoną w programie sumaryczną ilość
	 * odpadów.
	 */
	private int odpady;
	/**
	 * Tablica obiektów klasy KupionyPręt przechowująca wszystkie zakupione prety.
	 */
	private KupionyPręt[] kupione;

	/**
	 * Trójargumentowy konstruktor klasy Wynik.
	 * 
	 * @param koszt   liczba całkowita reprezentująca koszt zakupionych prętów
	 * @param odpady  liczba całkowita reprezentująca ilość odpadów
	 * @param kupione tablica obiektów klasy KupionyPręt przechowująca zakupione
	 *                pręty
	 */
	public Wynik(int koszt, int odpady, KupionyPręt[] kupione) {
		this.koszt = koszt;
		this.odpady = odpady;
		this.kupione = kupione;
	}

	/**
	 * Daje w wyniku napisową reprezentację obiektu klasy Wynik.
	 */
	@Override
	public String toString() {
		String s = koszt + "\n";
		s += odpady + "\n";
		for (int i = 0; (i < kupione.length) && (kupione[i] != null); i++) {
			s += kupione[i].długość();
			for (int j = 0; j < kupione[i].liczbaOdcinkow(); j++) {
				s += " " + kupione[i].odcinki()[j];
			}
			s += "\n";
		}
		return s;
	}

}
