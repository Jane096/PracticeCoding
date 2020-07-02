package backjoon_test;

import java.util.Scanner;

public class b1026 {
	public static void quickSort(int[] arr, int s, int e) {
		int start = s;
		int end = e;
		int pivot = arr[(start + end) / 2];

		while (start <= end) {
			while (arr[start] < pivot)
				start++;
			while (arr[end] > pivot)
				end--;
			if (start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		if (s < end)
			quickSort(arr, s, end);
		if (e > start)
			quickSort(arr, start, e);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int num = sc.nextInt();
		int[] a = new int[num];
		int[] b = new int[num];

		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			b[i] = sc.nextInt();
		}
		quickSort(a, 0, a.length - 1);
		quickSort(b, 0, b.length - 1);

		for (int i = 0; i < num; i++) {
			answer += b[i] * a[(num - 1) - i];
		}

		System.out.println(answer);
	}
}
