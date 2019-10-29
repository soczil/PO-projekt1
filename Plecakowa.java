package optymalnaBudowa;

/**
 * Abstrakcyjna nadklasa klas obliczających wynik programu dla strategii
 * ekonomicznej oraz ekologicznej. Dziedziczy z klasy Strategia.
 * 
 * @author Karol Soczewica
 * @version 2019.04.26
 */
public abstract class Plecakowa extends Strategia {
	/**
	 * Konstruktor klasy Plecakowa.
	 */
	public Plecakowa() {
		super();
	}

	/**
	 * Odziedziczona z klasy Strategia metoda obliczająca wynik programu.
	 */
	@Override
	public Wynik oblicz(Cennik cennik, ProjektBudowy projekt) {

		return null;
	}

}
