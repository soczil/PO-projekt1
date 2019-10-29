package optymalnaBudowa;

/**
 * Klasa odpowiadająca za reprezentację Pręta. Nadklasa klasy KupionyPręt.
 * 
 * @author Karol Soczewica
 * @version 2019.04.26
 */
public class Pręt {
	/**
	 * Liczba całkowita przechowująca długość pręta.
	 */
	private int długość;
	/**
	 * Liczba całkowita przechowująca cenę pręta.
	 */
	private int cena;

	/**
	 * Dwuparametrowy konstruktor klasy Pręt.
	 * 
	 * @param długość liczba całkowita reprezentująca długość pręta
	 * @param cena    liczba całkowita reprezentująca cenę pręta
	 */
	public Pręt(int długość, int cena) {
		this.długość = długość;
		this.cena = cena;
	}

	/**
	 * Daje w wyniku napisową reprezentację obiektu klasy Pręt.
	 */
	@Override
	public String toString() {
		return "długość: " + długość + " cena: " + cena;
	}

	/**
	 * Akcesor, daje w wyniku wartość atrybutu długość.
	 * 
	 * @return liczba całkowita
	 */
	public int długość() {
		return długość;
	}

	/**
	 * Akcesor, daje w wyniku wartość atrybutu cena.
	 * 
	 * @return liczba całkowita
	 */
	public int cena() {
		return cena;
	}
}
