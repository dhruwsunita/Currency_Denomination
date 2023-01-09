package com.dsa.currencydenominations;

public class MergeSort {
	public void merge(int notes[], int left, int mid, int right) {
		int len1 = mid - left + 1;
		int len2 = right - mid;

		int leftArr[] = new int[len1];
		int rightArr[] = new int[len2];

		for (int i = 0; i < len1; i++) {
			leftArr[i] = notes[left + i];
		}
		for (int j = 0; j < len2; j++) {
			rightArr[j] = notes[mid + 1 + j];
		}
		int i, j, k;
		i = 0;
		j = 0;
		k = left;

		while (i < len1 && j < len2) {
			if (leftArr[i] >= rightArr[j]) {
				notes[k] = leftArr[i];
				i++;
			} else {
				notes[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while (i < len1) {
			notes[k] = leftArr[i];
			i++;
			k++;
		}
		while (j < len2) {
			notes[k] = rightArr[j];
			j++;
			k++;
		}
	}

	public void mergeSort(int notes[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(notes, left, mid);
			mergeSort(notes, mid + 1, right);

			merge(notes, left, mid, right);
		}
	}

}
