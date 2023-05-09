package bubblesort;

/*
 *  Bubble sort poredi dva susedna clana niza i uredjuje ih (vrsi zamenu mesta clanova)
 *  u skladu sa vrstom sortiranja (opadajuce ili rastuce), krecuci se pri tome kroz niz, 
 *  postavljajuci odgovarajucu vrednost na kraj niza
 */

public class BubbleSort {

	public static void main(String[] args) {

		// primer niza
		char[] niz = { 'Z', 'C', 'I', 'R', 'A' };

		// krecemo se od prvog do pretposlednjeg clana niza
		for (int i = 0; i < niz.length - 1; i++) {

			// uvodimo logicku promenljivu
			boolean uredjen = true;
			// dodavanjem (- i) u uslovu smanjujemo kretanje kroz niz, jer najvecu vrednost
			// stavljamo na kraj
			// u slucaju rastuceg (ne opadajuceg) uredjivanja niza
			for (int j = 0; j < niz.length - 1 - i; j++) {
				// poredimo dva susedna clana niza,
				// ako je uslov ispunjen menjamo im mesta
				if (niz[j] > niz[j + 1]) {
					char pom = niz[j];
					niz[j] = niz[j + 1];
					niz[j + 1] = pom;
					uredjen = false;
				}
			}
			// proverom stanja logicke promenljive
			// smanjujemo broj iteracija u slucaju da je jedan deo niza vec uredjen,
			// odnosno nema potrebe da se dalje krecemo kroz niz ( i++ )
			// u slucaju vec uredjenog niza procicemo samo jednom kroz niz,
			// dok bih bez logicke promenljive prosli n - 1 puta. (broj clanova - 1)
			if (uredjen) {
				break;
			}
		}
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

}
