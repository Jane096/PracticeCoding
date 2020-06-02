package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b11399 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     int N = scan.nextInt();
	     int[] p = new int[N];
	     int answer = 0;

	     for(int k=0; k<N; k++) {
	         p[k] = scan.nextInt();
	     }
	     
	     Arrays.sort(p);
	     
	     for(int j=0; j<N; j++) {
	    	 if(j > 0 && j < N) {
	    		 p[j] += p[j-1];
	    	 }
	         answer += p[j];
	     }
	     System.out.println(answer);
	 }
}

