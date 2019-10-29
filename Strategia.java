package optymalnaBudowa;

/**
 * Klasa abstrakcyjna przechowująca abstrakcyjną metodę obliczającą wynik
 * programu. Nadklasa klas Zachłanna oraz Plecakowa.
 * 
 * @author Karol Soczewica
 * @version 2019.04.26
 */
public abstract class Strategia {
	/**
	 * Konstruktor klasy Strategia.
	 */
	public Strategia() {
		super();
	}

	/**
	 * Abstrakcyjna metoda obliczjąca wynik programu. Jako parametry dostaje
	 * wczytane ze standardowego wejścia cennik oraz projekt, a następnie oblicza
	 * wynik programu.
	 * 
	 * @param cennik  obiekt klasy Cennik przechowujący pręty do kupienia
	 * @param projekt obiekt klasy ProjektBudowy przechowujący dane o projekcie
	 * @return obiekt klasy Wynik będący wynikiem działania programu
	 */
	public abstract Wynik oblicz(Cennik cennik, ProjektBudowy projekt);

}
