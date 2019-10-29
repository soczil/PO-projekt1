package optymalnaBudowa;

/**
 * Klasa odpowiada za strategię minimalistyczną. Dziedziczy z klasy zachłanna.
 * 
 * @author Karol Soczewica
 * @version 2019.04.26
 */
public class Minimalistyczna extends Zachłanna {
	/**
	 * Konstruktor klasy Minimalistyczna.
	 */
	public Minimalistyczna() {
		super();
	}

	/**
	 * Nadpisana metoda z klasy Zachłanna, dająca w wyniku pręt do zakupienia.
	 * Metoda wybiera z cennika najkrótszy pręt, w którym mieści się najdłuższy
	 * brakujący odcinek, a następnie daje w wyniku nowoutworzony obiekt klasy
	 * KupionyPręt.
	 */
	@Override
	protected KupionyPręt wybierzPręt(int długość, Cennik cennik) {
		Pręt p;
		for (int i = 0; i < cennik.liczbaPrętów(); i++) {
			p = cennik.pręty()[i];
			if (p.długość() >= długość) {
				return new KupionyPręt(p.długość(), p.cena(), 0, new int[0]);
			}
		}
		return null;
	}

}
