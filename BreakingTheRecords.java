package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BreakingTheRecords {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
    	
    	//index 0이 기준점 -> 기준보다 다음이 크면 maxcount++ 반대는 mincount++ -> score 기준 업데이트 -> 반복 -> answer[] 리턴 
        int maxScore = scores[0], minScore = scores[0];
        int minCount = 0, maxCount = 0;
        int[] answer = new int[2];

        for(int i=1; i<scores.length; i++) {
            if(scores[i] < minScore) {
                minCount++;
                minScore = scores[i];
            }
            if(scores[i] > maxScore) {
                maxCount++;
                maxScore = scores[i];
            }
        }
        answer[0] = maxCount;
        answer[1] = minCount;
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

