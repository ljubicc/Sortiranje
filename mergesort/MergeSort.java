package mergesort;

public class MergeSort {

	public static void main(String[] args) {

		int[] niz = { 9, 3, 7, 5, 6, 4, 8, 2 };

		mergeSort(niz, 0, niz.length - 1);

		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

	}
	private static void mergeSort(int[] niz, int i, int j) {

		if (i < j) {
			int mid = (i + j) / 2;
			mergeSort(niz, i, mid);
			mergeSort(niz, mid + 1, j);
			merge(niz, i, mid, j);
		}
	}
	private static void merge(int[] niz, int low, int mid, int high) {

		int i = low;
		int j = mid + 1;
		int k = low;
		int[] b = new int[niz.length];

		while (i <= mid && j <= high) {
			if (niz[i] < niz[j]) {
				b[k] = niz[i];
				i++;
				k++;
			} else {
				b[k] = niz[j];
				j++;
				k++;
			}
		}
		while (i <= mid) {
			b[k] = niz[i];
			i++;
			k++;
		}
		while (j <= high) {
			b[k] = niz[j];
			j++;
			k++;
		}
		for (int l = low; l <= high; l++) {
			niz[l] = b[l];
		}
	}

}
