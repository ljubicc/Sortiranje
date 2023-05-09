package selectionsort;

/*
 *  sortiranje niza celih brojeva metodom SELECTION SORT
 */

public class SelectionSort {

	public static void main(String[] args) {

		// primer niza celih brojeva
		int[] niz = { 7, 3, 6, 2, 9, 10, 8, 5, 1 };

		// prvom for petljom krecemo se od prvog do pretposlednjeg elementa niza
		// broj iteracija kroz prvu for petlju je n-1 (u ovom primeru 8 iteracija)
		for (int i = 0; i < niz.length - 1; i++) {
			// smestamo index u promenljivu min
			int min = i;
			// drugom for petljom krecemo se kroz ne sortirani (ne uredjeni) deo niza
			// od indeksa (mesta) posle i do poslednjeg indeksa (mesta) u nizu
			for (int j = i + 1; j < niz.length; j++) {

				// trazimo index najmanjeg clana i smestamo index u promenljivu min
				if (niz[j] < niz[min]) {
					min = j;
				}
			}
			// kada smo pronasli index najmenjeg clana, vrsimo zamenu mesta clanova niza
			if (min != i) {
				int pom = niz[i];
				niz[i] = niz[min];
				niz[min] = pom;
			}
		}
		// stampanje sortiranog niza
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		// uredjeni niz u ovom primeru izgeleda ovako 1 2 3 5 6 7 8 9 10
	}
}
