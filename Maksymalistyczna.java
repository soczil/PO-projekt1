package optymalnaBudowa;

/**
 * Klasa odpowiada za strategię maksymalistyczną. Dziedziczy z klady Zachłanna.
 * 
 * @author Karol Soczewica
 * @version 2019.04.26
 */
public class Maksymalistyczna extends Zachłanna {
	/**
	 * Konstruktor klasy Maksymalistyczna.
	 */
	public Maksymalistyczna() {
		super();
	}

	/**
	 * Nadpisana metoda z klasy Zachłanna, dająca w wyniku pręt do zakupienia.
	 * Metoda wybiera ostatni z dostępnych w cenniku pręt, a następnie daje w wyniku
	 * nowoutworzony obiekt klasy KupionyPręt.
	 */
	@Override
	protected KupionyPręt wybierzPręt(int długość, Cennik cennik) {
		Pręt p = cennik.pręty()[cennik.liczbaPrętów() - 1];
		return new KupionyPręt(p.długość(), p.cena(), 0, new int[0]);
	}

}
