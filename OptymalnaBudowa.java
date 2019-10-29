package optymalnaBudowa;

import java.util.Scanner;

/**
 * Klasa zawierająca metodę main oraz metody wczytujące dane ze standardowego
 * wejścia.
 * 
 * @author Karol Soczewica
 * @version 2019.04.26
 */
public class OptymalnaBudowa {
	/**
	 * Metoda wczytująca z napisu obiekt klasy Pręt. Przyjmuje jako parametr napis,
	 * następnie dzieli go według spacji tworząc tablicę typu String przechowującą
	 * dane. Tworzy nowy obiekt klasy Pręt, który później daje jako wynik.
	 * 
	 * @param wiersz napis typu String zwierający reprezentację obiektu klasy Pręt
	 * @return nowoutworzony obiekt klasy Pręt o wartościach podanych jako parametr
	 */
	private static Pręt wczytajPręt(String wiersz) {
		String[] podzielWiersz = wiersz.split(" ");
		int długość = Integer.parseInt(podzielWiersz[0]);
		int cena = Integer.parseInt(podzielWiersz[1]);
		Pręt p = new Pręt(długość, cena);
		return p;
	}

	/**
	 * Metoda wczytująca obiekt klasy Cennik ze standardowego wejścia. Przyjmuje
	 * jako parametr skaner, a następnie wczytuje liczbę całkowitą, świadczącą o
	 * liczbie prętów do wczytania. Potem wczytując kolejne wiersze wywołuje metodę
	 * wczytującą pojedyncze pręty.
	 * 
	 * @param wiersze obiekt typu Scanner wczytujący ze standardowego wejścia
	 * @return nowoutworzony obiekt klasy Cennik o wczytanych ze standardowego
	 *         wejścia wartościach
	 */
	private static Cennik wczytajCennik(Scanner wiersze) {
		String wiersz = wiersze.nextLine();
		int rozmiar = Integer.parseInt(wiersz);
		int i = 0;
		Cennik cennik = new Cennik(rozmiar);
		while (i < rozmiar) {
			wiersz = wiersze.nextLine();
			cennik.dodajPręt(wczytajPręt(wiersz));
			i++;
		}
		return cennik;
	}

	/**
	 * Metoda wczytująca projekt budowy ze standardowego wejścia. Przyjmuje jako
	 * parametr skaner, następnie wczytuje liczbę całkowitą, świadczącą o liczbie
	 * elementów w następnym wierszu. Wczytuje następny wiersz, z którego wczytuje
	 * po kolei dane do projektu budowy.
	 * 
	 * @param wiersze obiekt typu Scanner wczytujący ze standardowego wejścia.
	 * @return nowoutworzony obiekt klasy ProjektBudowy o wczytanych ze
	 *         standardowego wejścia wartościach
	 */
	private static ProjektBudowy wczytajProjektBudowy(Scanner wiersze) {
		String wiersz = wiersze.nextLine();
		int rozmiar = Integer.parseInt(wiersz);
		int odcinek;
		ProjektBudowy projekt = new ProjektBudowy(rozmiar);
		wiersz = wiersze.nextLine();
		String[] podzielLinie = wiersz.split(" ");
		for (int i = 0; i < podzielLinie.length; i++) {
			odcinek = Integer.parseInt(podzielLinie[i]);
			projekt.dodajOdcinek(odcinek);
		}
		return projekt;
	}

	/**
	 * Metoda wczytująca strategię ze standardowego wejścia. Przyjmuje jako parametr
	 * skaner, następnie wczytuje napis. Wybiera strategię zgodnie ze wczytanym
	 * napisem.
	 * 
	 * @param wiersze obiekt typu Scanner wczytujący ze standardowego wejścia.
	 * @return nowoutworzony obiekt podklasy klasy Strategia zgodny z wczytanym ze
	 *         standardowego wejścia napisem
	 */
	private static Strategia wczytajStrategię(Scanner wiersze) {
		String nazwa = wiersze.nextLine();
		Strategia strategia = null;
		if (nazwa.equals("minimalistyczna")) {
			strategia = new Minimalistyczna();
		} else if (nazwa.equals("maksymalistyczna")) {
			strategia = new Maksymalistyczna();
		}
		return strategia;
	}

	/**
	 * Metoda main. W mainie tworzony jest obiekt typu Scanner wczytujący ze
	 * standardowego wejścia, następnie wywoływane są metody odpowiadające za
	 * wczytywanie danych.
	 * 
	 * @param args tablica napisów przekazywana podczas uruchamiania programu
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) {
		Scanner wiersze = new Scanner(System.in);
		Cennik cennik = wczytajCennik(wiersze);
		ProjektBudowy projekt = wczytajProjektBudowy(wiersze);
		Strategia strategia = wczytajStrategię(wiersze);
		Wynik w = strategia.oblicz(cennik, projekt);
		System.out.print(w.toString());
	}

}
