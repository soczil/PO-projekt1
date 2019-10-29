package optymalnaBudowa;

import java.util.Arrays;

/**
 * Abstrakcyjna nadklasa klas obliczających wynik programu dla strategii
 * minimalistycznej oraz maksymalistycznej. Dziedziczy z klasy Strategia.
 * 
 * @author Karol Soczewica
 * @version 2019.04.26
 */
public abstract class Zachłanna extends Strategia {
	/**
	 * Konstruktor klasy Zachłanna.
	 */
	public Zachłanna() {
		super();
	}

	/**
	 * Abstrakcyjna metoda wybierająca pręt do zakupu. Metoda przyjmuje jako
	 * parametry długość odcinka oraz cennik przechowujący obiekty typu Pręt.
	 * 
	 * @param długość całkowita liczba reprezentująca długość odcinka
	 * @param cennik  obiekt klasy Cennik przechowujący pręty do kupienia
	 * @return obiekt klasy KupionyPręt
	 */
	protected abstract KupionyPręt wybierzPręt(int długość, Cennik cennik);

	/**
	 * Metoda obliczająca wynik programu dla strategii minimalistycznej oraz
	 * maksymalistycznej. Tworzy nową tablicę odcinków, którą przekopiowuje z
	 * tablicy odcinków projektu. Następnie dopóki jakieś odcinki są jeszcze
	 * dostępne, próbuje je odciąć od reszty pozostałej po odcięciu poprzednich
	 * odcinków. Po odcięciu odcinka dodaje ten odcinek do tablicy w klasie
	 * KupionyPręt oraz zeruje jego miejsce w tablicy odcinków. Gdy w reszcie nie ma
	 * miejsca na następne odcinki, wywoływana jest funkcja dająca w wyniku pręt do
	 * kupienia. Metoda konczy się, gdy w tablicy odcinków są same zera. Daje w
	 * wyniku nowoutworzony obiekt klasy Wynik zawierający odpowiedni koszt, odpady
	 * oraz tablicę kupionych prętów.
	 */
	@Override
	public Wynik oblicz(Cennik cennik, ProjektBudowy projekt) {
		KupionyPręt kupiony;
		int i, j = 0;
		int koszt = 0, odpady = 0, reszta = 0;
		boolean koniec = false;
		int[] długości = Arrays.copyOf(projekt.długośćOdcinka(), projekt.liczbaOdcinków());
		KupionyPręt[] kupionePręty = new KupionyPręt[projekt.liczbaOdcinków()];

		while (!koniec) {
			i = projekt.liczbaOdcinków() - 1;
			while ((i >= 0) && (długości[i] == 0)) {
				i--;
			}
			if (i >= 0) {
				kupiony = wybierzPręt(długości[i], cennik);
				koszt += kupiony.cena();
				reszta = kupiony.długość();
				while (i >= 0) {
					if ((długości[i] > 0) && (długości[i] <= reszta)) {
						reszta -= długości[i];
						kupiony.dodajElement(długości[i]);
						długości[i] = 0;
					}
					i--;
				}
				odpady += reszta;
				kupionePręty[j] = kupiony;
				j++;
			} else {
				koniec = true;
			}
		}
		return new Wynik(koszt, odpady, kupionePręty);
	}

}
