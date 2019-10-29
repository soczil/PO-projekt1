package optymalnaBudowa;

/**
 * Klasa odpowiadająca za reprezentację projektu budowy.
 * 
 * @author Karol Soczewica
 * @version 2019.04.26
 */
public class ProjektBudowy {
	/**
	 * Liczba całkowita przechowująca liczbę odcinków w projekcie.
	 */
	private int liczbaOdcinków;
	/**
	 * Tablica liczb całkowitych przechowująca długości odcinków w projekcie.
	 */
	private int[] długośćOdcinka;

	/**
	 * Dwuparametrowy konstruktor klasy ProjektBudowy.
	 * 
	 * @param liczbaPrętów   liczba całkowita reprezentująca liczbę prętów
	 * @param długośćOdcinka tablica liczb całkowitych zawierająca długości odcinków
	 */
	public ProjektBudowy(int liczbaPrętów, int[] długośćOdcinka) {
		this.liczbaOdcinków = liczbaPrętów;
		this.długośćOdcinka = długośćOdcinka;
	}

	/**
	 * Jednoparametrowy konstruktor klasy ProjektBudowy. Wywołuje konstruktor
	 * dwuargumentowy od zera oraz nowoutworzonej tablicy rozmiaru podanego jako
	 * parametr.
	 * 
	 * @param rozmiarTablicy liczba całkowita reprezentująca długość tablicy
	 */
	public ProjektBudowy(int rozmiarTablicy) {
		this(0, new int[rozmiarTablicy]);
	}

	/**
	 * Daje w wyniku napisową reprezentację obiektu klasy ProjektBudowy.
	 */
	@Override
	public String toString() {
		String s = "liczba odcinków: " + liczbaOdcinków + "\n";
		s += "odcinki: ";
		for (int i = 0; i < liczbaOdcinków; i++) {
			s += długośćOdcinka[i] + " ";
		}
		return s;
	}

	/**
	 * Akcesor, daje w wyniku wartość atrybutu liczbaOdcinków.
	 * 
	 * @return liczba całkowita
	 */
	public int liczbaOdcinków() {
		return liczbaOdcinków;
	}

	/**
	 * Akcesor, daje w wyniku wartość atrybutu długościOdcinka.
	 * 
	 * @return tablica liczb całkowitych
	 */
	public int[] długośćOdcinka() {
		return długośćOdcinka;
	}

	/**
	 * Dodaje długość odcinka do tablicy odcinków. Dodaje długość podaną jako
	 * parametr do tablicy długości odcinków, a następnie zwiększa liczbę odcinków o
	 * jeden.
	 * 
	 * @param odcinek liczba całkowita
	 */
	public void dodajOdcinek(int odcinek) {
		długośćOdcinka[liczbaOdcinków] = odcinek;
		liczbaOdcinków += 1;
	}

}
