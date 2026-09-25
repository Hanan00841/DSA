package infor;

import java.util.*;

public class FindMissingNumberFromRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		//SORTING THE ARRAY 
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int smallest = arr[0];
		int missing = 0;
		//Going in sequence starting from the smallest and checking if anything is missed
		int j = smallest;
		for (int i = 0; i < n; i++) {
			if (arr[i] != j) {
				missing = j;
				break;
			}
			j++;
		}
		//If nothing was missing in the sequence
		if (j >= n) {
			if (smallest != 0) {
				missing = 0;
			} else {
				missing = n;
			}
		}
		System.out.println("The missing number is:" + missing);

	}

}
