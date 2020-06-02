package Backjoon;

import java.util.Scanner;

public class b2875 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int answer = N/2 < M ? N/2 : M;
		
		K -= N + M - answer * 3;
		while(K > 0) {
			K -= 3;
			answer--;
		}
		System.out.println(answer);
	}
}
