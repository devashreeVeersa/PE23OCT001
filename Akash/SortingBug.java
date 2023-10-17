package javaEx;

public class SortingBug {

	public static void main(String[] args) {
		int[] array = { 4, 2, 7, 1, 9, 3, 6 };
		sortArray(array);
		System.out.println("Sorted Array: ");
		for (int value : array) {
			System.out.print(value + " ");
		}
	}

	public static void sortArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
