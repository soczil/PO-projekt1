package optymalnaBudowa;

import java.util.Arrays;

/**
 * Klasa reprezentująca kupiony pręt. Dziedziczy z klasy Pręt.
 * 
 * @author Karol Soczewica
 * @version 2019.04.26
 */
public class KupionyPręt extends Pręt {
	/**
	 * Całkowita liczba przechowująca liczbę odcinków, na które został podzielony
	 * pręt.
	 */
	private int liczbaOdcinków;
	/**
	 * Tablica liczb całkowitych zawierająca odcinki, na które został podzielony
	 * pręt.
	 */
	private int[] odcinki;

	/**
	 * MNOŻNIK i DZIELNIK są wykorzystywane przy obliczaniu nowego rozmiaru tablicy.
	 */
	private static final int MNOŻNIK = 3;
	private static final int DZIELNIK = 2;

	/**
	 * Trójargumentowy konstruktor klasy KupionyPręt. Wywołuje konstruktor z
	 * nadklasy od parametrów długość oraz cena.
	 * 
	 * @param długość        liczba całkowita określająca długość pręta
	 * @param cena           liczba całkowita określająca cenę pręta
	 * @param liczbaOdcinków liczba całkowita określająca liczbę odcinków
	 * @param odcinki        tablica liczb całkowitych przechowująca odcinki
	 */
	public KupionyPręt(int długość, int cena, int liczbaOdcinków, int[] odcinki) {
		super(długość, cena);
		this.liczbaOdcinków = liczbaOdcinków;
		this.odcinki = odcinki;
	}

	/**
	 * Daje w wyniku napisową reprezentację obiektu klasy KupionyPręt.
	 */
	public String toString() {
		String s = super.toString();
		s += "\nliczba odcinków: " + liczbaOdcinków + "\n";
		s += "odcinki:";
		for (int i = 0; i < liczbaOdcinków; i++) {
			s += " " + odcinki[i];
		}
		return s;
	}

	/**
	 * Metoda zwiększająca parametr.
	 * 
	 * @param x liczba całkowita
	 * @return powiększona liczba całkowita
	 */
	private static int wiekszyRozmiar(int x) {
		return x * MNOŻNIK / DZIELNIK + 1;
	}

	/**
	 * Metoda zwiększająca rozmiar tablicy liczb całkowitych.
	 * 
	 * @param a tablica liczb całkowitych
	 * @return tablica liczb całkowitych o większym rozmiarze
	 */
	private static int[] powiekszTablice(int a[]) {
		int[] b;
		b = Arrays.copyOf(a, wiekszyRozmiar(a.length));
		return b;
	}

	/**
	 * Dodaje element do tablicy odcinków. Dodaje element podany jako parametr do
	 * tablicy odcinków, a następnie zwiększa liczbę odcinków o jeden.
	 * 
	 * @param x liczba całkowita, którą metoda doda do tablicy
	 */
	public void dodajElement(int x) {
		if (liczbaOdcinków == odcinki.length) {
			odcinki = powiekszTablice(odcinki);
		}
		odcinki[liczbaOdcinków] = x;
		liczbaOdcinków += 1;
	}

	/**
	 * Akcesor, daje w wyniku wartość atrybutu liczbaOdcinków.
	 * 
	 * @return liczba całkowita
	 */
	public int liczbaOdcinkow() {
		return liczbaOdcinków;
	}

	/**
	 * Akcesor, daje w wyniku wartość atrybutu odcinki.
	 * 
	 * @return tablica liczb całkowitych
	 */
	public int[] odcinki() {
		return odcinki;
	}

}
