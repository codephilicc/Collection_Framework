package practice;

import java.util.HashSet;
import java.util.Set;

public class removeduplicateelementfromarray {

	static int removeduplicates(int arr1[], int n) {

		if (n == 0 || n == 1)
			return n;

		Set<Integer> uniqueElements = new HashSet<>();

		for (int i = 0; i < n; i++) {
			uniqueElements.add(arr1[i]);
		}

		int index = 0;

		for (int element : uniqueElements) {
			arr1[index++] = element;
		}

		
		return uniqueElements.size();

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };

		int n = arr.length;

		n = removeduplicates(arr, n);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
