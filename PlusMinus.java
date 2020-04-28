import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double plusCount = 0, minusCount=0, zeroCount = 0;
        int length = arr.length;

        for(int i=0; i<length; i++) {
            if(arr[i] < 0) {
                minusCount++;
            }else if(arr[i] == 0) {
                zeroCount++;
            }else if(arr[i] > 0) {
                plusCount++;
            }
        }
        double result1 = Math.round((plusCount / length)*1000000)/1000000.0;
        double result2 = Math.round((minusCount / length)*1000000)/1000000.0;
        double result3 = Math.round((zeroCount / length)*1000000)/1000000.0;

        System.out.print(result1+"\n"+result2+"\n"+result3);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
