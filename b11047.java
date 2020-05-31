package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b11047 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] money = new int[N];
        int K = sc.nextInt();
        int answer = 0;
        
        for(int i=0; i<N; i++) {
            money[i] = sc.nextInt();
        }
        Arrays.sort(money);
        
        for(int i=money.length-1; i>0; i--) {
            if(money[i] <= K) {
                answer += K / money[i];
                System.out.println("과정: "+answer);
                K %= money[i];
                System.out.println("K값: "+K);
            }
        }
      System.out.println(answer);
    }
}
